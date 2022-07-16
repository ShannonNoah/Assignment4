package Filter;

import java.util.List;

/**
 * 
 * Date: July 16 2022
 * Concrete class AndCriteria that implements interface Criteria.
 * @author Shannon
 *
 */
public class AndCriteria implements Criteria{
	
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	/**
	 * Constructor for AndCriteria
	 * @param criteria first criteria
	 * @param otherCriteria second criteria
	 */
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
		
	}

	/**
	 * Method to check if persons meet criteria.
	 * @param persons list of persons to be checked
	 * @return List<Person> persons that have met criteria
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
