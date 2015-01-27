package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import api.Panel;

public class PanelHelp extends JPanel implements Cloneable
{
	private Panel sw;
	private int [][] temp;

	public PanelHelp(Panel sw)
	{
		this.sw = sw;
		temp = sw.getCopyPanelSwich();

		printStepGame();
	}

	public void printStepGame()
	{
		int count = 0;
		while (!sw.getStatusKey())
		{
			int[][] temp = sw.getCopyPanelSwich();
			for (int i = 0; i < temp.length; i++)
			{
				for (int j = 0; j < temp[i].length; j++)
				{
					if (temp[i][j] == 0)
					{
						add(new JLabel("Шаг " + (++count) + ": " + (i + 1)
								+ " по горизонтали и " + (j + 1)
								+ " по вертикали"));
						if (!sw.getStatusKey())
						{
							sw.pushSwitch(i, j);
						} else
						{
							break;
						}
					}
				}
			}
		}
		sw.setCopyPanelSwich(temp);
	}
}
