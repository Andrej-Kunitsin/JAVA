package listS;

public class LList2 implements ExList {
	boolean flagLength0 = false;

	private class Node {
		int data;
		Node next = null;
		Node prev = null;

		public Node(int val) {
			data = val;
		}
	}

	Node root = null;

	@Override
	public void setArray(int[] a) {
		init(a);

	}

	@Override
	public void init(int[] a) {
		if (a.length == 0) {
			addStart(0);
			flagLength0 = true;
		} else {
			for (int i = a.length - 1; i >= 0; i--) {
				addStart(a[i]);
			}
		}
	}

	@Override
	public int size() {
		if (flagLength0)
			return 0;
		int count = 1;
		Node tmp = root;
		while (tmp.next != null) {
			tmp = tmp.next;
			count++;
		}
		return count;
	}

	@Override
	public void clear() {
		flagLength0 = true;
		root.data = 0;
		root.next = null;
		root.prev = root;
	}

	@Override
	public void addStart(int val) {
		if (flagLength0) {
			root.data = val;
			flagLength0 = false;
		} else {
			Node tmp = new Node(val);
			if (root == null) {
				root = tmp;
				root.prev = root;
			} else {
				tmp.next = root;
				tmp.prev = root.prev;
				root.prev = tmp;
				root = tmp;
			}
		}
	}

	@Override
	public void addEnd(int val) {
		if (flagLength0) {
			root.data = val;
			flagLength0 = false;
		} else {
			Node tmp = new Node(val);
			if (root == null) {
				root = tmp;
				root.prev = root;
				return;
			} else {
				root.prev.next = tmp;
				tmp.prev = root.prev;
				root.prev = tmp;
			}
		}
	}

	@Override
	public void addPos(int pos, int val) {
		int size = size();
		Node tmp = new Node(val);
		Node rootTmp;
		if (pos >= size && !flagLength0) {
			throw new IndexOutOfBoundsException();
		}
		if (flagLength0) {
			root.data = val;
			flagLength0 = false;
		} else if (pos == 0) {
			addStart(val);
		} else if (pos == size) {
			addEnd(val);
		} else {
			if (pos <= size / 2) {
				rootTmp = root;
				for (int i = 0; i < pos; i++) {
					rootTmp = rootTmp.next;
				}
			} else {
				rootTmp = root.prev;
				for (int i = 1; i < size - pos; i++) {
					rootTmp = rootTmp.prev;
				}
			}
			rootTmp.prev.next = tmp;
			tmp.prev = rootTmp.prev;
			tmp.next = rootTmp;
			rootTmp.prev = tmp;
		}
	}

	@Override
	public void delStart() {
		if (flagLength0) {
			throw new NegativeArraySizeException();
		}
		if (size() == 1) {
			flagLength0 = true;
		} else {
			root.next.prev = root.prev;
			root = root.next;
		}
	}

	@Override
	public void delEnd() {
		if (flagLength0) {
			throw new NegativeArraySizeException();
		}
		if (size() == 1) {
			flagLength0 = true;
		} else {
			root.prev = root.prev.prev;
			root.prev.next = null;
		}
	}

	@Override
	public void delPos(int pos) {
		int size = size();
		if (flagLength0) {
			throw new NegativeArraySizeException();
		}
		if (size == 1) {
			flagLength0 = true;
		} else {
			Node rootTmp;
			if (pos == 0) {
				delStart();
			} else if (pos == size - 1) {
				delEnd();
			} else {
				if (pos <= size / 2) {
					rootTmp = root;
					for (int i = 0; i < pos; i++) {
						rootTmp = rootTmp.next;
					}
				} else {
					rootTmp = root.prev;
					for (int i = 1; i < size - pos; i++) {
						rootTmp = rootTmp.prev;
					}
				}
				rootTmp.prev.next = rootTmp.next;
				rootTmp.next.prev = rootTmp.prev;
			}
		}
	}

	@Override
	public int max() {
		if (flagLength0) {
			throw new IndexOutOfBoundsException();
		}
		Node tmp = root.next;
		int res = root.data;
		while (tmp != null) {
			if (tmp.data > res) {
				res = tmp.data;
			}
			tmp = tmp.next;
		}
		return res;
	}

	@Override
	public int min() {
		if (flagLength0) {
			throw new IndexOutOfBoundsException();
		}
		Node tmp = root.next;
		int res = root.data;
		while (tmp != null) {
			if (tmp.data < res) {
				res = tmp.data;
			}
			tmp = tmp.next;
		}
		return res;
	}

	@Override
	public int minIndex() {
		if (flagLength0) {
			throw new IndexOutOfBoundsException();
		}
		Node tmp = root.next;
		int min = root.data;
		int count = 1;
		int res = 0;
		while (tmp != null) {
			if (tmp.data < min) {
				min = tmp.data;
				res = count;
			}
			tmp = tmp.next;
			count++;
		}
		return res;
	}

	@Override
	public int maxIndex() {
		if (flagLength0) {
			throw new IndexOutOfBoundsException();
		}
		Node tmp = root.next;
		int max = root.data;
		int count = 1;
		int res = 0;
		while (tmp != null) {
			if (tmp.data > max) {
				max = tmp.data;
				res = count;
			}
			tmp = tmp.next;
			count++;
		}
		return res;
	}

	@Override
	public void reverse() {
		if (flagLength0) {
			return;
		}
		Node temp = root;
		root = null;
		while (temp != null) {
			addStart(temp.data);
			temp = temp.next;
		}
	}

	@Override
	public void sort() {
		for (int i = size() - 1; i >= 1; i--) {
			boolean sorted = true;
			for (int j = 0; j < i; j++) {
				if (get(j) > get(j + 1)) {
					int temp = get(j);
					set(j, get(j + 1));
					set(j + 1, temp);
					sorted = false;
				}
			}
			if (sorted) {
				break;
			}
		}
	}

	@Override
	public int[] toArray() {
		Node tmp = root;
		int[] res = new int[size()];
		for (int i = 0; i < size(); i++) {
			res[i] = tmp.data;
			tmp = tmp.next;
		}
		return res;
	}

	@Override
	public int[] getArray() {
		return toArray();
	}

	@Override
	public void set(int pos, int val) {
		if (flagLength0) {
			throw new IndexOutOfBoundsException();
		}
		int size = size();
		Node rootTmp;
		if (pos == 0) {
			root.data = val;
		} else if (pos == size) {
			root.prev.data = val;
		} else {
			if (pos <= size / 2) {
				rootTmp = root;
				for (int i = 0; i < pos; i++) {
					rootTmp = rootTmp.next;
				}
			} else {
				rootTmp = root.prev;
				for (int i = 1; i < size - pos; i++) {
					rootTmp = rootTmp.prev;
				}
			}
			rootTmp.data = val;
		}
	}

	@Override
	public int get(int pos) {
		if (flagLength0) {
			throw new IndexOutOfBoundsException();
		}
		int size = size();
		Node rootTmp;
		if (pos == 0) {
			return root.data;
		} else if (pos == size) {
			return root.prev.data;
		} else {
			if (pos <= size / 2) {
				rootTmp = root;
				for (int i = 0; i < pos; i++) {
					rootTmp = rootTmp.next;
				}
			} else {
				rootTmp = root.prev;
				for (int i = 1; i < size - pos; i++) {
					rootTmp = rootTmp.prev;
				}
			}
			return rootTmp.data;
		}
	}

}
