package work121114_RadioButton;

import javax.swing.JFrame;


public class OddFrame extends JFrame 
{
	public OddFrame() 
	{
		setTitle("App for odd calculation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 150, 600, 600);
		add( new OddPanel() );
		setVisible(true);
	}
}
