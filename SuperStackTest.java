import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SuperStackTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSuperStack() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		// create an empty stack and check if it is empty
		// add a few elements and check if it is empty
		SuperStack<Integer> stack = new SuperStack<>(1);
		boolean result = stack.isEmpty();
		assertTrue(result);
		
		stack.push(0);
		result = stack.isEmpty();
		assertFalse(result);
		
		}

	@Test
	public void testIsFull() {
		fail("Not yet implemented");
	}

	@Test
	public void testPush() {
		fail("Not yet implemented");
	}

	@Test
	public void testPop() {
		fail("Not yet implemented");
	}

}
