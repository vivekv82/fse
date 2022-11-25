package skilltracker.fse.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;

import lombok.Data;
import lombok.experimental.Builder;

//@Builder
//@Data
public class SkillsExpertise implements Serializable {

	private static final long serialVersionUID = -1264756693651108391L;
	
	//@NotNull
	//@NotBlank
	private String skillName;
	
	//@NotNull
	//@Min(value = 0)
	//@Max(value = 20)
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
