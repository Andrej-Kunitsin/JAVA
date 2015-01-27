package pain;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseEvent;

public class FigureTriangl extends SelectFigure
{
	Polygon p = new Polygon();
	int[] pointsX = new int[3];
	int[] pointsY = new int[3];
	int pointsClick = 0;

	Graphics2D g = (Graphics2D) panel.getGraphics();

	public FigureTriangl(PanelDraw draw)
	{
		super(draw);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
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
			;
		}
	}
}
