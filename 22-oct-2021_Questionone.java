public class Questionone 
{
    public static void main(String[] args) 
    {
        Primenum t1 = new Primenum("ThreadNo start from 1 to 25000", 1, 25000);
        Primenum t2 = new Primenum("ThreadNo start from 25001 to 50000", 25001, 50000);
        t1.start();
        t2.start();

        long startTime = System.currentTimeMillis();

        try {
            //t1.join();  
            //t2.join();  
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println(Primenum.getPrimes());
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("TotalTime: "+elapsedTime+" Milliseconds");

    }

}
