package TriangleCentre;

public class UpDownWardTriangleCentre
{

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=n;k>i;k--)
			{
				System.out.print("* ");
			}
			for(int l=n-1;l>i;l--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
