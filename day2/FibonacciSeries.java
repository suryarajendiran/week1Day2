package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int count=8,firstNum=0,secNum=1,sum;
		
	
		System.out.println("Enter a Fibonacci series number:");
		for(int i=0;i<count;i++) {
		
		sum=firstNum+secNum;
			System.out.println(""+sum);
			firstNum=secNum;
			secNum=sum;
			
		}
			
 }  

}