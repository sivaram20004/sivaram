package method;

public class FindLargestNumber {
	int max (int a,int b,int c) {
		if (a>b && a>c) {
			return a;
		}
		else if (b>c) {
			return b;
		}
		else {
			return c;
		}
	
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FindLargestNumber a=new  FindLargestNumber();
		 int n=a.max(7, 9, 20);
		 System.out.print(n);	 
	}

}
