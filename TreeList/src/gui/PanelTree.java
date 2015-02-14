package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import treeList.BsTree;
import treeList.TreeInterface;

public class PanelTree extends JPanel {
	TreeInterface tree = new BsTree();
	
	public PanelTree() {
		setLayout(null);
		setBackground(Color.yellow);
		tree.init(getArrayDialog());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
	}
	private int[] getArrayDialog() {
		String[] string = JOptionPane.showInputDialog(
				"Введите числа через запятую(пример:5,3,2)").split(",");
		int i = 0;
		int[] arr = new int[string.length];
		for (String s : string) {
			arr[i++] = Integer.parseInt(s);
		}
		return arr;
	}

}
