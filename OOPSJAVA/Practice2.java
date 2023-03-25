interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
   int x=5;
    void jump(){
        System.out.println("Monkey Jumps!!");
    }
    void bite(){
        System.out.println("Monkey Bites!!");
    }
}
class Human extends Monkey implements BasicAnimal{

    public void eat() {
        System.out.println(x);
    System.out.println("Human Eats");
    }
    public void sleep(){
        System.out.println("Human needs to sleep");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Human h=new Human();
        h.eat();

    }
}
