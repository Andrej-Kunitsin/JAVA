package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MyDriver extends JPanel implements ActionListener
{
	private CreatePanel panelDependent;

	public MyDriver()
	{

	}

	public void setPanelDependent(CreatePanel panelDependent)
	{
		this.panelDependent = panelDependent;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		panelDependent.fieldFName.setVisible(true);
		panelDependent.lableFName.setVisible(true);
		panelDependent.fieldLName.setVisible(true);
		panelDependent.lableLName.setVisible(true);
		panelDependent.fieldAge.setVisible(true);
		panelDependent.lableAgeName.setVisible(true);
		switch (e.getActionCommand())
		{
		case "Create":
			panelDependent.setTextButton("Create");

			break;
		case "Read":
			panelDependent.setTextButton("Read");
			panelDependent.fieldFName.setVisible(false);
			panelDependent.lableFName.setVisible(false);
			panelDependent.fieldLName.setVisible(false);
			panelDependent.lableLName.setVisible(false);
			panelDependent.fieldAge.setVisible(false);
			panelDependent.lableAgeName.setVisible(false);
			
			break;
		case "Update":
			panelDependent.setTextButton("Update");
			break;
		case "Delete":
			panelDependent.setTextButton("Delete");
			panelDependent.fieldFName.setVisible(false);
			panelDependent.lableFName.setVisible(false);
			panelDependent.fieldLName.setVisible(false);
			panelDependent.lableLName.setVisible(false);
			panelDependent.fieldAge.setVisible(false);
			panelDependent.lableAgeName.setVisible(false);

			break;
		default:
			break;
		}
	}
}
