package api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Panel
{
	private int panelSwitches[][];
	private int statusKey[] = new int[4];

	public Panel()
	{
		this.panelSwitches = createFirstPanel();
		setStatusKey();
	}

	public void pushSwitch(int x, int y)
	{
		panelSwitches[x][y] = reversSwitch(panelSwitches[x][y]);
		for (int i = 0; i < panelSwitches.length; i++)
		{
			panelSwitches[x][i] = reversSwitch(panelSwitches[x][i]);
			panelSwitches[i][y] = reversSwitch(panelSwitches[i][y]);
		}
		setStatusKey();
	}

	public int getStatusKey(int i)
	{
		return statusKey[i];
	}

	public boolean getStatusKey()
	{
		boolean res = true;
		for (int i : statusKey)
		{
			if (i == 0)
			{
				res = false;
				return res;
			}
		}
		return res;
	}

	private void setStatusKey()
	{
		for (int i = 0; i < panelSwitches.length; i++)
		{
			for (int j = 0; j < panelSwitches[i].length; j++)
			{
				int tmp = 1;
				if (panelSwitches[j][i] != tmp)
				{
					statusKey[i] = 0;
					break;
				} else
				{
					statusKey[i] = 1;
				}
			}
		}
	}

	private int reversSwitch(int i)
	{
		return i == 0 ? 1 : 0;
	}

	private int[][] createFirstPanel()
	{

		int[][] panelRef = new int[4][4];
		for (int i = 0; i < panelRef.length; i++)
		{
			for (int j = 0; j < panelRef[i].length; j++)
			{
				panelRef[i][j] = createRandomPos();
			}
		}

		return panelRef;
	}

	private int createRandomPos()
	{
		int res = 0;
		Random r = new Random();
		res = r.nextInt(2);
		return res;
	}

	public void toPrint()
	{
		for (int i : statusKey)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < panelSwitches.length; i++)
		{
			for (int j = 0; j < panelSwitches[i].length; j++)
			{
				System.out.print(panelSwitches[i][j] + " ");
			}

			System.out.println();
		}
	}

	public int[][] getCopyPanelSwich()
	{
		int[][] temp = new int[panelSwitches.length][panelSwitches[0].length];
		for (int i = 0; i < temp.length; i++)
		{
			for (int j = 0; j < temp[i].length; j++)
			{
				temp[i][j] = panelSwitches[i][j];
			}
		}

		return temp;
	}

	public int getSwitchPos(int x, int y)
	{
		return panelSwitches[x][y];
	}

	public void setCopyPanelSwich(int[][] temp)
	{
		panelSwitches = temp;
	}
}
