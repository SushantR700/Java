import java.util.Objects;
import java.util.Scanner;
class Lib{
    Scanner sc=new Scanner(System.in);
    int n,i;
    String book,returnBook;
    String[] arr=new String[100];

    void addBook(){
        System.out.println("Enter how many books you want to add");
        n=sc.nextInt();
        System.out.println("Enter the name of the books you want to add");
        for(i=0;i<n;i++){
            arr[i]=sc.next();
        }
    }
    boolean isBookThere(){
        for(i=0;i<n;i++){
            if(Objects.equals(book, arr[i])){
                arr[i]=null;
           return true;

            }
        }
        return false;
    }
    void issueBook(){
        System.out.println("Which book you want to issue?");
        book=sc.next();
        if(!isBookThere()){
            System.out.println("Book Not Found!!");
        }else{
            System.out.println("Book Found!!");

        }

    }
    void ShowAvailableBooks(){
        System.out.println("The available books on the library are:");
        for(String boo:arr){
        if(boo==null){
            continue;
        }
        System.out.println(boo);
        }
    }
    void returnBooks(){
        System.out.println("Enter the book that you want to return");
        returnBook=sc.next();
        for(i=0;i<n;i++){
            if(arr[i]==null){
            arr[i]=returnBook;
            break;}
        }
    }
}
public class Library {
    public static void main(String[] args){

Lib obj=new Lib();
        obj.addBook();
obj.issueBook();
obj.ShowAvailableBooks();
obj.returnBooks();
obj.ShowAvailableBooks();
    }
}
