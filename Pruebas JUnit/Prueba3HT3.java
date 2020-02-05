import static org.junit.Assert.*;

import org.junit.Test;

public class Prueba3HT2 {

	@Test
	public void test() {
		iStack<Integer> stack = new Stack<Integer>(); 
		stack.push(5);
		stack.push(6);
		stack.push(13);
		
		int res = stack.peek();
		
		assertEquals(13, res);		
	}

}
