public class PolTr1
{

	public static void main(String[] args)
	{
		{
			for (int i = 1; i <= 4; i++)
			{
				for (int j = 1; j <= 7; j++)
				{
					if (i == 4 || j == i + 4 - 1 || j == 4 - i + 1)
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
