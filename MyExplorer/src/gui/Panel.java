package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Panel extends JPanel implements ActionListener,TreeSelectionListener
{

	private JButton button;
	private JTextField textField;
	private JTree tree;
	private DefaultMutableTreeNode root;
	private DefaultTreeModel treeModel;
	private JList<String> list;

	public Panel()
	{
		setLayout(null);
		textField = new JTextField("/home/jack_killer/Google Drive");
		textField.setColumns(10);
		textField.setBounds(20, 5, 200, 20);
		button = new JButton("Display");
		button.setBounds(220, 5, 50, 20);
		root = new DefaultMutableTreeNode();
		treeModel = new DefaultTreeModel(root);
		tree = new JTree(treeModel);
		JScrollPane scrollPane = new JScrollPane(tree);
		scrollPane.setBounds(20, 50, 250, 440);
		list = new JList<String>();
		list.setBounds(290, 5, 250, 485);

		add(textField);
		add(button);
		add(scrollPane);
		add(list);

		tree.addTreeSelectionListener(this);

		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		String pathname = textField.getText();
		root.setUserObject(pathname);
		
		repaint();
		readFolders(new File(pathname), root);
	}

	public void readFolders(File path, DefaultMutableTreeNode newNode)
	{
		File[] files = path.listFiles();
		Arrays.sort(files);
		for (File i : files)
		{
			DefaultMutableTreeNode child = new DefaultMutableTreeNode(
					i.getName());
			if (i.isDirectory())
			{	
				newNode.add(child);
				readFolders(i, child);
			}else{
				newNode.add(child);
			}
		}
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e)
	{
		DefaultMutableTreeNode selectednode = (DefaultMutableTreeNode) e
				.getPath().getLastPathComponent();
		Enumeration<DefaultMutableTreeNode> enum1 = selectednode
				.children();
		DefaultMutableTreeNode child;
		List<String> arrlist  = new ArrayList<String>();
		while (enum1.hasMoreElements())
		{
			child = (DefaultMutableTreeNode) enum1.nextElement();
			if (child.isLeaf())
			{
				arrlist.add(child.toString());
			}
		}
		list.setModel(new AbstractListModel(arrlist));
	}
}


