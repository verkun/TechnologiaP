package zadanie1;

public class Number 
{
	private static String[] pattern = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
	private static int nr, bs;
	
	public static void setNumberBase(int number, int base) throws Exception
	{
		nr = number;
		bs = base;
	}
	
	public static int getNumber()
	{
		return nr;
	}
	
	public static String reverse(String string) throws Exception
	{
		String reversed = "";
		for( int i = string.length()-1; i>=0; i-- )
		{
			reversed += string.charAt(i);
		}
		return reversed;
	}
	
	public static boolean requirements(int number, int base) throws Exception
	{
		if( number > 0 && base >=2 && base <= 16 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	public static String convert(int number, int base) throws Exception
	{
		if( requirements(number, base) )
		{
			String result = "";
			while( number > 0)
			{
				result += pattern [number % base];
				number = number / base;
			}
			result = reverse(result);
			return result;
		}
		else
		{
			return null;
		}
	}
}
