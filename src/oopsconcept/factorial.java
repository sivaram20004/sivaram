package oopsconcept;

public class factorial { 
	       int a,b;
	       int c;
	       void fact()
	       {
	    	   	for(int i=1;i<=5;i++) {
	    	   		b=b*i;
	    	   	
	    	   System.out.println(b);
	       }
	       }
	       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             factorial f1=new factorial();
             f1.a=5;
             f1.b=1;
             f1.fact();
	}
}
