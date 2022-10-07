package constructor;

public class ParameterizedConstructor {
	int n;
	ParameterizedConstructor(int n){
		this.n=n;
	}
   void m1() {
	   n++;
	   m2();
   }
   void m2()
   {
	   n++;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor p1=new ParameterizedConstructor(8);
		    p1.m1();
		    System.out.println(p1.n);
	}

}
