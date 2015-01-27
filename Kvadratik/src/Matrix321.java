public class Matrix321
{

	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3 };
		for (int i = 1; i <= 3; i++)
		{
			for (int j = a.length-1; j >=0; j--)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}

}
