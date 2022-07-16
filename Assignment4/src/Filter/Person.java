package Filter;
/**
 * Date: July 16 2022
 * Class that is a representation of a Person.
 * @author Shannon
 *
 */
public class Person {
	
	private String name;
	private String gender;
	private String maritalStatus;
	
	/**
	 * Constructor for Person.
	 * @param name the persons name
	 * @param gender the persons gender
	 * @param maritalStatus the persons marital status
	 */ 
	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	
	/**
	 * Getter for name.
	 * @return string name of the person
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter for gender.
	 * @return string gender of the person
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Getter for marital status.
	 * @return string marital status of the person
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	
	public boolean equals(Person person) {
		if(this.name.equals(person.getName()) && this.gender.equals(person.getGender()) && this.maritalStatus.equals(person.getMaritalStatus()) ) {
			return true;
		}else {
			return false;
		}
		
	}
	
	

}
