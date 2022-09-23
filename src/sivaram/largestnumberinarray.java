package sivaram;

public class largestnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {90,89,34,6,18,7,88,9,2,12,19,35};
         int max=a[0];
         int max2=0;
       
         for(int i=0;i<a.length;i++) {
        	 if(a[i]>=max ) {
        		 max=a[i];
        	
         }
         
         }
	      System.out.println(max);
	     
	      for(int i=0;i<a.length;i++) {
	   if(a[i]>=max2 && a[i]!=max) {
		    
		   max2=a[i];
	   
	      }		  
	   } System.out.println(max2);}}
	      



