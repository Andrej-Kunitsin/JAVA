package gui;

import javax.swing.JFrame;

public class FramePerson extends JFrame
{
	public FramePerson()
	{
		setTitle("Test PersonDB");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		PanelPerson tablePanel = new PanelPerson();

		add(tablePanel);

		setVisible(true);
	}
}