<<<<<<< HEAD

import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options = {"rock", "paper", "scissors"};
        while (true) {
            System.out.println("Let's begin Rock,Paper and Scissors");
            System.out.println("Enter any one:");
            String chose = sc.next();
            chose.toLowerCase();
            int ComputerChoiceIndex = (int) Math.random() * options.length;
            String ComputerChoice = options[ComputerChoiceIndex];
            System.out.println("You choose " + chose);
            System.out.println("Computer chose " + ComputerChoice);
            if (chose.equals(ComputerChoice)) {
                System.out.println("Its a tie");
            } else if (chose.equals("rock") && ComputerChoice.equals("paper") || chose.equals("paper") && ComputerChoice.equals("scissors")
                    || chose.equals("scissors") && ComputerChoice.equals("rock")) {
                System.out.println("You Lose");
            } else {
                System.out.println("You Won");
            }
            System.out.println("Do you want to play again?:(y/n)");
            String a = sc.next();
            a.toLowerCase();
            if (!a.equals("y")) {
                break;
            }
        }
    }
}
=======

import java.util.Scanner;


public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options = {"rock", "paper", "scissors"};
        while (true) {
            System.out.println("Let's begin Rock,Paper and Scissors");
            System.out.println("Enter any one:");
            String chose = sc.next();
            chose.toLowerCase();
            int ComputerChoiceIndex = (int) Math.random() * options.length;
            String ComputerChoice = options[ComputerChoiceIndex];
            System.out.println("You choose " + chose);
            System.out.println("Computer chose " + ComputerChoice);
            if (chose.equals(ComputerChoice)) {
                System.out.println("Its a tie");
            } else if (chose.equals("rock") && ComputerChoice.equals("paper") || chose.equals("paper") && ComputerChoice.equals("scissors")
                    || chose.equals("scissors") && ComputerChoice.equals("rock")) {
                System.out.println("You Lose");
            } else {
                System.out.println("You Won");
            }
            System.out.println("Do you want to play again?:(y/n)");
            String a = sc.next();
            a.toLowerCase();
            if (!a.equals("y")) {
                break;
            }
        }
    }
}
>>>>>>> 3dec43cafde612f7015541db64d4cae50fbc43fd
