package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import api.Panel;

public class PanelKey extends JPanel
{
	private JLabel key0;
	private JLabel key1;
	private JLabel key2;
	private JLabel key3;
	private JLabel key4;
	Panel sw;

	public PanelKey()
	{
		setTextKey();
	}

	public PanelKey(Panel sw)
	{
		this.sw = sw;
		setLayout(new GridLayout(1, 4,0, 0));

		key0 = new JLabel();
		key1 = new JLabel();
		key1.setHorizontalAlignment(JLabel.CENTER);
		key2 = new JLabel();
		key2.setHorizontalAlignment(JLabel.CENTER);
		key3 = new JLabel();
		key3.setHorizontalAlignment(JLabel.CENTER);
		key4 = new JLabel();
		key4.setHorizontalAlignment(JLabel.CENTER);
		add(key0);
		add(key1);
		add(key2);
		add(key3);
		add(key4);
		setTextKey();
	}

	public void setTextKey(String string)
	{
		key1.setText(string);
		key2.setText(string);
		key3.setText(string);
		key4.setText(string);
	}

	public void setTextKey()
	{
		key1.setText("" + sw.getStatusKey(0));
		key2.setText("" + sw.getStatusKey(1));
		key3.setText("" + sw.getStatusKey(2));
		key4.setText("" + sw.getStatusKey(3));
	}
}
