package idh.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMyLinkedList {
	MyLinkedList<Integer> myList;
	
	@BeforeEach
	void setup() {
		myList = new MyLinkedList<Integer>();
	}
	
	@Test
	void testSize() {
		assertEquals(0, myList.size());
	}
	
	@Test
	void testAdd() {
		assertTrue(myList.add(6));
	}
	
	@Test
	void testSizeAfterAdd() {
		myList.add(6);
		assertEquals(1, myList.size());
	}
}
