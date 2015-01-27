package function2;

public class Function
{
	public final static String[] massOne = { "ноль", "один", "два", "три",
			"четыре", "пять", "шесть", "семь", "восемь", "девять" };
	public final static String[] massDec = { "", "десять", "двадцать",
			"тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
			"восемьдесят", "девяносто" };
	public final static String[] massHundreds = { "", "сто", "двести",
			"триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
			"восемьсот", "девятьсот" };
	public final static String[] massNacat = { "десять", "одинадцать",
			"двенадцать", "тринадцать", "четырнадцать", "пятьнадцать",
			"шестьнадцать", "семьнадцать", "восемьнадцать", "девятьнадцать" };

	double getDistance(int[] x, int[] y)
	{
		if (x == null || x.length < 2 || y == null || y.length < 2)
		{
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = Math
				.sqrt(Math.pow((x[0] - y[0]), 2) + Math.pow((x[1] - y[1]), 2));
		return res;
	}
	
	String getString(int num)
	{
		if (num == 0)
		{
			return "ноль";
		}
		int divider = 10; // делитель
		int remain = 0;
		String string = "";
		int temp = num % 10; // для установки *нацать
		for (int i = 1; i <= 3; i++)
		{

			remain = num % divider;
			num /= 10;
			if (remain != 0)
			{
				if (i == 1)
				{
					string = massOne[remain];
				}
				if (i == 2)
				{
					if (remain == 1)
					{
						string = massNacat[temp];
					} else
					{
						if (temp == 0)
						{
							string = "";
						}
						string = massDec[remain] + " ".concat(string);
					}
				}
				if (i == 3)
				{
					string = massHundreds[remain] + " ".concat(string);
				}
			}
			if (string.endsWith(" "))
			{
				string = string.substring(0, string.length() - 1);
			}
		}

		return string;
	}

	String getDay(int numDay)
	{
		if (numDay <= 0 || numDay >= 8)
		{
			throw new IllegalArgumentException();
		}
		String[] days = { null, "Понедельник", "Вторник", "Среда", "Четверг",
				"Пятница", "Суббота", "Воскресенье" };
		return days[numDay];
	}

	int getNumber(String string)
	{
		int count = 0;
		String[] stringsMass = string.split(" ");
		for (int i = stringsMass.length - 1, j = 1; i >= 0; i--, j++)
		{
			int dig = serchDig(stringsMass[i], j);
			if (dig == -1)
			{
				throw new IllegalArgumentException();
			}
			count += dig;
		}
		return count;
	}

	private int serchDig(String string, int position)
	{
		int dig = 0;
		int i = 0;
		do
		{
			if (string.equals(massOne[i]))
			{
				dig = i;
				return dig;
			}
			i++;
		} while (i < massOne.length);
		i = 0;
		do
		{
			if (string.equals(massDec[i]))
			{
				dig = i * 10;
				return dig;
			}
			i++;
		} while (i < massDec.length);
		i = 0;
		do
		{
			if (string.equals(massHundreds[i]))
			{
				dig = i * 100;
				return dig;
			}
			i++;
		} while (i < massDec.length);
		i = 0;
		do
		{
			if (string.equals(massNacat[i]))
			{
				dig = i + 10;
				return dig;
			}
			i++;
		} while (i < massDec.length);

		return -1;
	}

}
