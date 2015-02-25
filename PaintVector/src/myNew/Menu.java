package myNew;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar
{
	JMenu jMenu;
	JMenuItem itemLoad;
	JMenuItem itemSave;
	JMenuItem itemClose;

	public Menu()
	{
		jMenu = new JMenu("File");

		itemLoad = new JMenuItem("Load");
		itemSave = new JMenuItem("Save");
		itemClose = new JMenuItem("Close");

		jMenu.add(itemLoad);
		jMenu.add(itemSave);
		jMenu.addSeparator();
		jMenu.add(itemClose);

		add(jMenu);

		itemClose.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
	}
}
