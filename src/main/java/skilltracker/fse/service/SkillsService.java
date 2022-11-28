package skilltracker.fse.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import skilltracker.fse.dao.SkillsRepository;
import skilltracker.fse.dto.EngineerSkillProfile;
import skilltracker.fse.entity.SkillProfile;

@Service
@CacheConfig(cacheNames = "skills-cache")
public class SkillsService {

	@Autowired
	private SkillsRepository skillsRepository;

	@Cacheable
	public List<SkillProfile> fetchProfile(String associateId) {
		SkillProfile skillProfile = this.skillsRepository.fetchProfile(associateId);
		return skillProfile == null ? new ArrayList<SkillProfile>() : this.processOutput(skillProfile);
	}
	
	public List<SkillProfile> fetchAllProfiles() {
		return this.skillsRepository.fetchAllProfiles();
	}

	public void addProfile(EngineerSkillProfile newProfile) {
		this.skillsRepository.addProfile(newProfile);
	}
	 
	@CachePut(key = "#associateId")
	public void updateProfile(String associateId, EngineerSkillProfile updatedProfile) {
		this.skillsRepository.updateProfile(updatedProfile);
	}
	
	private List<SkillProfile> processOutput(SkillProfile skillProfile) {
		List<SkillProfile> result = new ArrayList<SkillProfile>();
		if (skillProfile != null)
		    result.add(skillProfile);
	    return result;
		
	}
}
