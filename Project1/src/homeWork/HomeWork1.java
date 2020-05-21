package homeWork;

public class HomeWork1 {

	public static void main(String[] args) {
		//print 1 to 10 except 7
		
		/*
		for(int i=1; i<=10; i=i+1) {
			if(i!=7) {
			System.out.println(i);
			}
		}
		*/
		//...................................
		int days=0;
		if(days==30) {
			System.out.println("April, June, September,November");
		}
		else if(days==31) {
			System.out.println("");
		}
		else if(days==28) {
			System.out.println("February");
		}
		else if(days==29) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Invalid days number");
		}
	}

}
