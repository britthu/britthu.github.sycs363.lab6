import static org.junit.Assert.*;

import org.junit.Test;


public class IntegerArrayListTest {

	@Test
	public void testAdd() {
	
		IntegerArrayList alist = new IntegerArrayList();
		alist.add();
		
		assertEquals("should return 10", 10, alist.get(0));
	}

	@Test
	public void testAddIntInt() {

		IntegerArrayList thelist = new IntegerArrayList(10);
		thelist.add(1,20);
		
		assertEquals("should return 20",20, thelist.get(1));
	}

	@Test
	public void testGet() {

		IntegerArrayList alist = new IntegerArrayList();
		alist.add();
		
		assertEquals("should return 10", 10, alist.get(0));
	}

	@Test
	public void testIndexOf() {
	
		IntegerArrayList thelist = new IntegerArrayList(10);
		thelist.add(1,20);
		
		assertEquals("should return 1",1, thelist.indexOf(20));
	}

	@Test
	public void testIsEmpty() {
		
		IntegerArrayList alist = new IntegerArrayList();
		alist.add();
		
		assertEquals("Should return false", false, alist.isEmpty());
		
	}

	@Test
	public void testRemove() {
		
		IntegerArrayList thelist = new IntegerArrayList(10);
		thelist.add(1,20);
		
		assertEquals("should return 20", 20, thelist.remove(1));
		
	}

}
