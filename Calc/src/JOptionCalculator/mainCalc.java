package JOptionCalculator;

import javax.swing.JOptionPane;

import calculate.Main;

public class mainCalc
{

	public static void main(String[] args)
	{
		int a = Integer.parseInt(JOptionPane.showInputDialog("Введите первую цифру"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Введите вторую цифру"));
		String c = JOptionPane.showInputDialog("Введите операцию");
		JOptionPane.showMessageDialog(null,""+ Main.calc(a, b, c));
				
	}
}
