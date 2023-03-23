//Create a class method and call it using an object

public class Main{
public void myAge(int x){
System.out.println("I am "+x+" years old!");
}
public void myCollege(){
System.out.println("I study in Soch college of IT");
}
public static void main(String[] args){
Main obj1=new Main();
Main obj2=new Main();
obj1.myAge(22);
obj2.myCollege();
}
}