public class Ugol1
{

	public static void main(String[] args)
	{
		{
			for (int i = 1; i <= 7; i++)
			{
				for (int j = 1; j <= i; j++)
				{
					if (i == 1 || i == 7 || j == 1 || j == i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");

					}
				}
				System.out.println();
			}
		}

	}

}
