class ParentC{
	ParentC(){
		System.out.println("ParentClass");
	}
	
	void disp() {
		System.out.println("Disp");
	}
	
}
public class ConstMethodoverloading extends ParentC{
	ConstMethodoverloading(){
		System.out.println("ConstMethodoverloading");
	}
	
	void disp() {
		System.out.println("ConstMethodoverloading");
		super.disp();
		
	}
	public static void main(String[] args) {
		ConstMethodoverloading obj=new ConstMethodoverloading();
		obj.disp();
	}
}
