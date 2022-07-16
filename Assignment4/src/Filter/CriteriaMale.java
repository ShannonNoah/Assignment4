package Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Date: July 16 2022
 * Concrete class CriteriaMale that implements interface Criteria.
 * @author Shannon
 *
 */
public class CriteriaMale implements Criteria{

	/**
	 *Method that filters out the persons that do not meet the criteria of being male.
	 *@param persons list of persons to be checked
	 *@return List<Person> list of persons that meet the criteria
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		
		for(Person person: persons) {
			if(person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		
		return malePersons;
		
	}

}
