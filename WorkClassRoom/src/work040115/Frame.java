package work040115;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Frame extends JFrame
{
	
	public Frame()
	{
		setTitle("Test JTable");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		PanelJTable panel = new PanelJTable();
		add(panel,BorderLayout.NORTH);
		setVisible(true);
	}
}
