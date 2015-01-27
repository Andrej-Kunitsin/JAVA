package work281214;

import javax.swing.SwingUtilities;

public class MainJTable
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				new Frame();
			}
		});

	}

}
