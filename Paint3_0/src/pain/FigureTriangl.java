package pain;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;

public class FigureTriangl extends SelectFigure
{
	Polygon p = new Polygon();
	int[] pointsX = new int[3];
	int[] pointsY = new int[3];
	int pointsClick = 0;

	public FigureTriangl(PanelDraw draw)
	{
		super(draw);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		Graphics2D g = (Graphics2D) panel.sets.image.getGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(panel.sets.col);
		g.setStroke(new BasicStroke(panel.sets.width));

		try
		{
			pointsX[pointsClick] = e.getX();
			pointsY[pointsClick] = e.getY();
			pointsClick++;
			if (pointsClick == 3)
			{
				throw new Exception();
			}

		} catch (Exception e2)
		{
			g.drawPolygon(pointsX, pointsY, 3);
			pointsClick = 0;
			panel.repaint();
		}
	}
}
