package myNew;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PanelDraw extends JPanel implements MouseListener
{
	PanelFigure panel;
	Sets sets;

	public PanelDraw(Sets sets)
	{
		sets.list = new ArrayList<PanelFigure>();
		sets.panelDraw = this;
		this.sets = sets;

		setLayout(null);
		setBackground(Color.yellow);
		addMouseListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		panel = new PanelFigure(sets);
		panel.setStartX(e.getX());
		panel.setStartY(e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		panel.setWidth(e.getX());
		panel.setHeight(e.getY());
		panel.createPanel();
		sets.list.add(0, panel);
		add(panel);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e)
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

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for (PanelFigure pf : sets.list)
		{
			add(pf);
		}
	}
}