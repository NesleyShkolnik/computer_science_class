import java.util.Scanner;

public class lesson6
{
    static Scanner scan = new Scanner(System.in);

    // 1
    public static void grades()
    {
        int i;
        int sum = 0;
        int avg;

        for (i = 0; i < 5; i++) 
        {
            System.out.println("Enter your grade: ");
            int grade = scan.nextInt();
            sum += grade;
        }

        avg = sum / 5;
        System.out.println("The average is: " + avg);
    }

    // 2
    public static void typingEnter()
    {
        String str = "";
        int i = 0;

        while (!str.equals("enter"))
        {
            System.out.println("Type 'enter': ");
            str = scan.next();
            i++;
        }

        System.out.println("You had " + i + " tries before typing enter.");
    }

    // 3
    public static void creditCard(int code)
    {
        int userCode;
        int i = 0;

        do
        {
            System.out.println("Enter the code: ");
            userCode = scan.nextInt();

            if (code != userCode)
            {
                System.out.println("Error");
            }
            else
            {
                System.out.println("How much money: ");
            }

            i++;
        }
        while (i < 2);
    }
    //4
    public static void polindrom(String input)
    {
    	 int left = 0;
         int right = input.length() - 1;

         while (left < right)
         {
             if (input.charAt(left) != input.charAt(right)) 
             {
                 System.out.println("'" + input + "' is not a palindrome.");
             }
             if (input.charAt(left) == input.charAt(right))
             {
            	 System.out.println("'" + input + "' is a palindrome.");
             }
             left++;
             right--;
         }
    }
    //5
    public static void printDivisors(int number)
    {
        if (number <= 0)
        {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("Divisors of " + number + ": ");
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                System.out.print(i);
                if (i != number)
                {
                    System.out.print(", ");
                }
            }
        }
    }

    //6
    public static void printMultiplicationTable()
    {
    	 for (int i = 1; i <= 10; i++) {
             for (int j = 1; j <= 10; j++) {
                 System.out.print(i * j + "\t");
             }
             System.out.println();
         }
    }
    //7
    public static void analyzeGrades()
    { 
    System.out.print("Enter grade 1: ");
    int firstGrade = scan.nextInt();

    int minGrade = firstGrade;
    int maxGrade = firstGrade;

    for (int i = 2; i <= 7; i++) {
        System.out.print("Enter grade " + i + ": ");
        int grade = scan.nextInt();

        if (grade < minGrade) {
            minGrade = grade;
        }

        if (grade > maxGrade) {
            maxGrade = grade;
        }
    }

    System.out.println("Minimum grade: " + minGrade);
    System.out.println("Maximum grade: " + maxGrade);
}
    //8
    public static boolean isFibonacci(int number)
    {
        if (number < 0)
        {
            return false;
        }
        int first = 0;
        int second = 1;
        while (first <= number)
        {
            if (first == number)
            {
                return true;
            }
            int next = first + second;
            first = second;
            second = next;
        }
        return false;
    }
    //9
    public static void mul(int num1, int num2)
    {
        int result1 = 0;
    	for(int i = 0; i < num1; i++)
    	{
    		result1 += num2;
    	}
    	System.out.println("The product of the 2 numbers is: " + result1);
    }
    //10
    public static void pyramid(int height)
    {
        for (int i = 1; i <= height; i++) {
            int leadingSpaces = height - i;

            for (int j = 0; j < leadingSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int code = 2306;
        grades();
        typingEnter();
        creditCard(code);
        System.out.println("Enter a string to check if it's a palindrome: ");
        String input = scan.nextLine();
        polindrom(input);
        int inputNumber = 24;
        printDivisors(inputNumber);
        printMultiplicationTable();
        analyzeGrades();
        int number = 13;
        System.out.println("Is " + number + " part of the Fibonacci sequence? " + isFibonacci(number));
        int num1 = 3;
        int num2 = 5;
        mul(num1, num2);
        int height = 3;
        pyramid(height);
    }
}
