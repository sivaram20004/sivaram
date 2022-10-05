package method;

public class LargestNoUsingArray {
	int layer(int a [])
	{
		int max=a[0];
		for (int i=0;i<=a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNoUsingArray a=new LargestNoUsingArray();
		int m[]= {9,4,12,46,38,6,5,29};
		System.out.print(m);
		
	}

}
