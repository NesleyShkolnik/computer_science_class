import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
  //1
	    System.out.println("Enter the firts kid name: ");
        String kid1 = scan.next();
        System.out.println("Enter the second kid name: ");
        String kid2 = scan.next();
        System.out.println("Enter the thired kid name: ");
        String kid3 = scan.next();
        if (kid1.compareTo(kid2) < 0 && kid2.compareTo(kid3) < 0)
        {
            System.out.println(kid1 + " " + kid2 + " " + kid3);
        }
        else if (kid2.compareTo(kid1) < 0 && kid1.compareTo(kid3) < 0)
        {
            System.out.println(kid2 + " " + kid1 + " " + kid3);
        } 
        else if (kid3.compareTo(kid1) < 0 && kid1.compareTo(kid2) < 0)
        {
            System.out.println(kid3 + " " + kid1 + " " + kid2);
        }
        else if (kid2.compareTo(kid3) < 0 && kid3.compareTo(kid2) < 0)
        {
            System.out.println(kid2 + " " + kid3 + " " + kid1);
        }
        else if (kid3.compareTo(kid2) < 0 && kid2.compareTo(kid1) < 0)
        {
            System.out.println(kid3+ " " + kid2 + " " + kid1);
        }
        else if (kid1.compareTo(kid3) < 0 && kid3.compareTo(kid2) < 0)
        {
            System.out.println("The correct lexical order is:" + kid1 + " " + kid3 + " " + kid2);
        }
	//2
        System.out.println("Enter a 4 words");
        String str = scan.nextLine();
        int size = str.length();
        System.out.println("The length of the string is:"+size); 
  //3
        System.out.println("Enter a 3 charecters string:");
	    String word = scan.nextLine();
        if (word.charAt(0) == word.charAt(2))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not a palindrom");
        }
        
  //4
        System.out.println("Enter a 3 charecters string");
	      Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("The opposite string is:" + word.charAt(2) + "" + word.charAt(1) + word.charAt(0));
  //5
        System.out.print("Enter a 4 character string: ");
        String str = scanner.nextLine();
        String correctedStr = "";
        char firstChar = str.charAt(0);
        if (firstChar == 'u' || firstChar == 'o' || firstChar == 'i' || firstChar == 'e' || firstChar == 'a')
        {
            correctedStr += '*';
        }
        else
        {
            correctedStr += firstChar;
        }
        char secondChar = str.charAt(1);
        if (secondChar == 'u' || secondChar == 'o' || secondChar == 'i' || secondChar == 'e' || secondChar == 'a')
        {
            correctedStr += '*';
        }
        else
        {
            correctedStr += secondChar;
        }
        char thirdChar = str.charAt(2);
        if (thirdChar == 'u' || thirdChar == 'o' || thirdChar == 'i' || thirdChar == 'e' || thirdChar == 'a')
        {
            correctedStr += '*';
        }
        else
        {
            correctedStr += thirdChar;
        }
        char fourthChar = str.charAt(3);
        if (fourthChar == 'u' || fourthChar == 'o' || fourthChar == 'i' || fourthChar == 'e' || fourthChar == 'a')
        {
            correctedStr += '*';
        }
        else
        {
            correctedStr += fourthChar;
        }
        System.out.println("Corrected string: " + correctedStr);
  //6
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Random number: " + randomNumber);
        if (randomNumber < 10)
        {
            System.out.println("The number is a single-digit number.");
        }
        else
        {
            System.out.println("The number is a two-digit number.");
        }
        if (randomNumber % 2 == 0)
        {
            System.out.println("The number is divisible by 2.");
        }
        else
        {
            System.out.println("The number is not divisible by 2.");
        }
        if (randomNumber % 3 == 0)
        {
            System.out.println("The number is divisible by 3.");
        }
        else
        {
            System.out.println("The number is not divisible by 3.");
        }
  //7
        System.out.println ("Enter the first number X ");
        int X1 = scan.nextInt ();
          System.out.println ("Enter the first nuuber Y: ");
        int Y1 = scan.nextInt ();
          System.out.println ("Enter the second number X: ");
        int X2 = scan.nextInt ();
          System.out.println ("Enter the second number Y: ");
        int Y2 = scan.nextInt ();
        double d = 0.0;
        d = ((X1 - X2) * (X1 - X2)) + ((Y1 - Y2) * (Y1 - Y2));
        Math.sqrt (d);
        System.out.println (d);
    }
}
