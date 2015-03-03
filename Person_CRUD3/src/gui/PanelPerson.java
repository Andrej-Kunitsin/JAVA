package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelPerson extends JPanel
{
	JTable table;
	JScrollPane scrollPane;

	public PanelPerson()
	{
		table = new JTable();
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 600, 400);
	}
}
