package Task;

import java.util.HashSet;
import java.util.Set;
//Дано трехзначное число.
//а)Верно ли что все его цифры одинаковые
//б)определить есть ли среди его цифр одинаковые
public class Task4_30
{
	static boolean task4_30a(int ch)
	{
		if (ch < 100 || ch > 999)
			throw new IllegalArgumentException();
		int q = ch % 10;
		for (int i = 0; i < 3; i++)
		{
			if (q != ch % 10)
			{
				return false;
			}
			ch = ch / 10;
		}
		return true;
	}

	static boolean task4_30b(int ch)
	{
		if (ch < 100 || ch > 999)
			throw new IllegalArgumentException();
		Set<Integer> set = new HashSet<Integer>();
		int i = 3;
		while (true && i != 0)
		{
			if (set.add(ch % 10))
			{
				ch /= 10;
				i--;
			} else
			{
				return true;
			}
		}
		return false;
	}
}
