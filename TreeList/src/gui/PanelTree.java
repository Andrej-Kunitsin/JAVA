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
	Graphics2D graph;
	BufferedImage image;

	public PanelTree()
	{
		setLayout(null);
		setBackground(Color.yellow);
		setBounds(0, 0, 450, 300);
		image = new BufferedImage(450, 300, BufferedImage.TYPE_INT_ARGB);
		image.getGraphics().fillRect(0, 0, 450, 300);
		graph = (Graphics2D) image.getGraphics();
		graph.setColor(Color.BLUE);

		BsTree tree = new BsTree();
		tree.init(new int[] { 5, 3, 7, 6, 10,2 });
		int x = image.getWidth() / 2;
		int y = 10;
		paintTree(tree.getNode(), x, y);
		// this.repaint();

	}

	private void paintTree(Node root, int x, int y)
	{
		if (root == null)
		{
			return;
		} else
		{
			nodePaint(root.data, x, y);
			if (root.left != null)
			{
				graph.drawLine(x+15, y+30, x - 35, y + 50);
				paintTree(root.left, x - 50, y + 50);
			}
			if (root.rigth != null)
			{
				graph.drawLine(x+15, y+30, x + 65, y + 50);
				paintTree(root.rigth, x + 50, y + 50);
			}
		}
	}

	private void nodePaint(int data, int x, int y)
	{
		graph.drawOval(x, y, 30, 30);
		graph.drawString("" + data, x + 12, y + 20);
		repaint();
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		System.out.println("sdfasdf");
		g.drawImage(image, 0, 0, null);
	}
}
