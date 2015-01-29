package qwe;

import javax.swing.JFrame;

public class FrameDraw extends JFrame
{

	public FrameDraw()
	{
		setTitle("App for add person");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 150, 600, 670);

		PanelDraw pd = new PanelDraw();
		pd.setBounds(200, 0, 400, 600);

		setLayout(null);
		add(pd);

		setVisible(true);

	}
}
