package randNum;

import java.util.Random;

public class MyRandom
{

	public void printRandomOneNum()
	{
		Random rd = new Random();
		int random = rd.nextInt();
		System.out.println(random);;

	}

	// 2. Вывести на консоль 10 случайных чисел
	void printRandomTenNum()
	{
		Random rd = new Random();
		for (int i = 10; i > 0;)
		{
			System.out.println(rd.nextInt());
			i--;
		}
	}

	// 3. Вывести на консоль 10 случайных чисел, каждое в диапазоне от 0 до 10.
	void printRandomTenNumDoTen()
	{
		Random rd = new Random();
		int predel = 10;
		while (predel > 0)
		{
			System.out.println(rd.nextInt(10));
			predel--;
		}
	}

	// 4. Вывести на консоль 10 случайных чисел, каждое в диапазоне от 20 до 50.
	void printRandomTen20do50()
	{
		Random rd = new Random();
		int predel = 0;
		while (predel < 10)
		{
			System.out.println(rd.nextInt(30) + 20);
			predel++;
		}
	}

	// 5. Вывести на консоль 10 случайных чисел, каждое в диапазоне от -10 до
	// 10.
	void printRandomTenMinus10do10()
	{
		Random rd = new Random();
		int predel = 0;
		while (predel < 10)
		{
			System.out.println(rd.nextInt(20) - 10);
			predel++;
		}
	}

	// 6. Вывести на консоль случайное количество (в диапазоне от 3 до 15)
	// случайных чисел, каждое в диапазоне от -10 до 35.
	void printRandomTenLast()
	{
		Random rd = new Random();
		int predel = rd.nextInt(12) + 3;
		do
		{
			System.out.println(rd.nextInt(45) - 10);
			predel--;
		} while (predel > 0);
	}
}
