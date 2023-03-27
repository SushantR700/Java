class myThrow extends Exception{
    public String toString(){
        return "String";
    }
    public String getMessage(){
        return "Stri";
    }
}

public class ThrowsJava {
    public static int divide(int a,int b) throws Exception {
        if (b == 0) {
            throw new myThrow();
        }
        return a / b;
    }
    public static void main(String[] args) {
    try{
        divide(5,0);
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
}
