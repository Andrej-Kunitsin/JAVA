package work141214;

public class qwe
{

	public static void main(String[] args)
	{
		int ar[][] =
		{
		{ 1, 2, 3, 4 },
		{ 2, 55, 4, 99 },
		{ 3, 4, 5, 6 },
		{ 4, 5, 6, 7 },
		{ 43, 5, 33, 2 } };
		int res = ar[0][0];
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				if (ar[i][j] > res)
				{
					res = ar[i][j];
				}
			}
		}
		System.out.println(res);
	}
}