import java.util.Scanner;

public class minofthree{
  public static void main(String[]arg){
  Scanner sc = new Scanner(System.in);
    System.out.println("Provide three integers");

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    if(num1< num2 && num1 < num3);
      System.out.println("The smallest of them is" + num1);

  }
}
