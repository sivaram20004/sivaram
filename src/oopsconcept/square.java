package oopsconcept;
       

public class square {
     int a;     //state of object / instance variable 
      void area ()
      {
    	  System.out.println(a*a);     // behavior of object / instance method 
      }
      	public static void main(String[] args) {
		// TODO Auto-generated method stub
   square s1= new square();
   square s2=new square();
   s1.a=5;
   s2.a=6;
   s1.area();
   s2.area();
		   
	}

}
