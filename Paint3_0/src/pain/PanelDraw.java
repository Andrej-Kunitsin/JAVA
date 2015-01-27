package pain;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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
}