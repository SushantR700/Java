import java.util.Scanner;

class Game{
    public int rand;
    public int userInput;
    int guess=0;
    public Game(){
        rand=(int)(Math.random()*101);
        System.out.println(rand);

    }
    public void takeUserInput(){
        Scanner scanner=new Scanner(System.in);
        userInput=scanner.nextInt();
    }
    public boolean isCorrectNumber(){
        guess++;
        if(userInput==rand){

            System.out.format("Correct You guessed it right in %d times",guess);
            return true;
        } else if (userInput<rand) {
            System.out.println("You Entered low");

        }else {
            System.out.println("High");
        }
        return false;

    }
}
public class NumberGuessing{
    public static void main(String[] args) {
        System.out.println("Lets play number Guessing Game");
        System.out.println("Choose the number between 0 and 100");
        Game game = new Game();
        boolean b = false;
        while (!b) {

            game.takeUserInput();
            b = game.isCorrectNumber();
        }
    }
}