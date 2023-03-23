//Getters and setters
class Employeee{
    private int id;
    private String name;
    public void setName(String nm){
        name=nm;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return this.id;
    }
}

public class PrivateAcessModifier {
    public static void main(String[] args){
Employeee E1=new Employeee();
E1.setName("Sushant");
E1.setId(6);
System.out.println("My name is "+E1.getName());
System.out.println("Id is: "+E1.getId());
    }
}
