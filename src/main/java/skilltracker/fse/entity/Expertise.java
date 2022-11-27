package skilltracker.fse.entity;

//@Document(collection = "Expertise")
public class Expertise {

	private String skillName;

	private Integer skillExpertiseLevel;
	
	public Expertise(String skillName, Integer skillExpertiseLevel) {
		this.skillName = skillName;
		this.skillExpertiseLevel = skillExpertiseLevel;
	}


	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Integer getSkillExpertiseLevel() {
		return skillExpertiseLevel;
	}

	public void setSkillExpertiseLevel(Integer skillExpertiseLevel) {
		this.skillExpertiseLevel = skillExpertiseLevel;
	}

}
