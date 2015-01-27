package work121114_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OddPanel extends JPanel implements ActionListener
{
	JTextField txt1 = null;
	JTextField txt2 = null;
	JTextField txt3 = null;
	String[] listData = { "+", "-", "*", "/" };
	JComboBox<String> comboBox = null;
	JButton btn1 = null;
	JLabel lbl1 = null;
	JLabel lbl2 = null;
	JLabel lbl3 = null;

	public OddPanel()
	{
		setLayout(null);
		lbl1 = new JLabel("Первое число: ");
		lbl2 = new JLabel("Второе число: ");
		txt1 = new JTextField();
		txt2 = new JTextField();
		comboBox = new JComboBox<String>(listData);
		btn1 = new JButton("Решить");
		lbl3 = new JLabel("Ответ");

		lbl1.setBounds(10, 10, 150, 18);
		txt1.setBounds(160, 10, 120, 20);
		comboBox.setBounds(10, 40, 50, 20);
		lbl2.setBounds(10, 80, 150, 18);
		txt2.setBounds(160, 80, 120, 20);
		btn1.setBounds(10, 100, 120, 20);
		lbl3.setBounds(10, 140, 50, 50);

		add(lbl1);
		add(txt1);
		add(lbl2);
		add(txt2);
		add(btn1);
		add(comboBox);
		add(lbl3);

		// txt1.addActionListener(this);
		// txt2.addActionListener(this);
		// comboBox.addActionListener(this);
		btn1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int a = Integer.parseInt(txt1.getText());
		int b = Integer.parseInt(txt2.getText());
		int indexSelect = comboBox.getSelectedIndex();
		String op = listData[indexSelect];
		lbl3.setText("" + Main.calc(a, b, op));
	}

}
