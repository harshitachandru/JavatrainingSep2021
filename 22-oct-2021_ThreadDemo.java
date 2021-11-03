public class ThreadDemo extends Thread
{
    public static void main(String[] args) {
        Thread1 td1 = new Thread1("Thread-1", 1, 50000);
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
        td1.run();    
    }   
}
