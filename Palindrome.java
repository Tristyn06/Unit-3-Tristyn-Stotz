Import java.util.Scanner;

public class Palindrome{
	public static void main(String[]args){

	String stringFlipped = "";
	Scanner sc = new Scanner(System.in);
	System.out.println("Would you like to make a Palindrome");
String stringOrig =sc.next();

for(int i = stringOrig.length() - 1; i != -1; i--){
	stringFlipped+ stringFlipped + stringOrig.charAt(i);
}

If (stringOrig.toLowerCase().compareTo(stringFlipped.toLowerCase()) == 0){
	System.out.println("You made a Palindrome");
}
 else{
	System.out.println("You did not make a plaindrome");

    }
  }
}
