package ScanerCalculator;

import java.util.Scanner;

import calculate.Main;

public class mainCalc
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите опирацию через пробел");
		int a = scanner.nextInt();
		String c = scanner.next("(\\+||-||\\*||/)");
		int b = scanner.nextInt();
		int res = Main.calc(a, b, c);
		System.out.println(res);
		scanner.close();
	}
}
