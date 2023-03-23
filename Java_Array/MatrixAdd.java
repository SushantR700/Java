public class MatrixAdd {
    public static void main(String[] args){
        int[][] arr={{1,2},{3,4},{5,6}};
        int[][] arr2={{1,2},{3,4},{5,6}};
        int[][] summ=new int[3][2];
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 2; j++) {
               summ[i][j] = arr[i][j] + arr2[i][j];
                         }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(summ[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
