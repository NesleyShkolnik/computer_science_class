import java.util.Scanner;
public class lesson5
{
	//1
    public static void printingName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Hello " + name + "!");
    }
    public static void main(String[] args)
    {
        printingName();
    }
    //2
    public class Main 
    {
        public static void div5(int num)
        {
            num = num / 5;
            System.out.println("The number divided by 5 is " + num);
        }

        public static void main(String[] args)
        {
            int num = 24;
            div5(num);
        }
    }
    //3
    public class Main 
    {
        public static int mul(int num1, int num2)
        {
            int mul = num1 * num2;
            return mul;
        }

        public static void main(String[] args)
        {
            int num1 = 24;
            int num2 = 3;
            mul(num1, num2);
            System.out.println("The product of the 2 number is: " + mul);
        }
    }
    //4
    public class Main 
    {
        public static void sumAndAverage(int num1, int num2, int num3)
        {
            int sum = num1 + num2 + num3;
            int average = sum / 3;
            System.out.println("The sum is: " + sum);
            System.out.println("The average is: " + average);
        }

        public static void main(String[] args)
        {
            int num1 = 24;
            int num2 = 3;
            int num3  = 17;
            sumAndAverage(num1, num2, num3);
        }
    }
    //5
    import java.lang.Math;
    public class Main 
    {
        public static void sumAndAverage(int radius)
        {
            double pi = 3.14;
            double Perimeter = 2  * pi * radius;
            double area = pi * Math.pow(radius, 2);
            System.out.println("The Perimeter is: " + Perimeter);
            System.out.println("The area is: " + area);
        }

        public static void main(String[] args)
        {
            int radius  = 17;
            sumAndAverage(radius);
        }
    }
    //6
    public class Main 
    {
        public static int calculateRibC(int rib_a, int rib_b)
        {
            int rib_c_squared = rib_a * rib_a + rib_b * rib_b;
            int rib_c = (int) Math.sqrt(rib_c_squared);
            return rib_c;
        }

        public static void main(String[] args)
        {
            int rib_a = 17;
            int rib_b = 6;
            int rib_c = calculateRibC(rib_a, rib_b);
            System.out.println("The rib c is " + rib_c);
        }
    }
    //7
    public class Main 
    {
        public static void mixletters(char letter1, char letter2, char letter3)
        {
            System.out.println("The mixed letter is: " + letter3 + letter2 + letter1);
        }

        public static void main(String[] args)
        {
            char letter1 = 'n';
            char letter2 = 'a';
            char letter3 = 'd';
            mixletters(letter1, letter2, letter3);
        }
    }
    //8
    public class Main 
    {
        public static int invoicSeries(int firstNum, int difference, int memberNum)
        {
            int num = firstNum + (memberNum - 1) * difference
            return num;
        }
        public static void main(String[] args)
        {
            int firstNum = 4;
            int difference = 2;
            int memberNum = 2;
            invoicSeries(firstNum, difference, memberNum);
            System.out.println("The number is: " + num);
        }
    }
}
