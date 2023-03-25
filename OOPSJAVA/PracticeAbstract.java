abstract class pen{
    abstract void write();
    abstract void reFill();
}
class FountainPen extends pen{
    void changeNib(){
        System.out.println("Nib is Changed....");
    }
    void write(){
        System.out.println("Write Something!!");
    }
    void reFill(){
        System.out.println("Refilled the ink!");
    }
}
public class PracticeAbstract {
    public static void main(String[] args) {
        pen p1=new FountainPen();
        p1.reFill();
    }
}
