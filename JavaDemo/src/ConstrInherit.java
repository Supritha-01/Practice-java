class E{
	public E() {
		System.out.println("Constructor E");
	}
}
public class ConstrInherit extends E {
        public ConstrInherit() {
        	System.out.println("Constructor ConstrInherit");
        }
        public static void main(String[] args) {
        	new ConstrInherit();
        	
        	
		}
}
