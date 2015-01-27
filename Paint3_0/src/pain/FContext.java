package pain;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class FContext extends JPopupMenu
{
	public FContext(PCommands cmd)
	{
		JMenu mnuColor = new JMenu("Color");
		add(mnuColor);
		JMenuItem mnuRed = new JMenuItem("Red");
		JMenuItem mnuGreen = new JMenuItem("Green");
		JMenuItem mnuBlue = new JMenuItem("Blue");

		mnuRed.addActionListener(cmd.colCmdRed);
		mnuGreen.addActionListener(cmd.colCmdGreen);
		mnuBlue.addActionListener(cmd.colCmdBlue);

		mnuColor.add(mnuRed);
		mnuColor.add(mnuGreen);
		mnuColor.add(mnuBlue);

		JMenu mnuWidth = new JMenu("Width");
		add(mnuWidth);
		JMenuItem mnu1 = new JMenuItem("1");
		JMenuItem mnu3 = new JMenuItem("3");
		JMenuItem mnu5 = new JMenuItem("5");
		JMenuItem mnu7 = new JMenuItem("7");

		mnuWidth.add(mnu1);
		mnuWidth.add(mnu3);
		mnuWidth.add(mnu5);
		mnuWidth.add(mnu7);

		mnu1.addActionListener(cmd.wCmd1);
		mnu3.addActionListener(cmd.wCmd3);
		mnu5.addActionListener(cmd.wCmd5);
		mnu7.addActionListener(cmd.wCmd7);

	}
}
