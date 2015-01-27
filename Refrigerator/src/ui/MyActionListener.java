package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import api.Panel;

public class MyActionListener implements ActionListener
{
	Panel sw;
	PanelTask panelTask;
	PanelKey panelKey;

	public MyActionListener()
	{
	}

	public MyActionListener(Panel sw)
	{
		this.sw = sw;
	}

	public void setPanelKey(PanelKey panelKey)
	{
		this.panelKey = panelKey;
	}

	public void setPanelTask(PanelTask panelTask)
	{
		this.panelTask = panelTask;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int i = Integer.parseInt(e.getActionCommand());
		sw.pushSwitch(i / 10 - 1, i % 10 - 1);
		panelTask.setTextButton();
		if (!sw.getStatusKey())
		{
			panelKey.setTextKey();
		}else {panelKey.setTextKey("Victory");}

	}
}
