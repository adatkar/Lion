package primeNumber;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=15;
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag++;
			}
		}
		
		if(flag==0)
			{
				System.out.println(num+" is the prime number");
			}
			
			else
			{
				System.out.println(num+" is not the prime number");
			}
		
				
	}

}
