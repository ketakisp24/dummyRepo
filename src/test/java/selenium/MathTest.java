package selenium;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {
	
	private Math testMath = new Math();
	
	@Test
	public void testSquare() {
		int sq = testMath.square(10);
		assertEquals(100, sq);
	}
	@Test
	public void testCube(){
		int re = testMath.cube(10);
		assertEquals(1000,re);
	}

}
