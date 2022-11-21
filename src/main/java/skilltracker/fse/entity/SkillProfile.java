package skilltracker.fse.entity;

import java.util.List;

//@Entity
//@Table("SkillProfileDetails")
public class SkillProfile  {

	
	private String firstName;

	private String lastName;

	//@Id
    //@GeneratedValue
	//Primary Key
	private String associateId;

	private String mobile;
	
	private String email;
	
	private List<Expertise> skillsList;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Expertise> getSkillsList() {
		return skillsList;
	}

	public void setSkillsList(List<Expertise> skillsList) {
		this.skillsList = skillsList;
	}

}
