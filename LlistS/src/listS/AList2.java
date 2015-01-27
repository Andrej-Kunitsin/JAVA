package listS;

public class AList2 implements ExList {
	private int[] arr = new int[100];
	private int front = arr.length / 2;
	private int rear = front;

	@Override
	public void setArray(int[] a) {
		init(a);
	}

	@Override
	public void init(int[] a) {
		if (a == null) {
			throw new NullPointerException();
		}
		for (int i = 0; i < a.length; i++) {
			arr[rear++] = a[i];
		}
	}

	@Override
	public int[] getArray() {
		int[] temp = new int[size()];
		for (int i = 0; i < size(); i++) {
			temp[i] = arr[front + i];
		}
		return temp;
	}

	@Override
	public int[] toArray() {
		return getArray();
	}

	@Override
	public int size() {
		return rear - front;
	}

	@Override
	public void clear() {
		front = arr.length / 2;
		rear = front;
	}

	@Override
	public void addStart(int val) {
		arr[--front] = val;
	}

	@Override
	public void addEnd(int val) {
		arr[rear++] = val;

	}

	@Override
	public void addPos(int pos, int val) {
		rear++;
		int i = rear;
		while (i > front + pos) {
			arr[i] = arr[i - 1];
			i--;
		}
		arr[front + pos] = val;
	}

	@Override
	public void delPos(int pos) {
		if (size() == 0)
			throw new NegativeArraySizeException();
		for (int i = pos; i < size(); i++) {
			arr[front + i] = arr[front + 1 + i];
		}
		rear--;
	}

	@Override
	public void delStart() {
		if (size() == 0) {
			throw new NegativeArraySizeException();
		}
		front++;

	}

	@Override
	public void delEnd() {
		if (size() == 0) {
			throw new NegativeArraySizeException();
		}
		rear--;

	}

	@Override
	public int max() {
		if (size() == 0) {
			throw new IndexOutOfBoundsException();
		}
		int chMax = arr[front];
		for (int i = 0; i < size(); i++) {
			if (arr[front + i] > chMax) {
				chMax = arr[front + i];
			}
		}
		return chMax;
	}

	@Override
	public int min() {
		if (size() == 0) {
			throw new IndexOutOfBoundsException();
		}
		int chMax = arr[front];
		for (int i = 0; i < size(); i++) {
			if (arr[front + i] < chMax) {
				chMax = arr[front + i];
			}
		}
		return chMax;
	}

	@Override
	public int minIndex() {
		if (size() == 0) {
			throw new IndexOutOfBoundsException();
		}
		int indexRes = 0;
		int chMax = arr[front];
		for (int i = 1; i < size(); i++) {
			if (arr[front + i] < chMax) {
				chMax = arr[front + i];
				indexRes = i;
			}
		}
		return indexRes;
	}

	@Override
	public int maxIndex() {
		if (size() == 0) {
			throw new IndexOutOfBoundsException();
		}
		int indexRes = 0;
		int chMax = arr[front];
		for (int i = 1; i < size(); i++) {
			if (arr[front + i] > chMax) {
				chMax = arr[front + i];
				indexRes = i;
			}
		}
		return indexRes;
	}

	@Override
	public void reverse() {
		int[] resArr = new int[size()];
		int j = 0;
		for (int i = size() - 1; i >= 0; i--) {
			resArr[j] = arr[front + i];
			j++;
		}
		clear();
		init(resArr);
	}

	@Override
	public void sort() {
		for (int i = size() - 1; i >= 1; i--) {
			boolean sorted = true;
			for (int j = 0; j < i; j++) {
				if (arr[front + j] > arr[front + j + 1]) {
					int temp = arr[front + j];
					arr[front + j] = arr[front + j + 1];
					arr[front + j + 1] = temp;
					sorted = false;
				}
			}
			if (sorted) {
				break;
			}
		}

	}

	@Override
	public void set(int pos, int val) {
		if ((rear - front) == 0)
			throw new ArrayIndexOutOfBoundsException();
		arr[front + pos] = val;

	}

	@Override
	public int get(int pos) {
		if ((rear - front) == 0)
			throw new ArrayIndexOutOfBoundsException();
		return arr[front + pos];
	}
}
