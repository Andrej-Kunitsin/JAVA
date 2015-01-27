package listS;

public class AList0 implements ExList {
	private int[] ar = {};

	@Override
	public void setArray(int[] a) {
		init(a);

	}

	@Override
	public void init(int[] a) {
		if (a == null) {
			throw new NullPointerException();
		} else if (a.length == 0) {
			ar = new int[0];
			return;
		}
		int[] tmp = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			tmp[i] = a[i];
		}
		ar = tmp;
	}

	@Override
	public int size() {
		return ar.length;
	}

	@Override
	public int max() {
		if (ar.length == 0)
			throw new IndexOutOfBoundsException();
		int res = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > res) {
				res = ar[i];
			}
		}
		return res;
	}

	@Override
	public int min() {
		if (ar.length == 0) {
			throw new IndexOutOfBoundsException();
		}
		int res = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < res) {
				res = ar[i];
			}
		}
		return res;
	}

	@Override
	public int minIndex() {
		if (ar.length == 0) {
			throw new IndexOutOfBoundsException();
		}
		int res = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < ar[res]) {
				res = i;
			}
		}
		return res;
	}

	@Override
	public int maxIndex() {
		if (ar.length == 0) {
			throw new IndexOutOfBoundsException();
		}
		int res = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > ar[res]) {
				res = i;
			}
		}
		return res;
	}

	@Override
	public void reverse() {
		int[] resArr = new int[ar.length];
		int j = 0;
		for (int i = ar.length - 1; i >= 0; i--) {
			resArr[j] = ar[i];
			j++;
		}
		ar = resArr;
	}

	@Override
	public void sort() {
		for (int i = ar.length - 1; i >= 1; i--) {
			boolean sorted = true;
			for (int j = 0; j < i; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
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
		int[] ret = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			ret[i] = ar[i];
		}
		return ret;
	}

	@Override
	public int[] getArray() {
		return this.toArray();
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < ar.length; i++) {
			str += ar[i] + ", ";
		}
		return str;
	}

	@Override
	public void set(int pos, int val) {
		ar[pos] = val;
	}

	@Override
	public int get(int pos) {
		return ar[pos];
	}

	@Override
	public void addStart(int val) {
		if (ar == null) {
			throw new NullPointerException();
		}
		int[] tmp = new int[ar.length + 1];
		for (int i = 1; i < tmp.length; i++) {
			tmp[i] = ar[i - 1];
		}
		tmp[0] = val;
		ar = tmp;
	}

	@Override
	public void addEnd(int val) {
		int[] newArr = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			newArr[i] = ar[i];
		}
		newArr[newArr.length - 1] = val;
		ar = newArr;
	}

	@Override
	public void addPos(int pos, int val) {
		if (ar == null) {
			throw new NullPointerException();
		} else if (pos > ar.length) {
			throw new NullPointerException();
		}
		int[] temp = new int[ar.length + 1];
		for (int i = 0; i < pos; i++) {
			temp[i] = ar[i];
		}
		temp[pos] = val;
		for (int i = pos + 1; i < temp.length; i++) {
			temp[i] = ar[i - 1];
		}
		ar = temp;
	}

	@Override
	public void delStart() {
		if (ar.length == 0) {
			throw new NegativeArraySizeException();
		}
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = ar[i + 1];
		}
		ar = temp;
	}

	@Override
	public void delEnd() {
		if (ar.length == 0) {
			throw new NegativeArraySizeException();
		}
		int[] newArr = new int[ar.length - 1];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = ar[i];
		}
		ar = newArr;
	}

	@Override
	public void delPos(int pos) {
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < pos; i++) {
			temp[i] = ar[i];
		}
		for (int i = pos; i < temp.length; i++) {
			temp[i] = ar[i + 1];
		}
		ar = temp;
	}

	@Override
	public void clear() {
		init(new int[0]);
	}
}
