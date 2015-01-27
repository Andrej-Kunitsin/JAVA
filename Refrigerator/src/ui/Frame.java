package ui;

import java.awt.GridLayout;

import javax.swing.JFrame;

import api.Panel;

public class Frame extends JFrame
{
	public Frame()
	{
		setTitle("Холодильник братьев Пилотов");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100,350, 500);
		Panel sw = new Panel();
		MyActionListener actionListener = new MyActionListener(sw);
		PanelTask panelTask = new PanelTask(sw,actionListener);
		PanelKey panelKey = new PanelKey(sw);
		PanelHelp panelHelp = new PanelHelp(sw);
		actionListener.setPanelKey(panelKey);
		actionListener.setPanelTask(panelTask);
		setLayout(new GridLayout(3,1));
		add(panelKey);
		add(panelTask);
		add(panelHelp);
		
		setVisible(true);
	}
}
