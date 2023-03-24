class Animal{
   private String does;
   public void SetS(String s){
       this.does=s;
   }
   public String GetS(){
       return does;
   }

}
class Dog extends Animal{
    String d="Dog barks";

}
public class Inheritance {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.SetS("Dog is an animal");
        System.out.println(dog.GetS());
        System.out.println(dog.d);
    }
}
