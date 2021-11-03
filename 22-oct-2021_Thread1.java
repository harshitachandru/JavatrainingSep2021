import java.util.ArrayList;

public class Thread1 extends Thread
{
    private String threadName;
    private int st, ed;
    private static ArrayList<Integer> primes = new ArrayList<>();

    private String name;
    public Thread1(String threadName, int start, int end) {
        this.st = start;
        this.ed = end;
        this.threadName = threadName;
    }

    public Thread1(String Newname) {
        this.name = Newname;
    }

    @Override
    public void run() {
        
        for(int i = this.st; i <= this.ed; i++) 
        {
            int count =0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                this.primes.add(i);
            }
        }
    }  
}
