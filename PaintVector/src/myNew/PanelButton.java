package myNew;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButton extends JPanel implements ActionListener
{
	JButton buttonRect;
	JButton buttonOval;
	Sets sets;

	public PanelButton(Sets sets)
	{
		this.sets = sets;
		buttonRect = new JButton("Квадрат");
		buttonOval = new JButton("Овал");
		buttonRect.setBounds(10, 10, 100, 50);
		buttonOval.setBounds(10, 70, 100, 50);
		add(buttonRect);
		add(buttonOval);
		buttonRect.addActionListener(this);
		buttonOval.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Квадрат"))
		{
			sets.mFigure = Figures.Rectangl;
		} else if (e.getActionCommand().equals("Овал"))
		{
			sets.mFigure = Figures.Cicle;
		}
	}
}
