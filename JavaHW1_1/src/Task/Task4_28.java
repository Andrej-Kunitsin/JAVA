package Task;
//дано трехзначное число, 
//определить равен ли квадрат этого числа сумме кубов его чисел
public class Task4_28
{
	static boolean testCondition(int ch)
	{
		long square = 0;
		long sunCubNum = 0;
		if (ch > 99 && ch < 1000)
		{
			square = (long) ch * ch;
			sunCubNum = 0;
			for (int i = 0; i < 3; i++)
			{
				int q = ch % 10;
				sunCubNum += q * q * q;
				ch /= 10;
			}
		} else
			throw new IllegalArgumentException();
		return square == sunCubNum;
	}
}
