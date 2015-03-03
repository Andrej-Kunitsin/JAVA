package comporators;

import java.util.Comparator;

import api.Person;

public class PersonById implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int ret = 0;
		if (p1.getId() == p2.getId()) {
			return ret;
		} else if (p1.getId() > p2.getId()) {
			ret = 1;
		} else {
			ret = -1;
		}
		return ret;
	}
}
