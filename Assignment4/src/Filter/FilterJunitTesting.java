package Filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FilterJunitTesting {

	@Test
	void test1() {
		
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Jane", "Female", "No"));
		persons.add(new Person("Bob", "Male", "No"));

		
		Criteria female = new CriteriaFemale();
		
		List<Person> actual = female.meetCriteria(persons);
		List<Person> expected = new ArrayList<Person>();
		
		expected.add(new Person("Jane", "Female", "No"));
		
		assertEquals(expected.get(0).getName(), actual.get(0).getName());
		
	}
	
	@Test
	void test2() {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Jane", "Female", "No"));
		persons.add(new Person("Bob", "Male", "No"));
		
		Criteria male = new CriteriaMale();
		
		List<Person> actual = male.meetCriteria(persons);
		List<Person> expected = new ArrayList<Person>();
		
		expected.add(new Person("Bob", "Male", "No"));
		
		assertEquals(expected.get(0).getName(), actual.get(0).getName());
		
		
		
	}

}
