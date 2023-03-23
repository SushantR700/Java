/* Typecasting 
We are discussing about typecasting,which is of two types:
They are:- Widening typecasting(automatic) and narrowing typecasting(Manual) 

//Widening typecasting
public class Typecasting{
public static void main(String[] args){
int myInt=9;
double myDouble=myInt;
System.out.println(myInt);
System.out.println(myDouble);
}}

*/


//Narrowing Typecasting
public class Typecasting{
public static void main(String[] args){
double myDouble=15.55555555d;
int myInt=(int) myDouble;
System.out.println(myDouble);
System.out.println(myInt);
}
}
