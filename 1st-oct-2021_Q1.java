import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> Details = new ArrayList<>();

         for(int i=1;i<=2;i++){
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
    
            System.out.println("Enter Age: ");
            String age = sc.nextLine();
    
            System.out.println("Enter Phone: ");
            String phone = sc.nextLine();
    
            System.out.println("-----------");

            //Student student =  new Student(Name, Phone, Age);
    
            Student student = new Student(name, phone, age);
            Details.add(student);
        } 

        System.out.println(Details.get(0).getstudentData());
    }
}