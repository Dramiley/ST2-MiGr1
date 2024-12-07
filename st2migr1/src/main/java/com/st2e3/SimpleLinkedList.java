/*
 * (c) 2013-2024  Heinrich Hussmann und Uwe Aßmann, TU Dresden
 */
package com.st2e3;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Achtung! Einige der Methoden sind fehlerhaft und müssen repariert werden.
 */
public class SimpleLinkedList<E> extends AbstractCollection<E> {
	private class Elem {
		private E elem;
		private Elem next;

		public Elem(E elem, Elem next) {
			this.elem = elem;
			this.next = next;
		}
	}

	private Elem start = null;
	private Elem end = null;
	private int size = 0;

	@Override
	public boolean add(E o) {
		
		if (end==null) {
			end = new Elem(o, null);
			start = end;
		} else {
			end.next = new Elem(o, null);
			end = end.next;
		}
		size++;
		return true;
	}

	@Override
	public int size() {
		return size;
	}

	private class Iter implements Iterator<E> {
		private Elem current;

		public Iter() {
			current = start;
		}

		@Override
		public boolean hasNext() {
			if (current == null) {
				return false;
			}
			return current.next != null;
		}

		@Override
		public E next() {
			if (current.next == null) {
				throw new NoSuchElementException();
			}
			current = current.next;
			return current.elem;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Iterator<E> iterator() {
		return new Iter();
	}

	public static void main(String[] args) {
		SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
		
		
		list.add(0);
		list.add(1);
		
		
		
		var it = list.iterator();
		boolean hasNext = it.hasNext();
		it.next();
		hasNext = it.hasNext();
		it.next();
		
		
		
		
			

		
		
		
	}
}