import java.util.Scanner;
public class DemoArray2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of The Array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the value at the index "+i);
			a[i]=sc.nextInt();
		}
		DispArray d=new DispArray();
		d.arraydisp(a);
	}
}
