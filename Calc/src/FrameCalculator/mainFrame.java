package FrameCalculator;

import javax.swing.SwingUtilities;

public class mainFrame
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new CalcFrame();
			}
		});
	}
}
