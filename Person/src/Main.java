import java.util.Arrays;

import arrays2.Arrays2;

public class Main
{
	static public Person[] pp = new Person[7];

	public static void main(String[] args)
	{
		pp[0] = new Person(1, "NewVasya1", "NewPupkin1", 20);
		pp[1] = new Person(11, "NewVasya11", "NewPupkin11", 18);
		pp[2] = new Person(9, "NewVasya9", "NewPupkin9", 100);
		pp[3] = new Person(6, "NewVasya6", "NewPupkiko", 25);
		pp[4] = new Person(10, "NewVasya10", "NewPupkin10", 24);
		pp[5] = new Person(20, "NewVasya20", "NewPupkin20", 17);
		pp[6] = new Person(4, "NewVasya4", "NewPupkin4", 66);
		// sortId(pp);
		// sortAgeInDecreasing(pp);
		// printToAgeOver65();
		Person[] test = getLNamesKO();
		for (Person p : test)
		{
			System.out.println(p.toString());
		}
	}

	static void sortId()
	{
		Arrays2 arrays = new Arrays2();
		Person[] temp = new Person[pp.length];
		int[] tempId = new int[pp.length];
		for (int i = 0; i < tempId.length; i++)
		{
			tempId[i] = pp[i].getId();
		}
		tempId = arrays.getSortBubble(tempId);
		for (int i = 0; i < tempId.length; i++)
		{
			for (int j = 0; j < pp.length; j++)
			{
				if (tempId[i] == pp[j].getId())
				{
					temp[i] = pp[j];
					break;
				}
			}
		}
		pp = temp;
	}

	static void sortAgeInDecreasing()
	{
		Arrays2 arrays = new Arrays2();
		Person[] temp = new Person[pp.length];
		int[] tempAr = new int[pp.length];
		for (int i = 0; i < tempAr.length; i++)
		{
			tempAr[i] = pp[i].getAge();
		}
		tempAr = arrays.getSortBubble(tempAr);
		tempAr = arrays.getReversArr(tempAr);
		for (int i = 0; i < tempAr.length; i++)
		{
			for (int j = 0; j < pp.length; j++)
			{
				if (tempAr[i] == pp[j].getAge())
				{
					temp[i] = pp[j];
					break;
				}
			}
		}
		pp = temp;
	}

	static void sortLName()
	{
		String[] tempAr = new String[pp.length];
		Person[] temp = new Person[pp.length];
		for (int i = 0; i < tempAr.length; i++)
		{
			tempAr[i] = pp[i].getLName();
		}
		Arrays.sort(tempAr);
		for (int i = 0; i < tempAr.length; i++)
		{
			for (int j = 0; j < pp.length; j++)
			{
				if (tempAr[i].equals(pp[j].getLName()))
				{
					temp[i] = pp[j];
					break;
				}
			}
		}
		pp = temp;
	}

	static public void printToAgeOver65()
	{
		for (Person p : pp)
		{
			if (p.getAge() > 65)
			{
				System.out.println(p.toString());
			}
		}
	}

	static public Person[] getLNamesKO()
	{
		Person[] resTemp = new Person[pp.length];
		int count = 0;
		for (Person p : pp)
		{
			if (p.getLName().endsWith("ko"))
			{
				resTemp[count++] = p;
			}
		}
		Person[] res = new Person[count];
		while (count != 0)
		{
			count--;
			res[count] = resTemp[count];

		}
		return res;
	}

}