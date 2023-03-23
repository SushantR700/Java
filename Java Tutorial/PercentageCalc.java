import java.util.Scanner;
public class PercentageCalc {
    public static void main(String[] args){
        System.out.println("Enter the marks for 5 subjects");
        Scanner sc=new Scanner(System.in);
        float[] arr=new float[5];
        for (int i=0;i<arr.length;i++){
             arr[i]=sc.nextFloat();
        }
        float summ=0.0f;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>100){
                System.out.println("Enter marks less than 100");
                return;
            }else {
                summ=summ+arr[i];
            }
        }
        float percentage=(summ/500)*100;
        System.out.println("Your percentage is "+percentage);
    }
}
