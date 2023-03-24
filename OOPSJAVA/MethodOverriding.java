//This is an example of method overriding ,Method overriding occurs if there exists the same method in two
//class where inheritance is used.
class A{
    void method1(){
        System.out.println("This is the method in Class A");
    }
}
class B extends A{
    @Override
    void method1(){
        System.out.println("This is the method in class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        A ob=new A();
        ob.method1(); //This results the statement in class A
        B obj=new B();
        obj.method1();// This results the statement in class B
    }
}
