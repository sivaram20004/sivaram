package method;

public class Factorial {
      // using return keyword 
	int fact (int n) {
		int f=1 ;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Factorial f=new Factorial();
         int c=f.fact(4);
         System.out.println(c);
         Factorial f1=new Factorial();
         int d=f1.fact(5);
         System.out.println(d); 
         System.out.println(c+d);
	

	}
  
}
