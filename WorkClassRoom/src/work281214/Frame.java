package work281214;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame
{
	public Frame()
	{
		setTitle("Test JTable");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		
		//PanelJTable panel = new PanelJTable();
		//add(panel);
		setVisible(true);
	}
}
