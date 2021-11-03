import java.util.ArrayList;


public class Primenum extends Questionone
{
    
    private String threadname;
    private int startnum, endnum;
    private static ArrayList<Integer> primes = new ArrayList<>();

    public Primenum(String NewNum, int start, int end) {
        
        this.startnum = start;
        this.endnum = end;
        this.threadname = NewNum;
    }

    public static ArrayList<Integer> getPrimes(){
        return Primenum.primes;
    }

    public void run(){

        for(int i = this.startnum; i <= this.endnum; i++) {
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                this.primes.get(i);
            }
         }

    }

    public void start() {
    }

    public void join() {
    }
}
