package pain;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

public class FigureFRect extends SelectFigure
{
	public FigureFRect(PanelDraw draw)
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
			g.drawRoundRect(firstX, firstY, width, height, 20, 20);
		} else if (firstX > lastX && firstY > lastY)
		{
			g.drawRoundRect(lastX, lastY, width, height, 20, 20);
		} else if (firstX < lastX && firstY > lastY)
		{
			g.drawRoundRect(firstX, lastY, width, height, 20, 20);
		} else if (firstX > lastX && firstY < lastY)
		{
			g.drawRoundRect(lastX, firstY, width, height, 20, 20);
		}
	}
}
