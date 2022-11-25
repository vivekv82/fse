package skilltracker.fse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import skilltracker.fse.dto.EngineerSkillProfile;

public interface SkillsRepository extends JpaRepository {
	
	public default void fetchProfile(String id) {
	}

	public default void addProfile(EngineerSkillProfile newProfile) {
	}
	
	public default void updateProfile(EngineerSkillProfile updatedProfile) {
		
	}

}
