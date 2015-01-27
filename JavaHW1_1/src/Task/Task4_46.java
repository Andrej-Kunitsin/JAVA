package Task;
//определить являетья ли треугольник со сторонами абс равнобедренным
public class Task4_46
{
	static boolean getBool(int a, int b, int c)
	{
		boolean res = false;
		if (a == b || a == c || b == c)
			return true;
		return res;
	}

}
