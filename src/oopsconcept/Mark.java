package oopsconcept;

public class Mark {
	int mark;
	int m1,m2,m3,m4,m5;
	void add() {
		mark=m1+m2+m3+m4+m5;
		System.out.println(mark);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mark siva=new Mark();
		siva.m1=50;
		siva.m2=50;
		siva.m3=50;
		siva.m4=50;
		siva.m5=50;
		Mark ram=new Mark();
		ram.m1=80;
		ram.m2=80;
		ram.m3=80;
		ram.m4=80;
		ram.m5=80;
		siva. add();
		ram.add();
	}

}
