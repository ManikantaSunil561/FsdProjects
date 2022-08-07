package Ap1;
import java.util.Scanner;
public class Queue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of The Queue");
		int size=sc.nextInt();
		int queue[]=new int[size];
		int front=-1,rear=-1;
		System.out.println("Q Operations Are:");	
		while(true)
		{
			System.out.println("Enter The Operation:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if(rear==size-1)
				{
					System.out.println("Queue is full no more insertions are possible");
				}
				else {
					System.out.println("Enter Element to insert int to the queue");
					int key=sc.nextInt();
					rear++;
					queue[rear]=key;
					front=0;					
				}
				break;
			case 2:
				if((front==-1 && rear==-1)||(front>rear))
				{
					System.out.println("Queue Is Empty");
				}
				else
				{
					front=front+1;
				}
				break;
			case 3:
				if((front==-1 && rear==-1)||(front>rear))
				{
					System.out.println("Queue Is Empty");
				}
				else {
					for(int i=front;i<rear+1;i++)
					{
						System.out.println(queue[i]);
					}
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Enter Correct Choice");
			}
		}
		
	}
}
