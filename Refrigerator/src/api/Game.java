package api;
public class Game
{
	private Panel panel;

	public Game(Panel panel)
	{
		this.panel = panel;
	}

	public void printStepGame()
	{
		int count = 0;
		while (!panel.getStatusKey())
		{
			int[][] temp = panel.getCopyPanelSwich();
			for (int i = 0; i < temp.length; i++)
			{
				for (int j = 0; j < temp[i].length; j++)
				{
					if (temp[i][j] == 0)
					{
						System.out.print("Шаг " + (++count) + ": " + (i + 1)
								+ " по горизонтали и " + (j + 1)
								+ " по вертикали");
						System.out.println();
						if (!panel.getStatusKey())
						{
							panel.pushSwitch(i, j);
							panel.toPrint();
						} else
						{
							break;
						}
					}
				}
			}
		}
		System.out.println("Победаааааааа");
	}
}