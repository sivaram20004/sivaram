package sivaram;

public class nestedloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
          for(int j=1;j<=n;j++) {
        	  if(i==1 || i==4 || j==1 || j==4) {
        		  System.out.print("* ");
        	  }
        	  else {
        		  System.out.print("  ");
        	  }
        	  
        	  }
          System.out.println();  
        	  }
		   
          }
	}


