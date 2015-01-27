/*Скорость первого автомобиля v1 км/ч, второго — v2 км/ч, 
расстояние между ними s км. 
Какое расстояние будет между ними через t ч, 
если автомобили движутся в разные стороны?*/

public class Distans
{
	public static void main(String[] args)
	{
		int speedCar1 = 60;
		int speedCar2 = 90;
		int distansBetweenCar = 10;
		int time = 1;
		int finalDistans = getDistansCarDuring(speedCar1, time)
				+ getDistansCarDuring(speedCar2, time) + distansBetweenCar;
		System.out.println(finalDistans);
	}

	private static int getDistansCarDuring(int speedCar, int time)
	{
		int dist = speedCar * time;
		return dist;
	}
}
