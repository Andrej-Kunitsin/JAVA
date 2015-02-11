package treeList;

public class TreeList implements TreeInterface
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

	@Override
	public void init(int[] array)
	{
		if(array==null){
			array = new int[0];
		}
		for (int i : array)
		{
			add(i);
		}
	}

	@Override
	public void add(int val)
	{
		if (root == null)
		{
			root = new Node(val);
		} else
		{
			add(root, val);
		}
	}

	private void add(Node node, int val)
	{
		if (val < node.data)
		{
			if (node.left == null)
			{
				node.left = new Node(val);
			} else
			{
				add(node.left, val);
			}
		} else
		{
			if (node.rigth == null)
			{
				node.rigth = new Node(val);
			} else
			{
				add(node.rigth, val);
			}
		}
	}

	@Override
	public int size()
	{
		int count = 0;
		if (root == null)
		{
			return 0;
		} else
		{
			count = 1;
			count = size(root, count);
		}

		return count;
	}

	private int size(Node node, int count)
	{
		if (node.left != null)
		{
			count = size(node.left, count) + 1;
		}
		if (node.rigth != null)
		{
			count = size(node.rigth, count) + 1;
		}
		return count;
	}

	int[] arr;
	int index = 0;

	@Override
	public int[] toArray()
	{
		if (root == null || size() == 0)
		{
			arr = new int[0];
		} else
		{
			arr = new int[size()];
			toArray(root);
		}
		return arr;
	}

	private void toArray(Node node)
	{
		if (node.left != null)
		{
			toArray(node.left);

		}
		arr[index++] = node.data;
		if (node.rigth != null)
		{
			toArray(node.rigth);
		}
	}

	@Override
	public String toString()
	{
		arr=null;
		toArray();
		String string="";
		for(int i:arr){
			string=string+i+", ";
		}
		return string.replaceFirst(", $", "");
	}

	@Override
	public int countLeafs()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countNodes()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int width()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
