package com.paytm.stack;

public class ArrayStack<E> extends AbstractStack<E> {
	private E[] elements;

	private static final int INITIAL_CAPACITY = 100;

	public ArrayStack() {
		elements = (E[]) new Object[INITIAL_CAPACITY];
	}

	public ArrayStack(int capacity) {
		elements = (E[]) new Object[capacity];
	}

	@Override
	public E peek() {

		if (size == 0) {
			throw new java.util.EmptyStackException();
		}
		return elements[size - 1]; // top of stack
	}

	@Override
	public E pop() {

		if (size == 0) {
			throw new java.util.EmptyStackException();
		}
		E element = elements[--size];
		elements[size] = null;
		return element;
	}

	@Override
	public void push(E element) {
		if (size == elements.length) {
			resize();
		}
		elements[size++] = element;
	}

	private void resize() {
		assert size == elements.length;
		Object[] a = new Object[2 * size];
		System.arraycopy(elements, 0, a, 0, size);
		elements = (E[]) a;
	}

}
