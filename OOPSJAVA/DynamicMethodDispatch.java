class base{
    void State(){
        System.out.println("I am a Statement in Base Class");
    }

}
class derived extends base{
    void State(){
        System.out.println("I am a Statement in Derived Class");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args){
        base b=new derived();   //Dynamic method dispatch
        b.State();

    }
}
