package myNew;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelFigure extends JPanel
{
	private int startX;
	private int startY;
	private int width;
	private int height;
	private Figures fig;

	public PanelFigure(Sets sets)
	{
		fig = sets.mFigure;
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if (fig == Figures.Rectangl)
		{
			g.drawRect(0, 0, width - 1, height - 1);
		} else if (fig == Figures.Cicle)
		{
			g.drawOval(0, 0, width - 1, height - 1);
		}
	}

	public void createPanel()
	{
		// setOpaque(false);
		setBounds(startX, startY, width, height);
	}

	public int getStartX()
	{
		return startX;
	}

	public void setStartX(int startX)
	{
		this.startX = startX;
	}

	public int getStartY()
	{
		return startY;
	}

	public void setStartY(int startY)
	{
		this.startY = startY;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int lastX)
	{
		width = Math.abs(startX - lastX);
		if (startX > lastX)
		{
			startX = lastX;
		}
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int lastY)
	{
		height = Math.abs(startY - lastY);
		if (startY > lastY)
		{
			startY = lastY;
		}
	}
}
