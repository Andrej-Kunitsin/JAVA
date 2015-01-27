public class PolTr4
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1;j <= 4; j++)
			{
				if (j == 4||j==4-i+1)
				{
					System.out.print("* ");
				}
				else if (i > 4 && j == i-4+1)
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
