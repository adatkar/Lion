package armstrongnumber;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		int num=153;
		int temp;
		int c=0;
		int rem;
		temp=num;
		while(num>0)
		{
			rem=num%10;//3 5 1 reminder
			c=c+(rem*rem*rem);
			num=num/10;//153/10=15, 15/10=1 quetient
		}
		if(temp==c)
		{
		System.out.println("the given no is Armstrong number ");
		}
		else
		{
			System.out.println("the given no is not a Armstrong number ");
		}

	}

}
