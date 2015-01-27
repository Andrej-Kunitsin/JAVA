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
		MyDriver driver = new MyDriver();
		SelectTaskPanel selectTaskPanel = new SelectTaskPanel(driver);
		TablePanel tablePanel = new TablePanel();
		CreatePanel createPanel = new CreatePanel(tablePanel);
		
		
		driver.setPanelDependent(createPanel);
		
		add(selectTaskPanel,BorderLayout.NORTH);
		add(createPanel,BorderLayout.CENTER);
		add(tablePanel,BorderLayout.EAST);
		
		setVisible(true);
	}
}
