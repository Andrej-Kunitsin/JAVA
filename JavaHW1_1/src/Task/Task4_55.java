package Task;
//Дано четерех значное число. Определить:
//Входит ли в него цифра 4
//Входит ли в него цифра b
public class Task4_55
{
	static boolean getBool4(int ch)
	{
		return getBoolb(ch, 4);
	}

	static boolean getBoolb(int ch, int b)
	{
		if (ch <= 999 || ch > 9999)
		{
			throw new IllegalArgumentException();
		}
		if (String.valueOf(b).length() > 1)
		{
			throw new IllegalArgumentException();
		}

		char testB = String.valueOf(b).charAt(0);
		char[] massChar = String.valueOf(ch).toCharArray();
		for (char oneChar : massChar)
		{
			if (oneChar == testB)
				return true;
		}
		return false;
	}

}
