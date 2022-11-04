package week1.day2;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {5,2,17,11,6,3};
		int y[]= {8,2,3,4,7,9,11};
		
		for (int i=0; i<x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if(x[i]==y[j]) {
					System.out.println(x[i]);
				}
			}
		}


	}

}
