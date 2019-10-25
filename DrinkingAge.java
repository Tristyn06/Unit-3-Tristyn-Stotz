import java.util.Scanner;


public class DrinkingAge{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if( age< 21)
    System.out.println("You are not of legal drinking age");
        else
        System.out.println("You are of legal drinking age");
  }
}
