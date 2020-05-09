
public class CondStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if statement

		if (10 > 5) {

			System.out.println("10 is greater than 5");
		}

		// if else

		int a = 30, b = 50;
		if (a > b) {

			System.out.println("a less tahn b");
		} else {

			System.out.println("Oops!");
		}

		// if-else-if ladder

		int marks = 65;

		if (marks < 50) {
			System.out.println("Fail");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D Grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C Grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B Grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A Grade");
		} else {
			System.out.println("Invalid");
		}

		int age = 25;
		if (age < 20) {
			System.out.println("Age less than 20 ");
		} else if (age == 25) {
			System.out.println("The age is 25");
		} else {

			System.out.println("Invalid age!");
		}

		// nested if
		int age1 = 30;
		int wieght = 50;
		if (age1 >= 30) {
			if (wieght >= 50) {
				System.out.println("Eligible to donate blood");
			}else {
				System.out.println("Not eligible to donate blood");
			}
		}else {
			System.out.println("Age must be greater than or equal to 30");
		}

		// switch

		int day = 4;
		switch (day) {

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		}

		int day1 = 4;
		switch (day1) {
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Looking forward to the Weekend");
	}
}}
