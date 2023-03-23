//Wap to find out whether a given integer is present in array or not
import java.util.Scanner;
public class Find {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{1,2,3,4,5};
        System.out.println("Enter a number you want to find in the array");
        int n=sc.nextInt();
        for(int i:arr){
            if(n==i){
                System.out.println("Element Found");
               return;
            }
        }
        System.out.println("Not Found");

    }
}
