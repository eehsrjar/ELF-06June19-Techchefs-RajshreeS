package com.techchefs.javaapp.classbean;

public class MyArray {

	private Object[] myArray;
	private int index;

	public MyArray() {
		this(10);
	}

	public MyArray(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be greater than zero");
		}
		myArray = new Object[size];
		index = 0;
	}

	public void add(Object obj) {
		if (index > myArray.length) {
			Object[] myNewArray = new Object[myArray.length * 2];
			System.arraycopy(myArray, 0, myNewArray, 0, myArray.length);
			myArray = myNewArray;
		}

		myArray[index++] = obj;
	}

	public void remove(int position) {
		if (position > myArray.length) {
			System.arraycopy(myArray, position + 1, myArray, position, (myArray.length - 1) - position);
			// for(int i=position;i<myArray.length-1 ;i++)
			// {
			// myArray[i]=myArray[i+1];
			// }
		} else {
			throw new ArrayIndexOutOfBoundsException("Array size out of bound");
		}

	}

	public Object get(int position) {
		if (position > myArray.length) {
			return myArray[position];
		} else {
			throw new ArrayIndexOutOfBoundsException("Array size out of bound");
		}

	}

	public int getSize() {
		return index - 1;
	}

}
