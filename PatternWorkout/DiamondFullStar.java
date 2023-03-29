package PatternWorkout;
import java.util.*;
public class DiamondFullStar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		if(n%2==0)
		{
			n=n+1;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j>=(n-1)/2) && (i-j<=(n-1)/2) && (j-i<=(n-1)/2) && (j+i<=(n-1)+(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
