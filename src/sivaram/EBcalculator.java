package sivaram;

public class EBcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int unit=150;
            double rem;
          if(unit<=100) {
        	  System.out.println("no cost");
          }
          else if (unit>100 &&  unit<=200) {
                    rem=unit-100;
                    rem=rem*1.5;
                    System.out.println(rem);
          }
          else if (unit<100 && unit>=500){
                    rem=unit-200;
                    rem=rem*2+200;
             System.out.println(rem);
          }       
             else if(unit>500) {
                   rem=unit-500;
                   rem=rem*6.6+1730;
                   System.out.println(rem); 
          }
	}
}
