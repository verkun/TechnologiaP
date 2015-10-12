package zadanie1;

import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;

public class NumberTest2 extends TestCase 
{
	private Number numer;
	private String conv;

	@Before
	public void setUp() throws Exception 
	{
		numer = new Number();
		conv = Number.convert(32, 4);
	}
	
	@After
	public void tearDown() throws Exception
	{
		numer = null;
		conv = null;
	}
	
	@Test
	public void testConverter() throws Exception
	{
		assertEquals(conv, numer.convert(32, 4));
	}
	
	@Test(timeout=100)
	public void testSpeed() throws Exception
	{
		numer.reverse("1100100");
		assertEquals(numer.convert(100, 2), "1100100");
	}
	
	@Test(expected = Exception.class)
	public void testExceptions() throws Exception
	{
		numer.setNumberBase(0, 0);
	}

	@Test
	public void testNormal() throws Exception
	{
		assertEquals("123456789", Number.reverse("987654321"));	
	}
	
	@Ignore
	public void MakesNoSense() throws Exception
	{
		assertTrue(numer.convert(100, 9).equals(null));
	}
	
}
