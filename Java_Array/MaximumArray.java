public class MaximumArray {
    public static void main(String[] args){
        int[] arr={9,8,5,1,6,16};
        int max=arr[0];
        for(int i=1;i<(arr.length);i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
