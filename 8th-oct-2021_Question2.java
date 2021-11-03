import java.util.ArrayList;
import java.util.Scanner;

public class Question2 
{
    public static void main(String[] args) 
    {

        Studentclass2 s2 = new Studentclass2();
        //System.out.println(s2.toString());

        Scanner sc = new Scanner(System.in);
   
        ArrayList<Studentclass2> divisiona = new ArrayList<>();
        
        System.out.println("Enter a No: ");
        int n3 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter a Name: ");
        String n = sc.next();
        sc.nextLine();

        System.out.println("Enter a Phone number: ");
        int n1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter a Email-Id: ");
        String n2 = sc.next();
        sc.nextLine();

        for(int i=0;i<n3;i++)
        {
            System.out.println(divisiona.get(i).toString()); 
        }
    
    }
}
