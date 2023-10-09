package skilltracker.fse.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import skilltracker.fse.dto.EngineerSkillProfile;
import skilltracker.fse.entity.SkillProfile;
import org.springframework.data.domain.Example;

public interface SkillsRepository extends MongoRepository<SkillProfile, String> {

	public default List<SkillProfile> fetchProfile(EngineerSkillProfile searchProfile) {
		Example searchProfileExample = Example.of(SkillsRepository.getEntityFor(searchProfile));
		List<SkillProfile> results = (List<SkillProfile>) findAll(searchProfileExample);
		System.out.println("Find : " + results.size());
		return results;
	}
	
	public default SkillProfile fetchProfile(SkillProfile skillProfile) {
		String associateId = skillProfile.getAssociateId();
		findById(associateId).get();
		return findById(skillProfile.getAssociateId()).get();
	}
	
	public default List<SkillProfile> fetchAllProfiles() {
		return findAll();
	}

	public default void addProfile(EngineerSkillProfile newProfile) {
		boolean isSkillRecordPresent = isSkillRecordPresent(newProfile.getAssociateId());
		if (!isSkillRecordPresent) {
			insert(getEntityFor(newProfile));
		}
	}
	
	public default boolean isSkillRecordPresent(String associateID) {
		return existsById(associateID);
	}

	public default void updateProfile(EngineerSkillProfile updatedProfile) {
		boolean isSkillRecordPresent = isSkillRecordPresent(updatedProfile.getAssociateId());
		if (isSkillRecordPresent) {
			save(getEntityFor(updatedProfile));
		}
	}

	static SkillProfile getEntityFor(EngineerSkillProfile profile) {
		SkillProfile skillProfile = new SkillProfile(profile.getFirstName(), profile.getLastName(),
				profile.getAssociateId(), profile.getEmail(), profile.getMobile(), profile.getTechnicalSkillsList(), profile.getSoftSkillsList());
		return skillProfile;
	}

}
