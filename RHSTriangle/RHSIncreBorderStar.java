package RHSTriangle;

public class RHSIncreBorderStar
{

	public static void main(String[] args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print("* ");
			}
		}
		System.out.println("  ");
	}

}
