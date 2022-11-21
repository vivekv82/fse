package skilltracker.fse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skilltracker.fse.dao.SkillsRepository;
import skilltracker.fse.dto.EngineerSkillProfile;

@Service
public class SkillsService {
	
	@Autowired(required=true)
	private SkillsRepository skillsRepository;
	
	public void fetchProfile(String id) {
	}

	public void addProfile(EngineerSkillProfile newProfile) {
		//this.skillsRepository.addProfile(newProfile);
	}
	
	public void updateProfile(EngineerSkillProfile updatedProfile) {
		//this.skillsRepository.updateProfile(updatedProfile);
	}
}
