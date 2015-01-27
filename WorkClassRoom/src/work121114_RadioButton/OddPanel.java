package work121114_RadioButton;

import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class OddPanel extends JPanel implements ActionListener, ItemListener
{
	JTextField txt1 = null;
	JTextField txt2 = null;
	JTextField txt3 = null;
	JButton btn1 = null;
	JLabel lbl1 = null;
	JLabel lbl2 = null;
	JLabel lbl3 = null;
	JRadioButton plus;
	JRadioButton minus;
	JRadioButton umn;
	JRadioButton dev;
	String op = "";

	public OddPanel()
	{
		setLayout(null);
		lbl1 = new JLabel("Первое число: ");
		lbl2 = new JLabel("Второе число: ");
		txt1 = new JTextField();
		txt2 = new JTextField();
		btn1 = new JButton("Решить");
		lbl3 = new JLabel("Ответ");
		plus = new JRadioButton("+", true);
		minus = new JRadioButton("-");
		umn = new JRadioButton("*");
		dev = new JRadioButton("/");

		lbl1.setBounds(10, 10, 150, 18);
		txt1.setBounds(160, 10, 120, 20);
		lbl2.setBounds(10, 80, 150, 18);
		txt2.setBounds(160, 80, 120, 20);
		btn1.setBounds(10, 100, 120, 20);
		lbl3.setBounds(10, 140, 50, 50);
		plus.setBounds(10, 200, 50, 50);
		minus.setBounds(70, 200, 50, 50);
		umn.setBounds(130, 200, 50, 50);
		dev.setBounds(190, 200, 50, 50);

		add(lbl1);
		add(txt1);
		add(lbl2);
		add(txt2);
		add(btn1);
		add(lbl3);
		add(plus);
		add(minus);
		add(umn);
		add(dev);
		ButtonGroup group = new ButtonGroup();
		group.add(plus);
		group.add(minus);
		group.add(umn);
		group.add(dev);

		btn1.addActionListener(this);
		plus.addItemListener(this);
		minus.addItemListener(this);
		umn.addItemListener(this);
		dev.addItemListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int a = Integer.parseInt(txt1.getText());
		int b = Integer.parseInt(txt2.getText());
		lbl3.setText(""+Main.calc(a, b, op));;
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if(plus.isSelected()){
			op="+";
		}else if(minus.isSelected()){
			op="-";
		}else if(umn.isSelected()){
			op="*";
		}else{
			op="/";
		}
	}

}
