package myNew;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PanelFigure extends JPanel implements MouseListener,MouseMotionListener
{
	public int startX;
	public int startY;
	public int width;
	public int height;
	public Figures fig;
	private int xDelta=0;
	private int yDelta=0;
	private Sets sets;
	public PanelFigure()
	{
	}

	public PanelFigure(Sets sets)
	{
		this.sets = sets;
		fig = sets.mFigure;
		 setOpaque(false);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void createPanel()
	{
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

	@Override
	public void mousePressed(MouseEvent e)
	{
		xDelta = e.getX();
		yDelta = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		startX = startX+e.getX()-xDelta;
		startY = startY+e.getY()-yDelta;
		xDelta=e.getX();
		yDelta=e.getY();
		createPanel();
		sets.panelDraw.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
