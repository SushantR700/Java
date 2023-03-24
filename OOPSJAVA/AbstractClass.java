abstract class Vehicle{
    abstract void speed();
    abstract void wheel();
}
class car extends Vehicle{
    void speed(){
        System.out.println("The speed of car is more than 100kmphr");
    }
    void wheel(){
        System.out.println("Car has 4 wheels");
    }

}
class truck extends Vehicle{
    void speed(){
        System.out.println("The speed of truck is 50kmphr");
    }
    void wheel(){
        System.out.println("The truck has 8 wheels");
    }
}
public class AbstractClass {
    public static void main(String[] args){
        car c1=new car();
        c1.speed();
        c1.wheel();
        truck t1=new truck();
        t1.speed();
        t1.wheel();
    }
}
