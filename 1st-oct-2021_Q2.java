import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2 
{
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\Users\\Mobile Programming\\Downloads\\Input.txt");
        FileWriter fwite = new FileWriter("C:\\Users\\Mobile Programming\\Downloads\\Output.txt");

        String Value = " ";
        int rd;
            while((rd=fr.read())!= -1)
            {
                Value += (char)rd;
                
                if (rd%2==0)   
                    {  
                        System.out.print(rd + " ");  
                    }  
            }
            System.out.println(Value);
            fwite.write(Value);
            fr.close();
            fwite.close();
        }

}
