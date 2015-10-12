package zadanie1;

import junit.framework.TestCase;

public class NumberTest extends TestCase 
{
	
	public void testIfNull() throws Exception
	{
		assertNotNull(Number.convert(87, 5));
	}

	public void testAlwaysTrue() throws Exception
	{
		assertTrue(Number.convert(2, 2).equals("10"));
	}
	
	public void testAlwaysFalse() throws Exception
	{
		assertFalse(Number.convert(32, 2).equals(Number.convert(32, 3)));
	}
	
	public void testWrongData() throws Exception
	{
		assertEquals("321", Number.reverse("123"));
	}
	
	public void testNull() throws Exception
	{
		assertNull(Number.convert(-10, 0));
	}
}


