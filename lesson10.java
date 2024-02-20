import java.util.Scanner;
import java.util.Random;
public class lesson10
{
    static Scanner scanner = new Scanner(System.in);
	//1
	public static void checkAndUpdate(int[] arr, int index)
	{
        if (index < 0 || index >= arr.length)
        {
            System.out.println("Error");
            return;
        }

        if (arr[index] % 2 != 0)
        {
            if (arr[index] % 2 == 1)
                arr[index]++;
            else
                arr[index]--;
            System.out.println("Index " + index + " updated to even: " + arr[index]);
        }
        else
        {
            System.out.println("Index " + index + " is already even: " + arr[index]);
        }
    }
	//2
	public static void avg() {
        int arr[] = {0, 0, 0, 0, 0};
        int index = 5;
        int sum = 0;
        int average = 0;
        for (int i = 0; i < index; i++) {
            System.out.println("Enter a number:");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        average = sum / index;
        System.out.println("The average number is: " + average);
    }
	//3
	public static int findMinimumGrade(int[] grades)
	{
        int minGrade = grades[0];
        for (int i = 1; i < grades.length; i++)
        {
            if (grades[i] < minGrade)
            {
                minGrade = grades[i];
            }
        }
        return minGrade;
    }
	//4
	public static void printAdjacentOddPairs(int[] arr)
	{
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0)
            {
                System.out.println("Adjacent odd pair: (" + arr[i] + ", " + arr[i + 1] + ")");
            }
        }
    }
	//5
	 public static int isInRandomArray(int num, int length, int min, int max)
	 {
	        Random rand = new Random();
	        for (int i = 0; i < length; i++) {
	            int randomNumber = rand.nextInt((max - min) + 1) + min;
	            if (randomNumber == num) {
	                return 1;
	            }
	        }
	        return 2;
	}
	//6
	public static void generateAndPrintAdjacentEvenSumIndices(int length)
	{
	       Random rand = new Random();
	       int[] arr = new int[length];
	       for (int i = 0; i < length; i++)
	       {
	           arr[i] = rand.nextInt(101);
	       }
	       for (int i = 0; i < length - 1; i++)
	       {
	           int sum = arr[i] + arr[i + 1];
	           if (sum % 2 == 0) {
	               System.out.println("Indices " + i + " and " + (i + 1) + ": " + arr[i] + " + " + arr[i + 1] + " = " + sum);
	           }
	       }
	}
	//7
	 public static void printArrayWithMaxLast(int length)
	 {
	        Random rand = new Random();
	        int[] arr = new int[length];
	        int maxIndex = 0;
	        for (int i = 0; i < length; i++)
	        {
	            arr[i] = rand.nextInt(101);
	            if (arr[i] > arr[maxIndex])
	            {
	                maxIndex = i;
	            }
	        }
	        int temp = arr[length - 1];
	        arr[length - 1] = arr[maxIndex];
	        arr[maxIndex] = temp;
	        System.out.print("[");
	        for (int i = 0; i < length; i++)
	        {
	            System.out.print(arr[i]);
	            if (i != length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	 }
	//8
	 public static int findIndexWithEqualSum(int[] myArr)
	 {
	        int leftSum = 0;
	        int rightSum = 0;
	        for (int num : myArr)
	        {
	            rightSum += num;
	        }
	        for (int i = 0; i < myArr.length; i++)
	        {
	            rightSum -= myArr[i];
	            if (leftSum == rightSum)
	            {
	                return i;
	            }
	            leftSum += myArr[i];
	        }
	        return -1;
	    }
	 //9
	 public static int sumCharOccurrences(String[] animals, char ch)
	 {
	        int sum = 0;
	        for (String str : animals)
	        {
	            for (int i = 0; i < str.length(); i++)
	            {
	                if (str.charAt(i) == ch)
	                {
	                    sum++;
	                }
	            }
	        }
	        return sum;
	}
	public static void main(String[] args)
	{
		 int[] arr = {1, 2, 3, 4, 5};
	     int index = 3;
	     checkAndUpdate(arr, index);
	     avg();
	     int[] grades = new int[5];
	     for (int i = 0; i < 5; i++)
	     {
	        System.out.print("Enter grade " + (i + 1) + ": ");
	        grades[i] = scanner.nextInt();
	     }
	     int minGrade = findMinimumGrade(grades);
	     System.out.println("The minimum grade is: " + minGrade);
	     int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	     printAdjacentOddPairs(numbers);
	     int num = 50;
	     int isInArray = isInRandomArray(num, 10, 0, 100);
	     if(isInArray == 1)
	     {
	     System.out.println("Is " + num + " in the random array? yes" );
	     }
	     if(isInArray == 0)
	     {
		     System.out.println("Is " + num + " in the random array? no" );
	     }
	     generateAndPrintAdjacentEvenSumIndices(10);
	     printArrayWithMaxLast(10);
	     int[] myArr = {-4, -2, 3, 9, 8, -3};
	     System.out.println(findIndexWithEqualSum(myArr));
	     String[] animals = {"cat", "dog", "rabbit", "bird", "elephant"};
	     char ch = 't';
	     System.out.println("The char 't' repeated itself " + sumCharOccurrences(animals, ch) + " times");
	}

}
