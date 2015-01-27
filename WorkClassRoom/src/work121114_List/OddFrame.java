package work121114_List;

import javax.swing.JFrame;


public class OddFrame extends JFrame 
{
	public OddFrame() 
	{
		setTitle("App for odd calculation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 150, 400, 350);
		add( new OddPanel() );
		setVisible(true);
	}
}
