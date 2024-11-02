class DiscountOffer
{
	public static void main (String args[])
	{
		int total_bill=Integer.parseInt(args[0]);
		int temp=total_bill;
		float sumofdigit=0f;
		while(temp>0)
		{
			sumofdigit+=(temp%10);
			temp/=10;
		}
		float discountp=0f;
		if (total_bill<10000)
			discountp=(float)(sumofdigit/2);
		else
			discountp=sumofdigit;
		System.out.println("The total bill is: "+total_bill+" Rs.");
		System.out.println("The offered discount is: "+discountp+"%.");
		System.out.println("Total discount is: "+(total_bill*(discountp/100))+"Rs.");
		System.out.println("The bill after discount is: "+(total_bill-(total_bill*(discountp/100)))+" Rs.");
	}}
		
