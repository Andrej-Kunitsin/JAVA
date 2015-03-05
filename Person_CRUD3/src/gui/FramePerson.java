package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class FramePerson extends JFrame
{
	private static final long serialVersionUID = 1L;

	public FramePerson()
	{
		setLayout(new FlowLayout());
		setTitle("Test PersonDB");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		PanelPerson tablePanel = new PanelPerson();

		add(tablePanel);

		setVisible(true);
	}
}