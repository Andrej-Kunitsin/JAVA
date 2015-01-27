package work281214_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	public Frame()
	{
		setTitle("Test JTable");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		PanelJTable panel = new PanelJTable();
		add(panel);
		setVisible(true);
	}
}
