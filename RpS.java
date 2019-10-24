import java.util.Scanner;
import java.util.Random;

public class RpS{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Choose 1 for Rock, 2 for Paper, or 3 for Scissors.");
    int per;
    int Rock = 1;
    int Paper = 2;
    int Scissors = 3;

    Random rand = new Random();

    int comp = (int)(Math.random()*3) + 1;
    int pScore = 0;
    int cScore = 0;

    while ((pScore < 3) && (cScore < 3)){

      comp = (int)(Math.random()*3) + 1;
      per = scan.nextInt();

      while (per < 0 || per > 3){
        System.out.println("Error: \nOptions are 1-3(Enter number corresponding to the option you want).");
        per = scan.nextInt();
      }

      System.out.println("You chose: " + per + ". Computer chose: " + comp + ".");

      if((comp == 1 && per == 1) || (comp == 2 && per == 2) || (comp == 3 && per == 3)){
      System.out.println("It is a tie");
      }
      else if ((comp == 1 && per == 3) || (comp == 2 && per == 1) || (comp == 3 && per == 2)){
          System.out.println("Computer wins");
          cScore++;
      }
      else if ((per == 1 && comp == 3) || (per == 2 && comp == 1) || (per == 3 && comp == 2)){
          System.out.println("You win");
          pScore++;
      }
    }

    if (pScore > cScore) {
      System.out.println("You won the game!");
    }
    else {
      System.out.println("The computer won the game :(");
    }
  }
}
