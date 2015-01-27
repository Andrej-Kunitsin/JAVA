package FrameCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calculate.Main;

public class MyListener implements ActionListener
{
	int a=0, b=0;
	String op="";
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String numButton = e.getActionCommand();
		int res = 0;
		if (numButton.equals("+") || numButton.equals("-")
				|| numButton.equals("*") || numButton.equals("/"))
		{
			a = Integer.parseInt(CalcPanel.expressionLableString.getText());
			op = numButton;
			CalcPanel.textLabel = "";
			CalcPanel.expressionLableString.setText(numButton);
		} else if (numButton.equals("="))
		{
			b = Integer.parseInt(CalcPanel.textLabel);
			res = Main.calc(a, b, op);
			CalcPanel.expressionLableString.setText("" + res);
			a = res;
		} else if (numButton.equals("C"))
		{
			a = 0;
			b = 0;
			op = "";
			CalcPanel.textLabel = "0";
			CalcPanel.expressionLableString.setText(CalcPanel.textLabel);
			CalcPanel.topLabelString.setText("");
			return;
		} else
		{
			if (CalcPanel.textLabel.equals("0"))
			{
				CalcPanel.textLabel = numButton;
			} else
			{
				CalcPanel.textLabel = CalcPanel.textLabel.concat(numButton);
			}
			CalcPanel.expressionLableString.setText(CalcPanel.textLabel);
		}
		if (res == 0)
		{
			CalcPanel.topLabelString.setText(CalcPanel.topLabelString.getText() + numButton);
		} else
		{
			CalcPanel.topLabelString.setText(CalcPanel.topLabelString.getText() + numButton + res);
		}
	}
}
