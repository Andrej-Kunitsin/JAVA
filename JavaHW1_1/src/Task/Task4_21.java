package Task;
//дано натуральное число. Определить:
//являетсья ли оно четрым
//оканчиваеться ли оно цифрой 7
public class Task4_21
{
	static boolean testEven(int ch)
	{
		boolean even = false;
		if (ch % 2 == 0)
		{
			even = true;
		}
		return even;
	}

	static boolean testSeven(int ch)
	{
		boolean seven = false;
		if (ch % 10 == 7)
		{
			seven = true;
		}
		return seven;
	}

}
