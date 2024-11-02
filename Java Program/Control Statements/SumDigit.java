public class SumDigit{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int r=0,sum=0;
 		System.out.println("number entered"+num);
		while(num>0){
			r=num%10;
			if(r%2!=0){
				sum=sum+r;
			}
    			num=num/10;
		}
		System.out.println("sum of odd digits"+sum);
	}
}