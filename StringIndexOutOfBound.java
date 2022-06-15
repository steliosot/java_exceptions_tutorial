class StringIndexOutOfBound
{
	public static void main(String args[])
	{
		try {
			String a = "Hello World"; // length is 11
			char c = a.charAt(11); // accessing 11th element
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}
}