class Employee{
    int id;
    String name;
    void setName(String n){
        name=n;
    }
    String getName(){
        return name;
    }
}

public class JavaOop {
    public static void main(String[] args){
        Employee E1=new Employee();
        E1.id=6;
        E1.setName("Sushant");

        System.out.println(E1.id);
        System.out.println(E1.getName());
    }
}
