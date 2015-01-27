package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class SelectTaskPanel extends JPanel
{
	public JRadioButton radioButton1;
	public JRadioButton radioButton2;
	public JRadioButton radioButton3;
	public JRadioButton radioButton4;
	public MyDriver driver;

	public SelectTaskPanel()
	{
	}

	public SelectTaskPanel(MyDriver driver)
	{
		this.driver = driver;
		setLayout(new FlowLayout());
		setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		radioButton1 = new JRadioButton("Create");
		radioButton1.setSelected(true);
		radioButton2 = new JRadioButton("Read");
		radioButton3 = new JRadioButton("Update");
		radioButton4 = new JRadioButton("Delete");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButton1);
		buttonGroup.add(radioButton2);
		buttonGroup.add(radioButton3);
		buttonGroup.add(radioButton4);

		add(radioButton1);
		add(radioButton2);
		add(radioButton3);
		add(radioButton4);

		radioButton1.addActionListener(driver);
		radioButton2.addActionListener(driver);
		radioButton3.addActionListener(driver);
		radioButton4.addActionListener(driver);

	}
}