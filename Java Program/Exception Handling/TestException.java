class TestException
{
	public static void main(String args[])
	{
	//try block to execute the code to be handled
	try
	{
    		int data = 50 / 0;
		System.out.println("The value is "+data);
	} 
	catch (ArithmeticException e) 
	{
    		System.out.println("Arithmetic Exception caught: " + e);
	} 
	finally
	{
    		System.out.println("Finally block executed");
	}
	}
}
