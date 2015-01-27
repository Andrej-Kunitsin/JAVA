public class Matrix333
{

	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3 };
		for (int i = a.length-1; i >= 0; i--)
		{
			for (int j = 1; j <= 3; j++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}
