package week1.day2;

public class Palandrome {

	public static void main(String[] args) {
		int num=34343;
		int temp=num;
		int rev=0,rem;
		for(int i=1; num>0;i++) {
			
			rem=temp%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
			
			if(temp==rev) {
				System.out.println(" The number is palindrome"+temp);
				
		}
			else {
				System.out.println( " The number is not palindrome"+temp);
				
			}
			
	}

}

//*Check the given number is palindrome or not 

//*Int num =34343

//*Initialize a  temporary variable.

//*Reverse the number (using for loop and add to the temporary variable)

//*Compare the temporary number with reversed number

//*If both numbers are same, print "palindrome number"

//*Else print "not palindrome number"