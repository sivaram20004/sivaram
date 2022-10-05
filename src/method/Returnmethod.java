package method;

public class Returnmethod {
	
	int add(int a,int b) {
		int c = a+b;
		return c;
		
	}
	public static void main(String args[]) {
		Returnmethod r = new Returnmethod();
		int x =r.add(4, 7);
		System.out.println(x);
	}

}
