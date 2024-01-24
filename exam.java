import java.util.Scanner;
import java.util.Random;
public class exam
{
    public static void q1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int age1 = scanner.nextInt();
        int age4 = age1 - 10;
        int age3 = age4 + 1;
        int age2 = age3 + 3;
        System.out.println("Child age1: " + age1);
        System.out.println("Child age2: " + age2);
        System.out.println("Child age3: " + age3);
        System.out.println("Child age4: " + age4);
    }
    public static void q2()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = scan.nextInt();
        int units = num % 10;
        int tens = num / 10 % 10;
        int hun = num / 100;
        System.out.println(units + "" + tens + "" + hun);
    }
    public static void q3(int age)
    {
        Random r = new Random();
        int grade1 = r.nextInt(61) + 40;
        int grade2 = r.nextInt(61) + 40;
        int grade3 = r.nextInt(61) + 40;
        if (grade1 < grade2 && grade1 < grade3)
        {
            System.out.println("The minimal is: " + grade1);
        } else if (grade2 < grade1 && grade2 < grade3)
        {
            System.out.println("The minimal is: " + grade2);
        }
        else if (grade3 < grade1 && grade3 < grade2)
        {
            System.out.println("The minimal is: " + grade3);
        }
        else
        {
            System.out.println("equals");
        }
    }
    public static void q4()
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter String 1");
    String string1 = scanner.nextLine();
    scanner.nextLine();
    System.out.println("Enter String 2");
    String string2 = scanner.nextLine();
    if (string1.length() < string2.length())
    {
        System.out.println(string1);
    }
    else
    {
        System.out.println(string2);
    }
    String substring1 = string1.substring(0, 3);
    String substring2 = string2.substring(0, 3);
    System.out.println(substring1);
    System.out.println(substring2);
    if (substring1.compareTo(substring2) > 0)
    {
        System.out.println(substring1);
    }
    else
    {
        System.out.println(substring2);
    }
}
    public static void main(String[] args)
    {
        q1();
        q2();
        q3(25);
        q4();
    }
}
