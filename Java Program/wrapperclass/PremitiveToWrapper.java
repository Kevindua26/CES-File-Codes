class PremitiveToWrapper
{
	public static void main(String args[])
	{
 		//premitive to Wrapper
		int num = 10;
		Integer numWrapper = Integer.valueOf(num); // Converting int to Integer
		System.out.println("After Conversion from premitive to wrapper the value of the Integer Object is"+numWrapper);
		
		//Wrapper to Premeitive type
		Integer wrappernum = 20;
		num = wrappernum.intValue(); // Converting Integer to int
		System.out.println("After conversion of the wrapper the int value is"+num);





	}
}
