
public class LoopsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop
		int i = 0;
		while (i <= 5) {

			System.out.println(i);
			i++;
		}

		// do while

		int a = 0;
		do {
			System.out.println(a);
			a++;
	} while (a < 5);
		
		//for loop
		
		for(int x=0;x<=10;x=x+2) {
			
			System.out.println(x);
		}
		
		// for each loop
		
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	for (String y : cars) {
	  System.out.println(y);
		}
		
	// break
		for(int b=0;b<=10;b++) {
			
			if(b==4) {
				break;
			}
			System.out.println(b);
		}
	
	
	//continue
	
	for(int b=0;b<=10;b++) {
		
		if(b==4) {
			continue;
		}
		System.out.println(b);
	}
}
	
	
}
