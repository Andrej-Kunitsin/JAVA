package pain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class PanelDraw extends JPanel
{

	FSets sets = null;

	public PanelDraw(PCommands cmd)
	{
		sets = cmd.sets;
		setLayout(null);
		setBackground(Color.yellow);
		FContext context = new FContext(cmd);
		setComponentPopupMenu(context);
		FToolBar toolBar = new FToolBar(cmd);
		toolBar.setBounds(0, 0, 400, 30);
		add(toolBar);

		sets.mFigure = new FigureFree(this);
		cmd.draw = this;
		sets.image = new BufferedImage(400, 600, BufferedImage.TYPE_INT_RGB);
		sets.image.getGraphics().fillRect(0,0,400, 600);
		this.addMouseListener(sets.mFigure);
		this.addMouseMotionListener(sets.mFigure);
	}

	void addMListener(MouseListener mListener)
	{
		MouseListener[] ml = getMouseListeners();

		if (ml != null)
		{
			for (MouseListener myMl : ml)
			{
				removeMouseListener(myMl);
			}
		}
		addMouseListener(mListener);
	}

	void addMyMotionListener(MouseMotionListener mListener)
	{
		MouseMotionListener[] mml = getMouseMotionListeners();
		if (mml != null)
		{
			for (MouseMotionListener myMl : mml)
			{
				removeMouseMotionListener(myMl);
			}
		}
		addMouseMotionListener(mListener);
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(sets.image, 0, 0, null);
	}
}