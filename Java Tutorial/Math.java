// I am presenting you about the java math along with its methods 
public class Math{
public static void main(String[] args){
int x=5,y=64;
int randomNum=(int)(Math.random()*101);
int isMax=Math.max(x,y);
int isMin=Math.min(x,y);
float sqrt=Math.sqrt(y);
System.out.println("The maximum of "+ x +" and "+ y +" is "+isMax);
System.out.println("The minimum of "+x+" and "+y+" is "+isMin);
System.out.println("The Squareroot of "+y+" is "+sqrt);
System.out.println("Random number from 1 to 100 is "+randomNum);
}} 