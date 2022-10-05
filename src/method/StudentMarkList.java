package method;

public class StudentMarkList { 
	int rollno;
	String name;
	int mark;
	char grade;
  void setgrade() {
	 if (mark>=91 && mark<=100) {
            grade='A';
	 }
	 
	 else if (mark>=81 && mark<=90) {
		 
		 grade='B';
	 }
	 
	 else if(mark>=80 && mark<=71) {
		 grade='c';
	 }
	 
	 else if(mark>=70 && mark<=61) {
		 grade='d';
	 }
	 
	 else if (mark>=60 && mark<=51) {
		 grade='e';
	 }
	 
	else if(mark<50 ) {
		 grade='f';
	}
		 
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarkList  s1 =new StudentMarkList ();
		s1.rollno=194037;
		s1.name="siva";
		s1.mark=95;
		s1.setgrade();
		System.out.println(s1.grade);
	}
	}


