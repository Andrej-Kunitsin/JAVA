package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import api.CRUD;
import api.Person;

public class PersonDialog extends JDialog
{
	JLabel idLable;
	JLabel fNameLable;
	JLabel lNameLable;
	JLabel ageLable;
	JTextField idTextField;
	JTextField fNameTextField;
	JTextField lNameTextField;
	JTextField ageTextField;
	JButton btnOk;
	JButton btnCancel;

	public PersonDialog(String s){
		this(s,new Person());
	}
	public PersonDialog(String s,Person p)
	{
		setSize(235, 200);
		setLayout(null);
		setModal(true);

		idLable = new JLabel("ID");
		fNameLable = new JLabel("FName");
		lNameLable = new JLabel("LName");
		ageLable = new JLabel("Age");

		idTextField = new JTextField(String.valueOf(p.getId()));
		fNameTextField = new JTextField(p.getFName());
		lNameTextField = new JTextField(p.getLName());
		ageTextField = new JTextField(String.valueOf(p.getAge()));

		btnOk = new JButton(s);
		btnCancel = new JButton("Cancel");

		idLable.setBounds(5, 5, 100, 30);
		fNameLable.setBounds(5, 40, 100, 30);
		lNameLable.setBounds(5, 75, 100, 30);
		ageLable.setBounds(5, 110, 100, 30);

		idTextField.setBounds(110, 5, 120, 30);
		fNameTextField.setBounds(110, 40, 120, 30);
		lNameTextField.setBounds(110, 75, 120, 30);
		ageTextField.setBounds(110, 110, 120, 30);

		btnOk.setBounds(15, 150, 90, 30);
		btnCancel.setBounds(110, 150, 90, 30);

		add(idLable);
		add(fNameLable);
		add(lNameLable);
		add(ageLable);
		add(idTextField);
		add(fNameTextField);
		add(lNameTextField);
		add(ageTextField);
		add(btnOk);
		add(btnCancel);

		btnOk.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (!idTextField.getText().equals("")
						&& !fNameTextField.getText().equals("")
						&& !lNameTextField.getText().equals("")
						&& !ageTextField.getText().equals(""))
				{
					CRUD crud = new CRUD();
					Person person = new Person(Integer.parseInt(idTextField
							.getText()), fNameTextField.getText(),
							lNameTextField.getText(), Integer
									.parseInt(ageTextField.getText()));
					try
					{
						if (e.getActionCommand().equals("New"))
						{
							crud.createPerson(person);
							JOptionPane.showMessageDialog(null,
									"Новая персона записана в БД");
						} else if (e.getActionCommand().equals("Edit"))
						{
							crud.updatePerson(person);
							JOptionPane.showMessageDialog(null,
									"Запись в БД обновлена");
						}
					} catch (SQLException e1)
					{
						JOptionPane.showMessageDialog(null,
								"Чтото ввели не правильно");
						e1.printStackTrace();
					}

				} else
				{
					JOptionPane.showMessageDialog(null,
							"Чтото ввели не правильно");
				}
				dispose();
			}
		});
		btnCancel.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
	}
}
