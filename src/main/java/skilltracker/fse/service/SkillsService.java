package skilltracker.fse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skilltracker.fse.dao.SkillsDAO;
import skilltracker.fse.dto.EngineerSkillProfile;

@Service
public class SkillsService {
	
	@Autowired(required=false)
	private SkillsDAO skillsDao;
	
	public void fetchProfile(String id) {
	}

	public void addProfile(EngineerSkillProfile newProfile) {
		//this.skillsDao.addProfile(newProfile);
	}
	
	public void updateProfile(EngineerSkillProfile updatedProfile) {
		//this.skillsDao.updateProfile(updatedProfile);
	}
}
