package skilltracker.fse.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ExpertiseDetails")
public class Expertise {

	// Foreign Key
	private String associateId;

	private String skillName;

	private Integer skillExpertiseLevel;

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}

	public Integer getSkillExpertiseLevel() {
		return skillExpertiseLevel;
	}

	public void setSkillExpertiseLevel(Integer skillExpertiseLevel) {
		this.skillExpertiseLevel = skillExpertiseLevel;
	}

}
