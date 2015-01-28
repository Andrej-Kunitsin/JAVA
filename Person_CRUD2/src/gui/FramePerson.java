package gui;

import java.awt.BorderLayout;
import java.sql.SQLException;

import javax.swing.JFrame;

public class FramePerson extends JFrame
{
	
	public FramePerson()
	{
		setTitle("Test PersonDB");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 200);
		PanelPerson tablePanel = new PanelPerson();
		
		add(tablePanel);
		
		setVisible(true);
	}
}
