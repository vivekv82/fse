package skilltracker.fse.entity;

//@Entity
//@Table("ExpertiseDetails")
public class Expertise {

	//Foreign Key
	private String associateId;
	
	private String skillName;
	
	private Integer skillExpertiseLevel;
	
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
