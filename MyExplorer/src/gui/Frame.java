package gui;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	Frame()
	{
		setTitle("Холодильник братьев Пилотов");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		Panel panel = new Panel();
		//setLayout();
		add(panel);
		setVisible(true);
	}
}
