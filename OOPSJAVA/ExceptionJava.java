import java.util.Scanner;
class myException extends Exception{
    public String toString(){
        return "This is toString()";
    }
    public String getMessage(){
        return "This is getMessage()";
    }
}
public class ExceptionJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number less than 100");
        int a=sc.nextInt();

            try{
                if(a>100) {
                    throw new myException();
                }
               // throw new Exception("You entered invalid number");
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }

        }
    }

