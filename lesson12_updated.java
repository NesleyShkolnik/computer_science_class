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
    	for(i = 0; i < 3; i++)
    	{
    		sum = 0;
    		for(j = 0; j < 3; j++)
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
        Random rand = new Random();
    	int arr1[][] = new int[col_row][col_row];
    	int arr2[][] = new int[col_row][col_row];
    	int arr3[][] = new int[col_row][col_row];
    	int i = 0;
    	int j = 0;
    	for(i = 0; i < col_row; i++)
    	{
    		for(j = 0; j < col_row; j++)
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
        int i, j;
        for(i = 0; i < col_row; i++)
        {
            for(j = 0; j < col_row; j++)
            {
                arr1[i][j] = rand.nextInt(101);
            }
        }
        for(i = 0; i < col_row; i++)
        {
            for(j = 0; j < col_row; j++)
            {
                arr2[j][i] = arr1[i][j];
            }
        }
        System.out.println("Original matrix:");
        for(i = 0; i < col_row; i++)
        {
            for(j = 0; j < col_row; j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nTransposed matrix:");
        for(i = 0; i < col_row; i++)
        {
            for(j = 0; j < col_row; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    //5
    public static void f5(int[][] matrix)
    {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++)
        {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - i - 1];
        } 
        System.out.println("Primary Diagonal Sum: " + primaryDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
    }
    //6
    public static boolean f6(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++)
            {
                sum += matrix[i][j];
            }
            if (i > 0 && sum < matrix[i - 1][0])
            {
                return false;
            }
        }
        return true;
    }
    //7
    public static boolean f7(int [][] bool_mat)
    {
    	int rows = bool_mat.length;
        int cols = bool_mat[0].length;
        for (int j = 0; j < cols; j++) {
            int previousBit = bool_mat[0][j];
            for (int i = 1; i < rows; i++)
            {
                if (bool_mat[i][j] < previousBit)
                {
                    return false;
                }
                previousBit = bool_mat[i][j];
            }
        }
        return true;
    }
    //8
    public static void f8(char [][] matt)
    {
        System.out.println("before:");
        for (char[] row : matt)
        {
            for (char element : row)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        char[] temp;
        for (int i = 0; i < matt.length - 1; i++)
        {
            for (int j = i + 1; j < matt.length; j++)
            {
                if (String.valueOf(matt[i]).compareTo(String.valueOf(matt[j])) > 0)
                {
                    temp = matt[i];
                    matt[i] = matt[j];
                    matt[j] = temp;
                }
            }
        }
        System.out.println("\nafter: ");
        for (char[] row : matt)
        {
            for (char element : row)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    //9
    public static boolean f9(char[][] matrix, String city, char[][] mat)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) 
        {
            String rowString = new String(matrix[i]);
            if (rowString.contains(city))
            {
                return true;
            }
        }
        for (int j = 0; j < cols; j++)
        {
            StringBuilder colString = new StringBuilder();
            for (int i = 0; i < rows; i++)
            {
                colString.append(matrix[i][j]);
            }
            if (colString.toString().contains(city))
            {
                return true;
            }
        }
        return false;
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
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8,9}};
        f5(matrix);
        f6(matrix);
        int [][] bool_mat = {{0, 0, 1},{1, 0, 0},{0, 0, 1}};
        f7(bool_mat);
        char [][] mat = {{'n', 'e', 's', 'l', 'e', 'y'},{'s', 'h', 'i', 'r', 'a'},{'i', 't', 'a', 'y'}};
        char[][] citiesMatrix = {{'H', 'a', 'i', 'f', 'a'},{'T', 'e', 'l', ' ', 'A', 'v', 'i', 'v'},{'E', 'i', 'l', 'a', 't'},{'J', 'e', 'r', 'u', 's', 'a', 'l', 'e', 'm'}};
        String city = "Dimona";
        boolean found = f9(citiesMatrix, city, mat);
        System.out.println("Is " + city + " in the matrix? " + found);
    }
}
