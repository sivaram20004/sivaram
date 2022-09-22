package sivaram;

public class Patternprogram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=1;
		int j;
		for(int i=0;i<n;i++)
		{
			for( j=n-i;j>=1;j--)
		{
			System.out.print(" ");
		}
			for (j=0;j<=i;j++)
			{
				System.out.print(k+++" ");
			}
			System.out.println( );
			
		}
	}

}
