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
    }    
}
