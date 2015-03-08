package myNew;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Qwe extends JPanel {
	private static final long serialVersionUID = 1L;
	JButton top = new JButton();
	JButton bottom = new JButton();
	JButton left = new JButton();
	JButton rigth = new JButton();
	JButton centr = new JButton();
	JButton topLeft = new JButton();
	JButton topRigth = new JButton();
	JButton bottomLeft = new JButton();
	JButton buttomRigt = new JButton();

	public Qwe(PanelFigure figure) {
		top.setBounds(figure.getWidth()/2-5, 0, 10, 10);
		bottom.setBounds(figure.getWidth()/2-5, figure.getHeight()-10, 10, 10);
		left.setBounds(0, figure.getHeight()/2-5, 10, 10);
		rigth.setBounds(figure.getWidth()-10, figure.getHeight()/2-5, 10, 10);
		topLeft.setBounds(0, 0, 10, 10);
		topRigth.setBounds(figure.getWidth()-10, 0, 10, 10);
		bottomLeft.setBounds(0, figure.getHeight()-10, 10, 10);
		buttomRigt.setBounds(figure.getWidth()-10, figure.getHeight()-10, 10, 10);
		centr.setBounds(figure.getWidth()/2-5, figure.getHeight()/2-5, 10, 10);
		
		figure.add(top);
		figure.add(bottom);
		figure.add(rigth);
		figure.add(left);
		figure.add(centr);
		figure.add(topLeft);
		figure.add(topRigth);
		figure.add(bottomLeft);
		figure.add(buttomRigt);
		}
}
