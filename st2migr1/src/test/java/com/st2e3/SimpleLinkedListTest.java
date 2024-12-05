package com.st2e3;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public class SimpleLinkedListTest {
    @Test
    public void testAdd() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    public void testSize() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        assertEquals(0, list.size());
        list.add(1);
        assertEquals(1, list.size());
        list.add(2);
        assertEquals(2, list.size());
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    public void testIterator() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        var it = list.iterator();
        assertTrue(it.hasNext());
        assertEquals(1, it.next());
        assertTrue(it.hasNext());
        assertEquals(2, it.next());
        assertTrue(it.hasNext());
        assertEquals(3, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorEmpty() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        var it = list.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testIteratorOneElement() {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.add(0);
        var it = list.iterator();
        assertFalse(it.hasNext());
        assertThrows(NoSuchElementException.class, () -> it.next());
    }    
}
