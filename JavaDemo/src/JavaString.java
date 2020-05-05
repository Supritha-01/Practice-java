
public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name="Supritha";
        String a="My name is 'Supritha'.";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println("The index of supritha: " + a.indexOf("Supritha"));
		
//		Concatenation
        
        String name1="Gowda";
        System.out.println(name + name1);
        
        int z= 10;
        
        System.out.println(name+z);
        
//        String with special characters
        
        String b="MY Name is \"Supritha\".";
        System.out.println(b);
        
        String c="It\'s a Cat";
        System.out.println(c);
        
        String d= "AND\\OR";
        System.out.println(d);
        
        System.out.println("Supritha\nAshwin");
        
        System.out.println("Supritha\tAshwin");
        
        System.out.println("Supritha\rAshwin");


	}
	
 
}
