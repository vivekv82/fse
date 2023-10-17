package skilltracker.fse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import skilltracker.fse.dao.SkillsRepository;
import skilltracker.fse.dto.EngineerSkillProfile;
import skilltracker.fse.service.SkillMQConsumer;

@Service
@Slf4j
public class SkillMQConsumerImpl implements SkillMQConsumer {

	@Autowired
	private SkillsRepository skillsRepository;

	@Value("${skill.queue}")
	private String queueName;

	@JmsListener(destination = "${skill.queue}")
	public void addProfile(EngineerSkillProfile newProfile) {
		System.out.println("newProfile from MQ = " + newProfile.toString());
		this.skillsRepository.addProfile(newProfile);
	}

}
