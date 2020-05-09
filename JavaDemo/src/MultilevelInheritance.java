class A {
	public void method1() {
		System.out.println("Class A");
	}

	class B extends A{
		public void method2() {
			System.out.println("Class B");
		}
	}

}

public class MultilevelInheritance extends B{
	public void method3() {
		System.out.println("Clas child");
		
	}
	 public static void main(String[] args) {
		 MultilevelInheritance obj=new MultilevelInheritance();
		 obj.method2();
		 obj.method3();
	}

}
