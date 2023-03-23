/*  * * * * * * * * *
    * * * *   * * * *
    * * *       * * *
    * *           * *
    *               *
 */
public class Starpattern {
    public static void main(String[] args){
        int i,j;
        for( i=1;i<6;i++){
            for( j=1;j<10;j++){
                if(j<=6-i || j>=4+i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
