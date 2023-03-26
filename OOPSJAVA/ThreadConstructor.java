//Thread constructor that takes string as argument
class thread extends Thread{
    public thread( String name){
        super(name);
    }

   public void run(){
        System.out.println("I am a thread");
    }

}
public class ThreadConstructor {
    public static void main(String[] args) {
        Thread ne=new thread("Sushant");
        ne.start();
        System.out.println("My id is " +ne.getId());

    }
}
