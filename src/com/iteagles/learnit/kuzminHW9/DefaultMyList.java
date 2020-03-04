package com.iteagles.learnit.kuzminHW9;

public class DefaultMyList implements MyList {
	
	private Object[] array = new Object[10];
	private int size;

	@Override
	public void add(Object e) {
		if (array.length <= size) {
			changeOfSize();
			array[size++] = e;
		} else {
			array[size++] = e;
		}
	}

	private void changeOfSize() {
		Object[] newArr = new Object[(int) (array.length * 2)];
		for (int i = 0; i < array.length; i++) {
			newArr[i] = array[i];
		}
		array = newArr;
	}

	@Override
	public void clear() {
		array = new Object[10];
		size = 0;
	}

	@Override
	public boolean remove(Object o) {

		for (int i = 0; i < array.length; i++) {
			if (o.equals(array[i])) {
				size--;
				for (int j = i; j < size; j++) {
					array[j] = array[j + 1];
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		return array;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < size; i++) {
			if (array[i] == o) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		Object[] arr2 = c.toArray();
		int countEquals = 0;
		int i = 0;

		while (i < arr2.length) {
			int j = 0;
			while (true) {
				if (j < size) {
					if (!array[j].equals(arr2[i])) {
						j++;
					}
					countEquals++;
				}
				i++;
				break;
			}
		}
		if (countEquals == arr2.length) {
			return true;
		}
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');

		for (int i = 0; i < size; i++) {
			sb.append("[");
			sb.append(array[i]);
			sb.append("]");
			if (i < size - 1) {
				sb.append(',');
			}
		}
		sb.append('}');
		return sb.toString();
	}

}
