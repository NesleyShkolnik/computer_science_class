import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1
          int num1, num2; 
          System.out.println("Enter 2 numbers: ");
          num1=scan.nextInt();
          num2=scan.nextInt();
          if (num1 > 0 && num2 > 0 && num1%2 == 0 && num2%2 == 0)
          {
              System.out.println("True");
          }
          else if (num1 < 0 && num2 < 0 && num1%2 != 0 && num2%2 != 0)
          {
              System.out.println("False");
          }
          else
          {
              System.out.println("Error");
          }
       //2
          System.out.println("Enter 3 digit number: ");
          int number = scan.nextInt();
          if (number >= 100 && number <= 999)
          {
              int digit1 = number / 100;         
              int digit2 = (number / 10) % 10;    
              int digit3 = number % 10;          
              int sum = digit1 + digit2 + digit3;
              System.out.println("The sum of the 3 digits is : " + sum);
          }
          else
          {
              System.out.println("Error");
          }
        //תרגילי כיתה
		//1
		System.out.println("Enter a 5 digit number: ");
		int num = scan.nextInt();
		int units = num % 10;
	    int tens = num / 10 % 10;
	    int hundreds = num / 100 % 10;
	    int thousands = num / 1000 % 10;
	    int tens_thousands = num / 10000;
	    if (units == tens_thousands)
	    {
	    	if (tens == thousands)
	    	{
	    		System.out.println("The nuber is palindrome");
	    	}
	    }
	    else
	    {
	    	System.out.println("The nuber is not palindrome");
	    }
	    //2
	    System.out.println("Enter a 4 digit number: ");
		int num2 = scan.nextInt();
		int units2 = num2 % 10;
	    int tens2 = num2 / 10 % 10;
	    int hundreds2 = num2 / 100 ;
	    int thousands2 = num2 / 1000 ;
	    int sum = units2 + tens2 + hundreds2 + thousands2;
	    System.out.println("The sum of the 4 digits is: " + sum);
	    //3
	    System.out.println("Enter a 6 digit number");
		int num = scan.nextInt();
		int units = num % 10;
	    int tens = num / 10 % 10;
	    int hundreds = num / 100 % 10;
	    int thousands = num / 1000 % 10;
	    int hundreds_thousands =  num / 100000;
	    int evensSum = units + hundreds + hundreds_thousands;
	    int unevensSum = tens + thousands;
	    if (evensSum > unevensSum)
	    {
	    	System.out.println("The even digit sum are bigger: " + evensSum + ">" + unevensSum);
	    }
	    if (unevensSum > evensSum)
	    {
	    	System.out.println("The uneven digit sum are bigger: " + unevensSum + ">" + evensSum);
	    }
	    else
	    {
	    	System.out.println("The digit sums are equals: " + evensSum + "=" +unevensSum);
	    }
    }    
}
