package ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import api.Panel;

public class PanelTask extends JPanel
{
	Panel sw;
	JLabel key0;
	JLabel key1;
	JLabel key2;
	JLabel key3;
	JLabel key4;
	JLabel key5;
	JLabel key6;
	JLabel key7;
	JLabel key8;
	JButton button11;
	JButton button12;
	JButton button13;
	JButton button14;
	JButton button21;
	JButton button22;
	JButton button23;
	JButton button24;
	JButton button31;
	JButton button32;
	JButton button33;
	JButton button34;
	JButton button41;
	JButton button42;
	JButton button43;
	JButton button44;
	
	public PanelTask(Panel sw,MyActionListener actionListener)
	{
		this.sw = sw;
		setLayout(new GridLayout(5, 5));
		key0 = new JLabel();
		key1 = new JLabel("1");
		key1.setHorizontalAlignment(JLabel.CENTER);
		key2 = new JLabel("2");
		key2.setHorizontalAlignment(JLabel.CENTER);
		key3 = new JLabel("3");
		key3.setHorizontalAlignment(JLabel.CENTER);
		key4 = new JLabel("4");
		key4.setHorizontalAlignment(JLabel.CENTER);
		key5 = new JLabel("1");
		key5.setHorizontalAlignment(JLabel.RIGHT);
		key6 = new JLabel("2");
		key6.setHorizontalAlignment(JLabel.RIGHT);
		key7 = new JLabel("3");
		key7.setHorizontalAlignment(JLabel.RIGHT);
		key8 = new JLabel("4");
		key8.setHorizontalAlignment(JLabel.RIGHT);
		button11 = new JButton();
		button12 = new JButton();
		button13 = new JButton();
		button14 = new JButton();
		button21 = new JButton();
		button22 = new JButton();
		button23 = new JButton();
		button24 = new JButton();
		button31 = new JButton();
		button32 = new JButton();
		button33 = new JButton();
		button34 = new JButton();
		button41 = new JButton();
		button42 = new JButton();
		button43 = new JButton();
		button44 = new JButton();
		button11.setActionCommand("11");
		button12.setActionCommand("12");
		button13.setActionCommand("13");
		button14.setActionCommand("14");
		button21.setActionCommand("21");
		button22.setActionCommand("22");
		button23.setActionCommand("23");
		button24.setActionCommand("24");
		button31.setActionCommand("31");
		button32.setActionCommand("32");
		button33.setActionCommand("33");
		button34.setActionCommand("34");
		button41.setActionCommand("41");
		button42.setActionCommand("42");
		button43.setActionCommand("43");
		button44.setActionCommand("44");
		setTextButton();
		
		button11.addActionListener(actionListener);
		button12.addActionListener(actionListener);
		button13.addActionListener(actionListener);
		button14.addActionListener(actionListener);
		button21.addActionListener(actionListener);
		button22.addActionListener(actionListener);
		button23.addActionListener(actionListener);
		button24.addActionListener(actionListener);
		button31.addActionListener(actionListener);
		button32.addActionListener(actionListener);
		button33.addActionListener(actionListener);
		button34.addActionListener(actionListener);
		button41.addActionListener(actionListener);
		button42.addActionListener(actionListener);
		button43.addActionListener(actionListener);
		button44.addActionListener(actionListener);

		add(key0);
		add(key1);
		add(key2);
		add(key3);
		add(key4);
		add(key5);
		add(button11);
		add(button12);
		add(button13);
		add(button14);
		add(key6);
		add(button21);
		add(button22);
		add(button23);
		add(button24);
		add(key7);
		add(button31);
		add(button32);
		add(button33);
		add(button34);
		add(key8);
		add(button41);
		add(button42);
		add(button43);
		add(button44);
	}

	public void setTextButton()
	{
		button11.setText("" + sw.getSwitchPos(0, 0));
		button12.setText("" + sw.getSwitchPos(0, 1));
		button13.setText("" + sw.getSwitchPos(0, 2));
		button14.setText("" + sw.getSwitchPos(0, 3));
		button21.setText("" + sw.getSwitchPos(1, 0));
		button22.setText("" + sw.getSwitchPos(1, 1));
		button23.setText("" + sw.getSwitchPos(1, 2));
		button24.setText("" + sw.getSwitchPos(1, 3));
		button31.setText("" + sw.getSwitchPos(2, 0));
		button32.setText("" + sw.getSwitchPos(2, 1));
		button33.setText("" + sw.getSwitchPos(2, 2));
		button34.setText("" + sw.getSwitchPos(2, 3));
		button41.setText("" + sw.getSwitchPos(3, 0));
		button42.setText("" + sw.getSwitchPos(3, 1));
		button43.setText("" + sw.getSwitchPos(3, 2));
		button44.setText("" + sw.getSwitchPos(3, 3));
	}

}
