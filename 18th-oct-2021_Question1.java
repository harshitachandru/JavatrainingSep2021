import java.util.ArrayList;
    import java.util.Scanner;

public class Question1 
{
        public static void main(String[] args) 
        {
            ArrayList<Integer> odd = new ArrayList<Integer>();
    
            int[]num=new int[20];
            Scanner read = new Scanner (System.in);
    
            System.out.print("Enter number :" );

            for(int i=0 ;i<num.length;i++)
            {  
                num[i]=read.nextInt();
                if(num[i]%2==0)
                {  
                System.out.println(num[i]);  
                }  
            }
            System.out.println("Odd number is " + odd);
        }
}
