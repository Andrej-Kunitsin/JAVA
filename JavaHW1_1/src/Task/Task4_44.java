package Task;

import java.math.BigDecimal;
//даны три вещественных числа a,b,c. 
//Определить имееться ли среди них хотябы одна пара равных между собой чисел 
public class Task4_44
{
	public static boolean getBool(double a, double b, double c)
	{
		BigDecimal aB = BigDecimal.valueOf(a);
		BigDecimal bB = BigDecimal.valueOf(b);
		BigDecimal cB = BigDecimal.valueOf(c);
		boolean res = false;
		if (aB.compareTo(bB) == 0)
			return true;
		if (aB.compareTo(cB) == 0)
			return true;
		if (bB.compareTo(cB) == 0)
			return true;
		return res;
	}

}
