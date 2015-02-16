package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import treeList.BsTree;
import treeList.BsTree.Node;

public class PanelTree extends JPanel
{
	Graphics2D g;
	BufferedImage image;

	public PanelTree()
	{
		setLayout(null);
		setBackground(Color.yellow);
		setBounds(0, 0, 450, 300);
		image = new BufferedImage(450, 300, BufferedImage.TYPE_INT_ARGB);
		image.getGraphics().fillRect(0, 0, 450, 300);
		g = (Graphics2D) image.getGraphics();
		g.setColor(Color.BLUE);
		BsTree tree = new BsTree();
		tree.init(new int[] { 5, 3, 7, 6 });
		paintTree(tree.getNode());
		// this.repaint();

	}

	private void paintTree(Node root)
	{
		if (root == null)
		{
			return;
		} else
		{
			nodePaint(root.data);
			paintTree(root.left);
			paintTree(root.rigth);
		}
	}

	private void nodePaint(int data)
	{
		g.drawOval(image.getWidth() / 2, 20, 40, 40);
		g.drawString("" + data, 125, 125);
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		System.out.println("sdfasdf");
		g.drawImage(image, 0, 0, null);
	}
}
