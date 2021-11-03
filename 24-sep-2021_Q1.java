import java.util.ArrayList;
import java.util.Scanner;

public class Q1 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Person> people = new ArrayList<>();

            System.out.println("Enter your Name Fullname: ");
            String Fullname = sc.nextLine();
    
            System.out.println("Enter your Phone Number: ");
            String phoneno = sc.nextLine();
    
            System.out.println("Enter your Height: ");
            String height = sc.nextLine();

            System.out.println("Enter your Gender: ");
            String gender = sc.nextLine();

            System.out.println("Enter your marital Status: ");
            String mstatus = sc.nextLine();

            System.out.println("-----------");
    
            Person person = new Person(Fullname, phoneno, height, gender, mstatus);
            people.add(person);

            System.out.println(people.get(0).getPersonData());
    }
}

