
public class PrameterizedCon {
       String empId;
       int salary;
       String addr;
      public PrameterizedCon(){
    	   this("Supritha");
       }
       
       PrameterizedCon(String name){
    	   this(name,30000);
       }
       PrameterizedCon(String name,int sal){
    	   this(name,sal,"CPT");
       }
       PrameterizedCon(String name,int sal, String address){
    	   this.empId=name;
    	   this.salary=sal;
    	   this.addr=address;
       }
       
       void disp() {
    	   System.out.println(empId+" "+salary+" "+addr);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrameterizedCon obj=new PrameterizedCon();
		obj.disp();
	}

}
