package myNew;

import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame() {
		setLayout(null);
		setTitle("App for add person");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 150, 600, 670);

		Sets s = new Sets();
		s.mFigure = Figures.Rectangl;
		PanelDraw pd = new PanelDraw(s);
		PanelButton pb = new PanelButton(s);
		Menu menu = new Menu(pd);
		setJMenuBar(menu);

		pd.setBounds(200, 0, 400, 600);
		pb.setBounds(0, 0, 200, 200);

		add(pd);
		add(pb);

		setVisible(true);
	}
}
