//Parameterized method
public class ParameterMethod{
static String myMethod(String fname,int age){
String message="My name is "+fname+" and i am "+age+" years old.";
return message;
}
public static void main(String[] args){
System.out.println(myMethod("Sushant",22));
}
}
