public class MethodOverloading{
static void age(){
System.out.println("Age not passed");
}
static void age(int x){
System.out.println("I am "+x+" years old");
}
public static void main(String[] args){
age();
age(22);
}
}