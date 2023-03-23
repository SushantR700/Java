<<<<<<< HEAD
//Program to generate 500 random numbers from 300 to 800


public class RandomNumbers {
    public static void main(String[] args){
        int[] arr=new int[500];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*500)+300;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
=======
//Program to generate 500 random numbers from 300 to 800


public class RandomNumbers {
    public static void main(String[] args){
        int[] arr=new int[500];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*500)+300;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
>>>>>>> 3dec43cafde612f7015541db64d4cae50fbc43fd
