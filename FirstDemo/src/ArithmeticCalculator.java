import java.util.Scanner;
public class ArithmeticCalculator {
	  public static void main(String[] args) {
	    int number1, number2;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter first number:");
	    number1 = input.nextInt();
	    System.out.println("Enter second number:");
	    number2 = input.nextInt();
	    while(true) {
		    System.out.println("Enter 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 105.Exit ");
		    int choice=input.nextInt();
		    switch (choice) {
		      case 1:
		    	Addition a=new Addition(number1,number2);
		        break;
		      case 2:
		    	Subtraction s=new Subtraction(number1,number2);
		        break;
		      case 3:
		    	Multiplication m=new Multiplication(number1,number2);
			    break;
		      case 4:
		        Division d=new Division(number1,number2);
		        break;
		      case 5:
		    	  System.exit(0);
		    	  break;
	    }
	 }
   }
}
