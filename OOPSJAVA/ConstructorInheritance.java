class Base{
    Base(){
        System.out.println("I am a base class constructor");
    }
    Base(int x){
        System.out.println("I am a base class constructor with parameter");
    }
}
class Derived extends Base{
    Derived(){
        super();    //Implicit call so that the base class constructor executes first
        System.out.println("I am a derived class Constructor");
    }
    Derived(int x,int y){
        super(x);   //Explicitly call the base class parameterized constructor
        System.out.format("I am a derived class Constructor with parameter %d and %d",x,y);
    }
}
public class ConstructorInheritance {
    public static void main(String[] args){
    Derived d1= new Derived(2,3);
    }
}
