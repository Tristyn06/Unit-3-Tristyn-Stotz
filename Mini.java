import java.util.Scanner;
import java.util.Random;
public class Mini {
  public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Would you like to draw stars (Enter 1) or play rock paper scissors (Enter 2)?");
    int game = scan.nextInt();

    while (!(game == 1) && !(game == 2)) {
      System.out.println("Error; Please enter 1 or 2.");
      System.out.println("Would you like to draw (Enter 1) or play rock paper scissors (Enter 2)?");
      game = scan.nextInt();
    }

    if (game == 1) {
      System.out.println("What star pattern would you like to draw?");
      System.out.println("Options are 1-5 (Enter number corresponding to the option you want).");
      int option = scan.nextInt();

      while (!(option > 0) && !(option < 6)){
        System.out.println("Error: \nOptions are 1-5 (Enter number corresponding to the option you want).");
        option = scan.nextInt();
      }

      String asterik = "";

      if (option == 1) {
        asterik = "**********";
        for (int i = 0; i < 9; i++){
          asterik = asterik.substring(0 , asterik.length()-1);
          System.out.println(asterik);
        }
      }

      if (option == 2) {
        asterik = "          ";
        for (int i = 9; i > -1; i--){
          asterik = asterik.substring(1) + "*";
          System.out.println(asterik);
        }
      }

      if (option == 3) {
        asterik = "**********";
        String space = "          ";
        for (int i = 0; i <= asterik.length(); i++){
          asterik = space.substring(0 , i + 1) + asterik.substring(0 + i);
          System.out.println(asterik);
        }
      }
      if (option == 4) {
        asterik = "       *   ";
        for (int i = 1; i <= asterik.length(); i--){
          asterik = asterik.substring(0, i + 1) + "*";
          System.out.println(asterik);
        }
      }

    }


    if (game == 2){

      System.out.println("Choose 1 for Rock, 2 for Paper, or 3 for Scissors.");

      int Rock = 1;
      int Paper = 2;
      int Scissors = 3;

      Random rand = new Random();

      int comp = (int)(Math.random()*3) + 1;
      int per;
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

}
