
public class WrapclsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Wrapper class
		
//		Integer intobj=10;
//		Double doubleobj=5.5;
//		Character charobj='A';
//		System.out.println(intobj);
//		System.out.println(doubleobj);
//		System.out.println(charobj);
		
		// using getvalue method
		Integer intobj=10;
		Double doubleobj=5.5;
		Character charobj='A';
		System.out.println(intobj.intValue());
		System.out.println(doubleobj.doubleValue());
		System.out.println(charobj.charValue());
		
		// toString method
		
		Integer obj=20;
		String StringObj=obj.toString();
		System.out.println(StringObj.length());
		
	}

}
