//java program to display multiplicationbtable of a given no

class TestWhileMultiplicationTable
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		int counter =1;
		while (counter<=10)
		{
    			System.out.println(num*counter);
    			counter++;
		}
	}
}
