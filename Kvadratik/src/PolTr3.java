public class PolTr3
{

	public static void main(String[] args)
	{
		{
			int ch=4;
			for (int i = 1; i <= 7; i++)
			{
				for (int j = 1; j <= 4; j++)
				{
					if (j==i||j==1)
					{
						System.out.print("* ");
					}
					else if (i>ch&&j==ch-1){
						ch--;
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
