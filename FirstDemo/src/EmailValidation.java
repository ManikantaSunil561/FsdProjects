import java.util.Scanner;
public class EmailValidation{      
    public static void main(String[] args)
        {
        System.out.println("Enter total  email id's");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String e[] = new String[n];
        for(int i=0; i<n ; i++)
        {
            System.out.println("Enter email id");
            e[i] = sc.next();
        }
        System.out.println("Enter email id for searching: ") ;
        String e1  = sc.next();
        boolean f=false; 
        for(int j=0; j<n ; j++)
        {
            if(e1.equals(e[j]))
            {
            System.out.println("Required email id found at: "+(j+1));
            f= true ;
            }
        }
        if(!f)
            System.out.println("Mail is not in array list");
        }
}


