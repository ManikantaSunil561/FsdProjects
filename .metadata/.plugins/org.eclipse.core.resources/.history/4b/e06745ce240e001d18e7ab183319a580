import java.util.Scanner;
public class ArrayAddition
{
	public static void main(String[] args)
	{
		int i,j,r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Size:");
		r=sc.nextInt();
		System.out.println("Enter Column Size:");
		c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int re[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++){    
			for(j=0;j<3;j++){    
				re[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
				System.out.print(re[i][j]+" ");    
			}    
			System.out.println();
		}
	}
}
