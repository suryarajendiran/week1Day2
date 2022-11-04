package week1.day2;

public class MissingNumber {

	public static void main(String[] args) {
		int num [] = {1,2,3,4,7,8,6};

		

		for(int i=0; i<num.length; i++) {
			int temp = i+1;

			if(num[i] != temp) {
				System.out.println("The Missing number is  "+temp);
				break;
			}

		}
	}

}
