package gui;


public class BsTree {

	class Node {
		int data;
		Node rigth;
		Node left;

		public Node(int data) {
			this.data = data;
		}
	}

	Node root = null;

	public void add(int val) {
		if (root == null) {
			root = new Node(val);
		} else {
			addNode(root, val);
		}
	}

	private void addNode(Node p, int val) {
		if (val < p.data) {
			if (p.left == null) {
				p.left = new Node(val);
			} else {
				addNode(p.left, val);
			}
		} else {
			if (p.rigth == null) {
				p.rigth = new Node(val);
			} else {
				addNode(p.rigth, val);
			}
		}
	}

}
