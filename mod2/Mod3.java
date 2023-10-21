/*
 Phillip Thoendel 10-21-2023
 This program will simulate rps by generating a random number, 
 reading data and determining the winner
 */
import java.util.*; //needed for scanner and rand

public class RockPaperScissors {
    public static void main(String[] args) {
          //variable for player input
        int playerTurn;

        //init random int between 0-2
        Random rand = new Random();
        int cpuTurn = rand.nextInt(3);

        //init scanner to take input
        Scanner input = new Scanner(System.in);
        
        //Intro message
        System.out.println("***Welcome to the Rock, Paper, Scissors Tournament*** \n");
        System.out.println("Enter 1 for Rock");
        System.out.println("Enter 2 for Paper");
        System.out.println("Enter 3 for Scissors \n");
        
        //gets player input
        System.out.println("What are you gonna throw?  \n");
        playerTurn = input.nextInt();

       //check winning conditions
        if ((cpuTurn + 1 == 1) && (playerTurn == 2)) {
            System.out.println("Computer chose Rock you chose Paper");
            System.out.println("You are the winner");
        }
        else if ((cpuTurn + 1 == 1) && (playerTurn == 3)) {
            System.out.println("Computer chose Rock you chose Scissors");
            System.out.println("You are the loser");
        }
        else if ((cpuTurn + 1 == 2) && (playerTurn == 1)) {
            System.out.println("Computer chose Paper you chose Rock");
            System.out.println("You are the loser");
        }
         else if ((cpuTurn + 1 == 2) && (playerTurn == 3)) {
            System.out.println("Computer chose Paper you chose Scissors");
            System.out.println("You are the winner");
        }
        else if ((cpuTurn + 1 == 3) && (playerTurn == 2)) {
            System.out.println("Computer chose Scissors you chose Paper");
            System.out.println("You are the loser");
        }
        else if ((cpuTurn + 1 == 3) && (playerTurn == 1)) {
            System.out.println("Computer chose Scissors you chose Rock");
            System.out.println("You are the winner");
        }
        else {
             System.out.println("Tie game, no winner");
        }

    }
}
