package treeList;

public interface TreeInterface
{
	int size();
	void add(int val);
	void init(int[]array);
	int[] toArray();
	String toString();
	int countLeafs();
	int countNodes();
	int width();
	int height();
}
