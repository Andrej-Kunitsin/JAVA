package comporators;

import java.util.Comparator;

import api.Person;

public class PersonByLName implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		return p1.getLName().compareTo(p2.getLName());
	}
}
