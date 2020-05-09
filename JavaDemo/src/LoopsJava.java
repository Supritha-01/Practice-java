
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

		// for loop

		for (int x = 0; x <= 10; x = x + 2) {

			System.out.println(x);
		}

		// for each loop

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String y : cars) {
			System.out.println(y);
		}

		// break
		for (int b = 0; b <= 10; b++) {

			if (b == 4) {
				break;
			}
			System.out.println(b);
		}

		// continue

		for (int b = 0; b <= 10; b++) {

			if (b == 4) {
				continue;
			}
			System.out.println(b);
		}

		// Pyramid
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int term=6;  
		for(int c=1;c<=term;c++){  
		for(int d=term;d>=i;d--){  
		        System.out.print("* ");  
		}  
		System.out.println();
	}
        
		//Infinitive for loop
		for (;;) {
			System.out.println("Infinitve loop");
		}
}}
