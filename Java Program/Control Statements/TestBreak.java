class TestBreak
{
	public static void main(String args[])
	{

		int i;
		for ( i = 0; i < 10; i++) 
		{
    			if (i == 5)
 			{
       				 break; // terminates the loop when i equals 5
    			}
    			System.out.println(i);
		}
	System.out.println("hello now we are from main and the value of I is "+i);
	}
}	
