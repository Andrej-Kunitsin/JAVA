package comporators;

import java.util.Comparator;

import api.Person;

public class PersonByFName implements Comparator<Person>
{

	@Override
	public int compare(Person p1, Person p2)
	{

		return p1.getFName().compareTo(p2.getFName());
	}
}
