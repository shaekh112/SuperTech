package loopPack;

public class ForLoop2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		for(int i=1; i<=10; i=i+1) {
			if( i%2 != 0) {
			System.out.println(i+". USA");
			}
			else {
			System.out.println(i+". New York");
			}
		}
		*/
		
		
		for(int i=1; i<=10; i=i+1) {
			System.out.println(i+". Bangladesh");
			
			for(int j=1; j<=5; j=j+1) {
				System.out.println("  "+j+". Dhaka");
			}
			
		}
	}
}
		
	/*	
		for(int i=1; i<=50000;i=i+1) {
			System.out.println(i+". COCACOLA");
			Thread.sleep(1000);
		}
		
	}

} 
*/