package gui;

import java.sql.SQLException;

import javax.swing.SwingUtilities;

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
