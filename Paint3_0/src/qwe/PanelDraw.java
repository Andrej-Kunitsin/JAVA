package qwe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelDraw extends JPanel
	{
	JButton open; 
	JButton save;

	public PanelDraw()
	{
		open = new JButton("open");
		save = new JButton("save");
		add(open);
		add(save);
		open.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
	}

}