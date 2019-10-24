import java.util.Scanner;

public class Temp{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
    System.out.println("What is the temperature?");
    int temp = sc.nextInt();

    if(temp >= 83)
    System.out.println("hot");
      else if(temp >= 68 && temp <=83)
      System.out.println("Ideal");
        else if (temp >=45 && temp<= 68)
        System.out.println("Cool");
          else if( temp<= 45)
          System.out.println("Cold");

  }
}
