package pain;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FMenu extends JMenuBar {
	public FMenu(PCommands cmd) {
		JMenu mnuFile = new JMenu("File");
		add(mnuFile);
		JMenuItem mnuOpen = new JMenuItem("Open");
		JMenuItem mnuSave = new JMenuItem("Save");

		mnuOpen.addActionListener(cmd.openFile);
		mnuSave.addActionListener(cmd.saveFile);

		mnuFile.add(mnuOpen);
		mnuFile.add(mnuSave);

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
		mnuWidth.add(new JMenuItem("1"));
		mnuWidth.add(new JMenuItem("3"));
		mnuWidth.add(new JMenuItem("5"));
		mnuWidth.add(new JMenuItem("7"));

	}
}
