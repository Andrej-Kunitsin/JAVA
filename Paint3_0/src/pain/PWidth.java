package pain;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PWidth extends JPanel
{

	public PWidth(PCommands cmd)
	{
		setLayout(null);

		setBackground(Color.red);
		JButton btnWidth = new JButton("Width 10");
		btnWidth.setBounds(10, 10, 120, 20);
		add(btnWidth);

		btnWidth.addActionListener(cmd.wCmd10);
	}
}
