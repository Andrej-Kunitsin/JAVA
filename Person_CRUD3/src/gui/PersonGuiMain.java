package gui;

import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.SwingUtilities;

import api.CRUD;
import api.Person;

public class PersonGuiMain
{

	public static void main(String[] args) throws SQLException
	{
		
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				new FramePerson();
			}
		});
	}

}
