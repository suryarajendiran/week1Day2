package week1.day2;

public class PrimNumber {

	public static void main(String[] args) {
		
		int j=13;
		boolean flag=false;
		for(int i=2;i<=j/2;i++)
		{
			
		if(j% i==0) {
			 flag =true;
			break;
		}
		if(!flag)
		{
			System.out.println("  The number is Prime Number"+j);
		}
		else {
			System.out.println("The number is not prime Number"+j);
		
		
		}
		
		}
		}
	}


