class myThread1 extends Thread{

   public void run() {
       int i=0;
       while (i < 400) {
           System.out.println("Hello,I am thread 1");
           i++;
       }
   }

}
class myThread2 extends Thread{
     public void run(){

         int i=0;
         while (i < 400) {
             System.out.println("Myself thread 2");
             i++;
         }
    }
}


public class JavaThread1 {
    public static void main(String[] args) {
        myThread1 t1=new myThread1();
        myThread2 t2=new myThread2();
        t1.start();
        t2.start();
    }
}
