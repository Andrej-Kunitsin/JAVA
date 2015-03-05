package myNew;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PanelDraw extends JPanel
{
	private static final long serialVersionUID = 1L;
	PanelFigure panel;
	Sets sets;

	public PanelDraw(Sets set)
	{
		this.sets = set;

		setLayout(null);
		setBackground(Color.yellow);
		addMouseListener(new MouseListener()
		{
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
				panel.setBounds(panel.startX, panel.startY, panel.width,
						panel.height);
				add(panel);
				repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e)
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
		});
	}

}