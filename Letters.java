import java.util.Scanner;

public class Letters{
  public static void main(String[]args){
    Scanner scan= new Scanner(System.in);
    System.out.println("string?");

    String string1 = scan.next();
    int length = string1.length();
    int run = 0;

    while(run < length){
      System.out.println(string1.charAt(run));
      run++;
    }
  }
}
