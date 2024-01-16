import java.util.Scanner;
import java.lang.Math;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    // 1
    public static void printingName() {
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Hello " + name + "!");
    }

    // 2
    public static void div5(int num) {
        num = num / 5;
        System.out.println("The number divided by 5 is " + num);
    }

    // 3
    public static int mul(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }

    // 4
    public static void sumAndAverage(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }

    // 5
    public static void sumAndAverage(int radius) {
        double pi = 3.14;
        double Perimeter = 2 * pi * radius;
        double area = pi * Math.pow(radius, 2);
        System.out.println("The Perimeter is: " + Perimeter);
        System.out.println("The area is: " + area);
    }

    // 6
    public static int calculateRibC(int rib_a, int rib_b) {
        int rib_c_squared = rib_a * rib_a + rib_b * rib_b;
        int rib_c = (int) Math.sqrt(rib_c_squared);
        return rib_c;
    }

    // 7
    public static void mixletters(char letter1, char letter2, char letter3) {
        System.out.println("The mixed letter is: " + letter3 + letter2 + letter1);
    }

    // 8
    public static int invoicSeries(int firstNum, int difference, int memberNum) {
        int num = firstNum + (memberNum - 1) * difference;
        return num;
    }

    // 9
    public static int strPow(String str) {
        int size = str.length();
        int num = (int) Math.pow(size, 2);
        return num;
    }

    // 10
    public static void twoStr(String str1, String str2) {
        int size1 = str1.length();
        int size2 = str2.length();
        if (size1 > size2) {
            System.out.println(str1 + " is bigger");
        }
	else {
            System.out.println(str2 + " is bigger");
        }
    }

    // 11
    public static void strCheck(String str, int num) {
        int size = str.length();
        if (size == num) {
            System.out.println(true);
        } 
	else {
            System.out.println(false);
        }
    }

    // 12
    public static void equal(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("equals");
        } 
	else {
            System.out.println("not equals");
        }
    }

    // 13
    public static void checks(String str, char char1) {
        System.out.println("Enter a 4 words string:");
        str = scan.nextLine();
        System.out.println("Enter one char:");
        char1 = scan.next().charAt(0);

        if (str.contains(String.valueOf(char1))) {
            System.out.println("true");
        }
	else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        printingName();
        int num = 24;
        div5(num);
        int num1 = 24;
        int num2 = 3;
        int mulResult = mul(num1, num2);
        System.out.println("The product of the 2 numbers is: " + mulResult);
        int num3 = 17;
        sumAndAverage(num1, num2, num3);
        int radius = 17;
        sumAndAverage(radius);
        int rib_a = 17;
        int rib_b = 6;
        int rib_c = calculateRibC(rib_a, rib_b);
        System.out.println("The rib c is " + rib_c);
        char letter1 = 'n';
        char letter2 = 'a';
        char letter3 = 'd';
        mixletters(letter1, letter2, letter3);
        int firstNum = 4;
        int difference = 2;
        int memberNum = 2;
        int invoicResult = invoicSeries(firstNum, difference, memberNum);
        System.out.println("The number is: " + invoicResult);
        String str = new String("nesley");
        int result = strPow(str);
        System.out.println("The power of the number of characters in the string is: " + result);
        String str1 = new String("nesley");
        String str2 = new String("dana");
        twoStr(str1, str2);
        String str3 = new String("nesley");
        int num4 = 8;
        strCheck(str3, num4);
        equal(5, 5);
        char char1 = ' ';
        String str4 = " ";
        checks(str4, char1);
    }
}
