package Filter;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * Date: July 16 2022
 * Concrete class CriteriaFemale that implements interface Criteria.
 * @author Shannon
 *
 */
public class CriteriaFemale implements Criteria{

	/**
	 *Method that filters out the persons that do not meet the criteria of being female.
	 *@param persons list of persons to be checked
	 *@return List<Person> list of persons that meet the criteria
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		
		for(Person person: persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			} 
		}
		
		return femalePersons;
		
	}

}
