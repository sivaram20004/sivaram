package method;

public class Arithmetic {
       void add (int x, int y) {
    	   int z=x+y;
    	   System.out.println(z);
       }
       void mul (int x, int y ) {
    	   int z=x*y;
    	   System.out.println(z);
       }
       void div (int x, int y) {
    	   int z=x/y;
    	   System.out.println(z);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic a=new Arithmetic();
		a.add(6, 7);
		a.mul(9,4);
		a.div(10, 2);
		
	}

}
