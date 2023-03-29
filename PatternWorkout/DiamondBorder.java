package PatternWorkout;

public class DiamondBorder
{

	public static void main(String[] args)
	{
		int n=8;
		if(n%2==0)
		{
			n=n+1;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==(n-1)/2 || (i-j==(n-1)/2) || (j-i==(n-1)/2) || (i+j==(n-1)/2+(n-1)) )
			  //if((i+j==(n-1)/2 && j<=(n-1)/2 ) || ((i-j==(n-1)/2) && j<=(n-1)/2) 
					 // || (j-i==(n-1)/2 && j>=(n-1)/2) || (j+i==(n-1)/2+(n-1))&&j>=(n-1)/2)
				   
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
