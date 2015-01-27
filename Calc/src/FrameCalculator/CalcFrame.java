package FrameCalculator;

import javax.swing.JFrame;

public class CalcFrame extends JFrame
{
	public static final int HEIGHT_FRAME = 430;
	public static final int WIDTH_FRAME = 290;

	public CalcFrame()
	{
		setTitle("App for odd calculation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 150, WIDTH_FRAME, HEIGHT_FRAME);
		CalcPanel calcPanel = new CalcPanel();
		add(calcPanel);
		setVisible(true);
	}
}
