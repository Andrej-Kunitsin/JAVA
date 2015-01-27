package pain;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

public class FigureRect extends SelectFigure
{
	public FigureRect(PanelDraw draw)
	{
		super(draw);
		// TODO Auto-generated constructor stub
	}

		@Override
	public void mouseReleased(MouseEvent e)
	{
		lastX = e.getX();
		lastY = e.getY();
		Graphics2D g = (Graphics2D) panel.getGraphics();
		g.setColor(panel.sets.col);
		g.setStroke(new BasicStroke(panel.sets.width));
		int width = Math.abs(firstX - lastX);
		int height = Math.abs(firstY - lastY);

		if (firstX < lastX && firstY < lastY)
		{
			g.drawRect(firstX, firstY, width, height);
		} else if (firstX > lastX && firstY > lastY)
		{
			g.drawRect(lastX, lastY, width, height);
		} else if (firstX < lastX && firstY > lastY)
		{
			g.drawRect(firstX, lastY, width, height);
		} else if (firstX > lastX && firstY < lastY)
		{
			g.drawRect(lastX, firstY, width, height);
		}
	}
}
