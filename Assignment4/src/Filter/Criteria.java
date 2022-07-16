package Filter;

import java.util.List;

/**
 * Date: July 16 2022
 * Interface Criteria that is implemented by concrete classes CriteriaMale, CriteriaFemale.
 * @author Shannon
 *
 */
public interface Criteria {

	public List<Person> meetCriteria(List<Person> persons);
}
