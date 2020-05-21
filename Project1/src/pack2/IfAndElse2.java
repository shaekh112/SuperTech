package pack2;

public class IfAndElse2 {

	public static void main(String[] args) {
		
		/*
		int x=50;
		
		if(x>=0 && x<=10) {
			System.out.println("I am human");
		}
		else if(x>=11 && x<=20) {
			System.out.println("I am not human");
		}
		else if (x>=21 && x<=30) {
			System.out.println("I am robot");
		}
		else {
			System.out.println("Invalid number");
		}
		*/
		
		//If age from 0 to 12, print "Baby", if age from 13 to 19 print "Teen", if age 20 to 120 print "Adult" 
		//Otherwise print "Invalid age"
		/*
		int age=121;
		if(age>=0 && age<=12) {
			System.out.println("Baby");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}
		else if (age>=20 && age<=120) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Invalid age");
		}
		*/
		
		String day="Sunday";
		
		if(day.equals("Monday")) {
			System.out.println("I will go office");
		}
		else if(day=="Tuesday") {
			System.out.println("I will meet to my friend");
		}
		else if(day.equals("Friday")) {
			System.out.println("I will go to pray");
		}
		else if(day.contains("Sun")) {
			System.out.println("I will stay home");
		}
		else {
			System.out.println("I don't have any work");
		}
	}

}
