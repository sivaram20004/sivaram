package oopsconcept;

public class Fibonacci {
	int a,b;
	  void fibon() {
   	   for(int i=1;i<=5;i++) {
   int	c=a+b;
   		   System.out.println(c);
   		   a=b;
   		   b=c;
   	   }
      }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Fibonacci f2=new Fibonacci();
          f2.a=-1;
          f2.b=1;
          f2.fibon();
	}

	}


