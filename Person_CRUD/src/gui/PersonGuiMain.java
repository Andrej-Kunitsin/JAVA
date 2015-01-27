package gui;

import javax.swing.SwingUtilities;

public class PersonGuiMain
{

	public static void main(String[] args)
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
