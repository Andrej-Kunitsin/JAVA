package work01032015;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		Person[] pp = new Person[7];
		pp[0] = new Person(8, "Aash1", "Solo1", 44);
		pp[1] = new Person(2, "2Dash1", "Solo1", 22);
		pp[2] = new Person(3, "3Dash1", "Solo1", 33);
		pp[3] = new Person(5, "4Dash1", "Solo1", 44);
		pp[4] = new Person(6, "5Dash1", "Solo1", 55);
		pp[5] = new Person(7, "6Dash1", "Solo1", 66);
		pp[6] = new Person(8, "7Dash1", "Solo1", 77);
		List<Person> list = Arrays.asList(pp);
		
		Collections.sort(list);
		System.out.println(Arrays.toString(pp));
		
	}
}
