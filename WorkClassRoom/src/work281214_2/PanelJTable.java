package work281214_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelJTable extends JPanel
{

	JButton buttonOpen;
	JButton buttonSave;
	JButton buttonColor;
	JButton buttonPerson;
	JButton buttonOK;
	JButton buttonYN;
	JLabel labelOpen;
	JLabel labelSave;
	JLabel labelColor;
	JLabel labelPerson;
	JLabel lableYN;

	public PanelJTable()
	{
		buttonOpen = new JButton("Open");
		buttonSave = new JButton("Save");
		buttonColor = new JButton("Color");
		buttonPerson = new JButton("Person");
		buttonOK = new JButton("ОК");
		buttonYN = new JButton("YesNo");

		setLayout(null);
		buttonOpen.setBounds(5, 5, 100, 20);
		buttonSave.setBounds(5, 30, 100, 20);
		buttonColor.setBounds(5, 55, 100, 20);
		buttonPerson.setBounds(5, 80, 100, 20);
		buttonOK.setBounds(5, 105, 100, 20);
		buttonYN.setBounds(5, 130, 100, 20);

		labelOpen = new JLabel("Данные");
		labelSave = new JLabel("Данные");
		labelColor = new JLabel("Данные");
		labelPerson = new JLabel("Данные");
		lableYN = new JLabel("Данные");

		labelOpen.setBounds(110, 5, 100, 20);
		labelSave.setBounds(110, 30, 100, 20);
		labelColor.setBounds(110, 55, 100, 20);
		labelPerson.setBounds(110, 80, 100, 20);
		lableYN.setBounds(110, 130, 100, 20);

		add(buttonOpen);
		add(buttonSave);
		add(buttonColor);
		add(buttonPerson);
		add(labelOpen);
		add(labelSave);
		add(labelColor);
		add(labelPerson);
		add(buttonOK);
		add(lableYN);
		add(buttonYN);

		buttonOK.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{

				JOptionPane pane = new JOptionPane();
				JOptionPane.showMessageDialog(null, "титл");
			}
		});
		buttonYN.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane pane = new JOptionPane();
				int i = JOptionPane.showConfirmDialog(null, "yes or no", null,
						JOptionPane.YES_NO_OPTION);
				if (i == 0)
				{
					lableYN.setText("Yes");
				} else
				{
					lableYN.setText("NO");
				}
			}
		});
	}
}