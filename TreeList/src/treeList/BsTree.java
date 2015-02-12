package treeList;

import java.util.ArrayList;
import java.util.List;

public class BsTree implements TreeInterface
{

	class Node
	{
		int data;
		Node rigth;
		Node left;

		public Node(int data)
		{
			this.data = data;
		}
	}

	Node root = null;
	private int[] arr;
	private int index;

	@Override
	public void clear()
	{
		root = null;

	}

	@Override
	public void add(int val)
	{
		if (root == null)
		{
			root = new Node(val);
		} else
		{
			addNode(root, val);
		}
	}

	private void addNode(Node p, int val)
	{
		if (val < p.data)
		{
			if (p.left == null)
			{
				p.left = new Node(val);
			} else
			{
				addNode(p.left, val);
			}
		} else
		{
			if (p.rigth == null)
			{
				p.rigth = new Node(val);
			} else
			{
				addNode(p.rigth, val);
			}
		}
	}

	@Override
	public void init(int[] array)
	{
		if (array == null || array.length == 0)
		{
			array = new int[0];
		}
		for (int i : array)
		{
			add(i);
		}
	}

	@Override
	public int[] toArray()
	{
		List<Integer> list = new ArrayList<Integer>();
		if (root == null || size() == 0)
		{

		} else
		{
			list = toArray(root, list);
		}
		int[] q = list.toArray(new Integer[list.size()]);
		return q;
	}

	private List<Integer> toArray(Node p, List<Integer> list)
	{
		if (p == null)
			return list;
		list = toArray(p.left, list);
		list.add(p.data);
		list = toArray(p.rigth, list);
		return list;
	}

	@Override
	public String toString()
	{
		arr = null;
		toArray();
		String string = "";
		for (int i : arr)
		{
			string = string + i + ", ";
		}
		return string.replaceFirst(", $", "");
	}

	@Override
	public int size()
	{
		return size(root);
	}

	private int size(Node p)
	{
		int count = 0;
		if (p == null)
			return count;
		count += size(p.left);
		count += 1;
		count += size(p.rigth);
		return count;
	}

	@Override
	public int countLeafs()
	{
		return countLeafs(root);
	}

	private int countLeafs(Node p)
	{
		int count = 0;
		if (p == null)
			return count;
		count += countLeafs(p.left);
		if (p.left == null && p.rigth == null)
			count += 1;
		count += countLeafs(p.rigth);
		return count;
	}

	@Override
	public int countNodes()
	{
		return countNodes(root);
	}

	private int countNodes(Node p)
	{
		int count = 0;
		if (p == null)
			return count;
		count += countLeafs(p.left);
		if (p.left != null && p.rigth != null)
			count += 1;
		count += countLeafs(p.rigth);
		return count;
	}

	@Override
	public int width()
	{
		return 0;
	}

	private void width(Node node, int index)
	{

	}

	@Override
	public int height()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print()
	{
		printNode(root);
	}

	private void printNode(Node p)
	{
		if (p == null)
			return;
		printNode(p.left);
		System.out.print(p.data + ", ");
		printNode(p.rigth);
	}

}
