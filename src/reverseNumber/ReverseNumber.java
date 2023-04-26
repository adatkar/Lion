package reverseNumber;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=146;
		int rev;
		int b=0;
		while(num>0)
		{
			rev=num%10;  //6 4 1
			b=b*10+(rev);
			num=num/10;  //14 1
					
		}
		System.out.println("the no is reverse "+b);
		

	}

}
