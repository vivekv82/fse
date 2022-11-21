package skilltracker.fse.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import skilltracker.fse.dto.EngineerSkillProfile;

@Service
public class SkillsService {
	
	public void fetchProfile(String id) {
	}

	public void addProfile(@RequestBody EngineerSkillProfile newProfile) {
	}
	
	public void updateProfile(@RequestBody EngineerSkillProfile updatedProfile) {
		
	}
}
