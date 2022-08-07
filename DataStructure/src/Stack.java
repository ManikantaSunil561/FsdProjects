import java.util.Scanner;
public class Stack {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of The Stack");
		int size=sc.nextInt();
		int stack[]=new int[size];
		int top=-1;
		System.out.println("Stack Operations");
		while(true)
		{
			System.out.println("Enter The choice 1:push 2:pop 3:display 4:exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if(top==size-1)
				{
					System.out.println("Stack Is Full No More Insertions");
				}
				else {
					int key=sc.nextInt();
					top++;
					stack[top]=key;
				}
				break;
			case 2:
				if(top==-1)
				{
					System.out.println("Stack Is Empty No More Elements To Delete");
				}
				else {
					top=top-1;
				}
				break;
			case 3:
				if(top==-1)
				{
					System.out.println("There Are No More Elements To DIsplay");
				}
				else {
					for(int i=top;i>=0;i--)
					{
						System.out.println(stack[i]);
					}
				}
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Enter Correct Choice");
				break;
			}
		}
	}
}
