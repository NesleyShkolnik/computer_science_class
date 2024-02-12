import java.util.Scanner;
import java.util.Random;

public class lesson6
{
    static Scanner scan = new Scanner(System.in);
    Random rand = new Random();

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
    public static void digitsSum(int numQ4)
    {
    	 int count = 0;
         while (numQ4 != 0)
         {
             numQ4 /= 10;
             count++;
         }
         System.out.println("The number of digits is: " + count);
    }
    //5
    public static int sumOfDigits(int num)
    {
        int sum = 0;
        while (num != 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    //6
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
    //7
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

    //8
    public static void printMultiplicationTable()
    {
    	 for (int i = 1; i <= 10; i++) {
             for (int j = 1; j <= 10; j++) {
                 System.out.print(i * j + "\t");
             }
             System.out.println();
         }
    }
    //9
    public static void analyzeGrades()
    { 
	    System.out.print("Enter grade 1: ");
	    int firstGrade = scan.nextInt();
	    int minGrade = firstGrade;
	    int maxGrade = firstGrade;
	    for (int i = 2; i <= 7; i++)
	    {
	        System.out.print("Enter grade " + i + ": ");
	        int grade = scan.nextInt();
	
	        if (grade < minGrade)
	        {
	            minGrade = grade;
	        }
	        if (grade > maxGrade)
	        {
	            maxGrade = grade;
	        }
    }

    System.out.println("Minimum grade: " + minGrade);
    System.out.println("Maximum grade: " + maxGrade);
}
    //10
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
    //11
    public static void mul(int num1, int num2)
    {
        int result1 = 0;
    	for(int i = 0; i < num1; i++)
    	{
    		result1 += num2;
    	}
    	System.out.println("The product of the 2 numbers is: " + result1);
    }
    //12
    public static void pyramid(int height)
    {
        for (int i = 1; i <= height; i++)
        {
            int leadingSpaces = height - i;

            for (int j = 0; j < leadingSpaces; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //13
    public static void f12(int a1, int d, int n)
    {
        for (int i = 0; i < n; i++)
        {
            int term = a1 + (i * d);
            System.out.print(term + " ");
        }
    }
    //14
    public static void printFibonacciRange(int index1, int index2) {
        int a = 0, b = 1;
        int count = 2;
        if (index1 <= 0)
        {
            System.out.print(a + " ");
        }
        if (index1 <= 1)
        {
            System.out.print(b + " ");
        }
        while (count <= index2)
        {
            int next = a + b;
            a = b;
            b = next;
            count++;
            if (count > index1)
            {
                System.out.print(next + " ");
            }
        }
    }
    //15
    public static void printIsoscelesTrapezoid(int height)
    {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //16
    public static void printGeometricSeries(double firstTerm, double ratio){
    	
        double term = firstTerm;
        for (int i = 0; i < 10; i++)
        {
            System.out.print(term + " ");
            term *= ratio;
        }
    }
    //17
    public static void calculateMortgagePayment(double principal, int months)
    {
        double monthlyInterestRate = 0.005;
        double monthlyPayment = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -months));
        double totalPayment = monthlyPayment * months;
        System.out.println("Average monthly payment: $" + monthlyPayment);
        System.out.println("Total payment: $" + totalPayment);
    }
    //18
    public static void printBinary(int number)
    {
        StringBuilder binary = new StringBuilder();
        while (number > 0)
        {
            binary.insert(0, number % 2);
            number /= 2;
        }
        System.out.println("Binary representation: 0." + binary.toString());
    }
    //19
    public static void printRandomPoints()
    {
        double minDistance = Double.MAX_VALUE;
        int closestX = 0, closestY = 0;
        System.out.println("Random points:");
        for (int i = 0; i < 5; i++) {
            int x = rand.nextInt(101);
            int y = rand.nextInt(101);
            System.out.println("(" + x + ", " + y + ")");
            double distance = Math.sqrt(x * x + y * y);
            if (distance < minDistance)
            {
                minDistance = distance;
                closestX = x;
                closestY = y;
            }
        }
        System.out.println("\nClosest point to the origin: (" + closestX + ", " + closestY + ")");
    }
    //20
    public static void printTopStudents(String name1, int math1, int english1, String name2, int math2, int english2, String name3, int math3, int english3)
    {
	String topMathStudent;
	if (math1 > math2 && math1 > math3)
	{
	topMathStudent = name1;
	}
	else if (math2 > math1 && math2 > math3)
	{
	topMathStudent = name2;
	}
	else
	{
	topMathStudent = name3;
	}
	String topEnglishStudent;
	if (english1 > english2 && english1 > english3)
	{
	topEnglishStudent = name1;
	}
	else if (english2 > english1 && english2 > english3)
	{
	topEnglishStudent = name2;
	}
	else
	{
	topEnglishStudent = name3;
	}
	double avg1 = (math1 + english1) / 2.0;
	double avg2 = (math2 + english2) / 2.0;
	double avg3 = (math3 + english3) / 2.0;
	String topAvgStudent;
	if (avg1 > avg2 && avg1 > avg3)
	{
	topAvgStudent = name1;
	}
	else if (avg2 > avg1 && avg2 > avg3)
	{
	topAvgStudent = name2;
	}
	else
	{
	topAvgStudent = name3;
	}
	System.out.println("Top student in Math: " + topMathStudent);
	System.out.println("Top student in English: " + topEnglishStudent);
	System.out.println("Top student by average score: " + topAvgStudent);
    }
    public static void main(String[] args)
    {
        int code = 2306;
        grades();
        typingEnter();
        creditCard(code);
        int numQ4 = 333;
        digitsSum(numQ4);
        int number_ = 12345;
        int sum = sumOfDigits(number_);
        System.out.println("The sum of the digits is: " + sum);
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
        f12(1, 3, 5);
        printFibonacciRange(5, 9);
        printIsoscelesTrapezoid(5);
        printGeometricSeries(3, 0.3);
        calculateMortgagePayment(100000, 12);
        printBinary(10);
        printRandomPoints();
        printTopStudents("Alice", 90, 85, "Bob", 80, 95, "Charlie", 85, 90);
    }
}
