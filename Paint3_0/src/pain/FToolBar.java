package pain;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class FToolBar extends JToolBar
{
	public FToolBar(PCommands cmd)
	{
		JButton mnuRed = new JButton("Red");
		JButton mnuGreen = new JButton("Green");
		JButton mnuBlue = new JButton("Blue");

		add(mnuRed);
		add(mnuGreen);
		add(mnuBlue);
		addSeparator();

		mnuRed.addActionListener(cmd.colCmdRed);
		mnuGreen.addActionListener(cmd.colCmdGreen);
		mnuBlue.addActionListener(cmd.colCmdBlue);

		JButton mnu1 = new JButton("1");
		JButton mnu3 = new JButton("3");
		JButton mnu5 = new JButton("5");
		JButton mnu7 = new JButton("7");

		add(mnu1);
		add(mnu3);
		add(mnu5);
		add(mnu7);

		mnu1.addActionListener(cmd.wCmd1);
		mnu3.addActionListener(cmd.wCmd3);
		mnu5.addActionListener(cmd.wCmd5);
		mnu7.addActionListener(cmd.wCmd7);
	}
}