interface wheel{
    void myWheel();

}
interface handle{
    int a=5;
    void myHandle();
}
class rod implements wheel,handle{
    public void myWheel(){
        System.out.println("I have 2 wheels");
    }
    public void myHandle(){
        System.out.println("Take handles from me!");
    }
}

public class Interface {
    public static void main(String[] args){
        rod r=new rod();
        r.myHandle();
        r.myWheel();
    }
}
