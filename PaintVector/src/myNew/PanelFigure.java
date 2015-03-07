package myNew;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PanelFigure extends JPanel implements MouseListener,
		MouseMotionListener
{
	private static final long serialVersionUID = 1L;

	public Figures fig;
	private int dx = 0;
	private int dy = 0;

	public PanelFigure()
	{
	}

	public PanelFigure(Sets sets)
	{
		fig = sets.mFigure;
		setOpaque(false);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if (fig == Figures.Rectangl)
		{
			g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
		} else if (fig == Figures.Cicle)
		{
			g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
		}
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		dx = e.getX();
		dy = e.getY();
	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		Point pp = getLocation();
		pp.translate(e.getX() - dx, e.getY() - dy);
		setLocation(pp);
	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	}
}
