//ask for positive interger
//limit
//make calculations of math and things, use forloop
//make so there are 5 muliples

import java.util.Scanner;

public class Multiples{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a positive integer");
     int positive = scan.nextInt();

    System.out.println("Enter an upper limit");
      int upper = scan.nextInt();

      int multiple = positive;
      int count = 1;
      for(int i = 1;( upper -  multiple) > positive; i++){
        multiple = positive * i;
        if(count <= 5){
          System.out.println(multiple + "");
          count++;
        }
          else{
            System.out.println("");
            count = 1;
          }
    }
  }
}
