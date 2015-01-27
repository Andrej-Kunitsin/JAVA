package pain;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PFigure extends JPanel
{
	public PFigure(PCommands cmd)
	{
		setBackground(Color.green);
		setLayout(null);
		JButton rectangleButton = new JButton("Квадрат");
		JButton triangleButton = new JButton("Триугольник");
		JButton circleButton = new JButton("Круг");
		JButton fRectangleButton = new JButton("Квадрат закругленный");
		JButton freeButton = new JButton("Карандаш");

		rectangleButton.setBounds(10, 10, 120, 20);
		triangleButton.setBounds(10, 40, 120, 20);
		circleButton.setBounds(10, 70, 120, 20);
		fRectangleButton.setBounds(10, 100, 120, 20);
		freeButton.setBounds(10, 130, 120, 20);

		add(rectangleButton);
		add(triangleButton);
		add(circleButton);
		add(fRectangleButton);
		add(freeButton);

		rectangleButton.addActionListener(cmd.rect);
		triangleButton.addActionListener(cmd.triangl);
		circleButton.addActionListener(cmd.circle);
		fRectangleButton.addActionListener(cmd.fRectangle);
		freeButton.addActionListener(cmd.free);
	}
}
