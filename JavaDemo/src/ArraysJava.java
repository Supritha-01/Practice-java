
public class ArraysJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String [] animals= {"Cat","Dog","Pig"};
//animals[0] = "Buffello";  //assigning a new value at 0 index
//System.out.println(animals[0]);
//System.out.println(animals.length); //lengths of an array

// Multidimentional array

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jhones" } };
		System.out.println(names[0][1] + names[1][0]);

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[7]; // size of new array

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(copyTo);

		// loop through an array

		String[] animals = { "Cat", "Dog", "Pig" };
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}

		// for each loop
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}
	}
}

// for each loop
