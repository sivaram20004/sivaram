package sivaram;

public class fibonicseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=-1;
		int s=1;
		int t;
		for(int i=0;i<=7;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}

	}

}
