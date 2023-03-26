class myThread implements Runnable{

    public void run(){
        int i=0;
        while(i<400) {
            System.out.println("Myself Thread 1");
            i++;
        }
    }

}
class myThread3 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am thread 2");
            i++;
        }
    }
}
public class ThreadInterface {
    public static void main(String[] args) {
        myThread t1=new myThread();
        myThread3 t3=new myThread3();
        Thread thread1=new Thread(t3);
        Thread thread=new Thread(t1);
        thread.start();
        thread1.start();


    }
}
