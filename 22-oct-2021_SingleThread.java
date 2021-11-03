public class SingleThread extends Thread

{
        public static void main(String[] args) 
        {
            Demo1 first = new Demo1("ThreadNo", 1, 25000);
            //Demo1 second = new Demo1("ThreadNo", 25001, 50000);
            first.start();
            //second.start();
    
            long startTime = System.currentTimeMillis();
    
            try {
                first.join();  
              //  second.join();  
            } catch (Exception e) {
                //TODO: handle exception
            }
            
            System.out.println(Demo1.getPrimes());
            long endTime = System.currentTimeMillis();
           // System.out.println("Total start time" +startTime);
            //System.out.println("Total end time" +endTime);
            long TotalTime = endTime - startTime;
            System.out.println("TotalTime: "+TotalTime+" Milliseconds");
    
        }
    
}
