//Create an array of 5 floats and calculate their sum
public class Main {
    public static void main(String[] args){
        float sum=0.0f;
        float[] arr= new float[]{1.2f, 4.5f, 6.7f, 7.8f, 9.0f};
        for(float element:arr){
            sum=element+sum;
        }
        System.out.println(sum);
    }
}