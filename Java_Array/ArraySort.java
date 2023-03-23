public class ArraySort {
    public static void main(String[] args){
        int[] arr={9,8,5,1,6,16};
        int min;
        for(int i=0;i<(arr.length-1);i++){
             min=i;
            for(int j=i+1;j<(arr.length);j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if(min!=arr[i]){
                int temp;
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<(arr.length);i++){
            System.out.println(arr[i]);
        }
    }
}
