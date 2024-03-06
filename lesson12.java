import java.util.Random;
import java.util.Scanner;
public class lesson12
{
	//1
    public static void f1(int rows, int cols)
    {
        Random rand = new Random();
        int[][] arr1 = new int[rows][cols];
        int i = 0;
        int j = 0;
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < cols; j++)
            {
                arr1[i][j] = rand.nextInt(101);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
    //2
    public static void f2()
    {
        Scanner scan = new Scanner(System.in);
    	int arr2[][] = new int[3][3];
    	int i = 0;
    	int j = 0;
    	int sum = 0;
    	for(i = 0; i <= 3; i++)
    	{
    		sum = 0;
    		for(j = 0; j <= 3; j++)
    		{
    			System.out.println("Enter a number for the "+ i + "," + j + "cel in the array");
    			arr2[i][j] = scan.nextInt();   
    			sum += arr2[i][j];
    		}
			System.out.println("The sum of the " + i + "is: " + sum);

    	}
    }
    //3
    public static void f3(int col_row)
    {
    	int arr1[][] = new int[col_row][col_row];
    	int arr2[][] = new int[col_row][col_row];
    	int arr3[][] = new int[col_row][col_row];
    	int i = 0;
    	int j = 0;
    	for(i = 0; i <= col_row; i++)
    	{
    		for(j = 0; j <= col_row; j++)
    		{
                arr1[i][j] = rand.nextInt(101);
                arr2[i][j] = rand.nextInt(101);
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(arr3[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
    //4
    public static void f4(int col_row)
    {
        Random rand = new Random();
    	int arr1[][] = new int[col_row][col_row];
    	int arr2[][] = new int[col_row][col_row];
    	int i = 0;
    	int j = 0;
    	for(i = 0; i>= col_row; i++)
    	{
    		for(j = 0; j <= col_row; j++)
    		{
                arr1[i][j] = rand.nextInt(101);
                arr2[i][j] = arr2[j][i];
                System.out.println(arr1 + " ");
    		}
    		System.out.println();
    	}
    	for(i = 0; i <= col_row; i++)
    	{
    		for(j = 0; j <= col_row; j++)
    		{
    			System.out.println(arr2 + " ");
    		}
    		System.out.println();
    	}
    }
    public static void main(String[] args)
    {
        int rows = 8;
        int cols = 3;
        f1(rows, cols);
        f2();
        int col_row = 5;
        f3(col_row);
        f4(col_row);
    }
}
