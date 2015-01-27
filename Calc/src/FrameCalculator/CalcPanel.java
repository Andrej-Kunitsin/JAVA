package FrameCalculator;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalcPanel extends JPanel
{
	static JLabel expressionLableString;
	static JLabel topLabelString;
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	JButton btnPlus, btnMinus, btnMult, btnDev, btnEq;
	JButton reset;
	static String textLabel = "0";

	public CalcPanel()
	{
		setLayout(null);
		topLabelString = new JLabel();
		expressionLableString = new JLabel(textLabel);
		reset = new JButton("C");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn0 = new JButton("0");
		btnPlus = new JButton("+");
		btnMinus = new JButton("-");
		btnMult = new JButton("*");
		btnDev = new JButton("/");
		btnEq = new JButton("=");

		topLabelString.setBounds(10, 10, 200, 20);
		topLabelString.setBorder(BorderFactory.createBevelBorder(1));
		expressionLableString.setBounds(10, 40, 200, 30);
		expressionLableString.setBorder(BorderFactory.createBevelBorder(1));
		reset.setBounds(230, 10, 50, 50);
		btn1.setBounds(10, 90, 50, 50);
		btn2.setBounds(70, 90, 50, 50);
		btn3.setBounds(130, 90, 50, 50);
		btn4.setBounds(10, 150, 50, 50);
		btn5.setBounds(70, 150, 50, 50);
		btn6.setBounds(130, 150, 50, 50);
		btn7.setBounds(10, 210, 50, 50);
		btn8.setBounds(70, 210, 50, 50);
		btn9.setBounds(130, 210, 50, 50);
		btn0.setBounds(10, 270, 170, 50);
		btnPlus.setBounds(230, 90, 50, 50);
		btnMinus.setBounds(230, 150, 50, 50);
		btnMult.setBounds(230, 210, 50, 50);
		btnDev.setBounds(230, 270, 50, 50);
		btnEq.setBounds(10, 330, 270, 50);

		add(topLabelString);
		add(expressionLableString);
		add(reset);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn0);
		add(btnPlus);
		add(btnMinus);
		add(btnMult);
		add(btnDev);
		add(btnEq);

		MyListener listener = new MyListener();
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		btn4.addActionListener(listener);
		btn5.addActionListener(listener);
		btn6.addActionListener(listener);
		btn7.addActionListener(listener);
		btn8.addActionListener(listener);
		btn9.addActionListener(listener);
		btn0.addActionListener(listener);
		btnPlus.addActionListener(listener);
		btnMinus.addActionListener(listener);
		btnMult.addActionListener(listener);
		btnDev.addActionListener(listener);
		btnEq.addActionListener(listener);
		reset.addActionListener(listener);
	}
}
