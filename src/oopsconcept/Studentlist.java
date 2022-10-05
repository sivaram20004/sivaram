package oopsconcept;

public class Studentlist {
          int rollNo;
          String name; 
          int mark;
          void display() {
        	  System.out.println(rollNo);
        	  System.out.println(name);
        	  System.out.println(mark);
          }
	public static void main(String[] args) {
		Studentlist s1=new Studentlist();
		s1.rollNo=101;
		s1.name="siva";
		s1.mark=90;
		Studentlist s2=new Studentlist();
		s2.rollNo=102;
		s2.name="ram";
		s2.mark=80;
		s1.display();
		s2.display();
		

	}

}
