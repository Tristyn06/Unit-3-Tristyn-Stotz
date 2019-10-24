import java.util.Scanner;

public class driveDrink{
  public static void main(String[]args){
  Scanner sc =new Scanner(System.in);
    System.out.println("What is your age?");
    int age = sc.nextInt();

  if(age < 17)
    System.out.println("You cannot drive");
      else if(age >= 17)
        System.out.println("You are allowed to drive");
          else if(age < 21)
            System.out.println("You cannot drink");
              else if(age >= 21)
                System.out.println("You are allowed to drink");
  }
}
