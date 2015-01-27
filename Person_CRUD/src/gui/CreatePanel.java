package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import api.CRUD;
import api.Person;

public class CreatePanel extends JPanel
{
	JLabel lableId;
	JLabel lableFName;
	JLabel lableLName;
	JLabel lableAgeName;
	JTextField fieldId;
	JTextField fieldFName;
	JTextField fieldLName;
	JTextField fieldAge;
	JButton mButton;
	TablePanel tablePanel;

	public CreatePanel(TablePanel tablePanel)
	{
		this.tablePanel = tablePanel;
		setLayout(null);
		setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

		lableId = new JLabel("ID");
		lableId.setBounds(5, 5, 50, 20);
		lableFName = new JLabel("FName");
		lableFName.setBounds(5, 30, 50, 20);
		lableLName = new JLabel("LName");
		lableLName.setBounds(5, 55, 50, 20);
		lableAgeName = new JLabel("Age");
		lableAgeName.setBounds(5, 80, 50, 20);
		fieldId = new JTextField();
		fieldId.setBounds(60, 5, 100, 20);
		fieldFName = new JTextField();
		fieldFName.setBounds(60, 30, 100, 20);
		fieldLName = new JTextField();
		fieldLName.setBounds(60, 55, 100, 20);
		fieldAge = new JTextField();
		fieldAge.setBounds(60, 80, 100, 20);

		mButton = new JButton("Create");
		mButton.setBounds(5, 120, 120, 20);

		add(lableId);
		add(fieldId);
		add(lableFName);
		add(fieldFName);
		add(lableLName);
		add(fieldLName);
		add(lableAgeName);
		add(fieldAge);
		add(mButton);

		mButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				switch (e.getActionCommand())
				{
				case "Create":
					try
					{
						Person person = new Person(Integer.parseInt(fieldId
								.getText()), fieldFName.getText(), fieldLName
								.getText(),
								Integer.parseInt(fieldAge.getText()));
						CRUD crud = new CRUD();
						crud.createPerson(person);
						JOptionPane
								.showMessageDialog(
										null,
										("Была выполнена вставка в БД с запросом:" + crud.query));
					} catch (Exception e1)
					{
						JOptionPane.showMessageDialog(null,
								("Была допущена ошибка ввода" + e1));
					}
					break;

				case "Read":
				{
					JOptionPane.showMessageDialog(null, "Раздел в разработке");
				}
					break;

				case "Update":
					try
					{
						Person person = new Person(Integer.parseInt(fieldId
								.getText()), fieldFName.getText(), fieldLName
								.getText(),
								Integer.parseInt(fieldAge.getText()));
						CRUD crud = new CRUD();
						crud.updatePerson(person);
						JOptionPane.showMessageDialog(null,
								"Было выполнено замена в БД с запросом:"
										+ crud.query);
					} catch (NumberFormatException | SQLException e1)
					{
						JOptionPane.showMessageDialog(null,
								"Была допущена ошибка ввода" + e1);
					}
					break;

				case "Delete":
					try
					{
						Person person = new Person();
						person.setId(Integer.parseInt(fieldId.getText()));
						CRUD crud = new CRUD();
						crud.deletePerson(person);
						JOptionPane.showMessageDialog(null,
								"Было выполнено удаление из БД с запросом:"
										+ crud.query);
					} catch (NumberFormatException | SQLException e1)
					{
						JOptionPane.showMessageDialog(null,
								"Была допущена ошибка ввода" + e1);
					}
					break;
				default:
					break;
				}
			}
		});

	}

	public void setTextButton(String string)
	{
		mButton.setText(string);
	}

}
