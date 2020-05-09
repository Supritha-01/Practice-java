class X{
	public void methosA() {
		System.out.println("Class A");
	}
}

class Y extends X{
	public void methodB() {
		System.out.println("Class B");
	}
}
class C extends X{
	public void methodC() {
		System.out.println("Class C");
	}
}
public class HierarchiInherit extends X{
    public void methodHI() {
      System.out.println("Class HI");	
    }
    public static void main(String[] args) {
		Y obj1=new Y();
		C obj2=new C();
		HierarchiInherit obj3=new HierarchiInherit();
        obj1.methosA();
        obj2.methosA();
        obj3.methosA();
	}
    }
