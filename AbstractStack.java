package com.paytm.stack;

/*When parts of an implementation are independent of the 
underlying data structure, it is advantageous to implement 
those parts separately in an abstract class.*/

public abstract class AbstractStack<E> implements Stack<E> {

	/*size declared protected instead of private 
	so that it can be accessed
	by the extending concrete classes*/
	protected int size;

	public boolean isEmpty() {
		return (size == 0);
	}

	abstract public E peek();

	abstract public E pop();

	abstract public void push(E element);

	public int size() {
		return size;
	}
}
