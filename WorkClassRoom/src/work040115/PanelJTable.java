package work040115;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelJTable extends JPanel
{
	MyTableModel myTableModel;
	JTable table;
	
	public PanelJTable()
	{
		myTableModel = new MyTableModel();
		
		table = new JTable(myTableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.NORTH);

	}
}
