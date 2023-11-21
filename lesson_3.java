	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		//1
		
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		if (num>0)
		{
				System.out.println("The number is positive");
		}
		else 
		{
			System.out.println("The number is negative");
		}

		//2
		
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the first number: ");
		int num2 = scan.nextInt();
		if (num1 < num2)
		{
			System.out.println(num1 + " is smaller");
		 } 
		else
		{
		      System.out.println(num2 + " is smaller");
		 }
	
		//3
		
		 System.out.println("Enter the first letter of your name: ");
		 String letter1 = scan.next();
		 System.out.println("Enter the second letter of your name: ");
		 String letter2 = scan.next();
		 System.out.println("Enter the first distance: ");
		 int d1 = scan.nextInt();
		 System.out.println("Enter the second distance: ");
		 int d2 = scan.nextInt();
		 System.out.println("Enter the first velocity: ");
		 int v1 = scan.nextInt();
		 System.out.println("Enter the second velocity: ");
		 int v2 = scan.nextInt();
		 if ((d1 * v1) > (d2 * v2))
		 {
			 System.out.println(letter1 + " will arrive first");
		 }
		 else
		 {
		      System.out.println(letter2 + " will arrive first");
		  }
	
		//4

	  System.out.println("Enter the first grade: ");
	  int g1 = scan.nextInt();
	  System.out.println("Enter the second grade: ");
	  int g2 = scan.nextInt();
	  System.out.println("Enter the third grade: ");
	  int g3 = scan.nextInt();
	  double average = (g1 + g2 + g3) / 3.0;
	  System.out.println("The average number is " + average);
	  
		//5
		
	  System.out.println("Enter the first number: ");
	  int num_1 = scan.nextInt();
	  System.out.println("Enter the second nuber: ");
	  int num_2 = scan.nextInt();
	  System.out.println("Enter the third number: ");
	  int num_3 = scan.nextInt();
	  if (num_1<num_2 && num1<num_3)
	  {
		  System.out.println(num1 + " is the smallest");
	  }
	  if (num_2<num_1 && num_2<num_3)
	  {
		  System.out.println(num2 + " is the smallest");
	  }
	  if (num_3<num_1 && num_3<num_2)
	  {
		  System.out.println(num_3 + " is the smallest");
	  }
	  
		//6
		
	  System.out.println("Enter the first number X ");
	  int X1 = scan.nextInt();
	  System.out.println("Enter the first nuuber Y: ");
	  int Y1 = scan.nextInt();
	  System.out.println("Enter the second number X: ");
	  int X2 = scan.nextInt();
	  System.out.println("Enter the second number Y: ");
	  int Y2 = scan.nextInt();
	  double d;
	  d = ((X1-X2)*(X1-X2))+((Y1-Y2)*(Y1-Y2));
	  Math.sqrt(d);
	  System.out.println(d);
	  
		//7
	  System.out.println("Enter first number: ");
      int firstNum= scan.nextInt();
      System.out.println("Enter difference: ");
      int difference= scan.nextInt();
      int fifthNum= firstNum+(5-1)*difference;
      int tenthNum= firstNum+(10-1)*difference;
      System.out.println("The fifth number is :" + fifthNum);
      System.out.println("The tenth number is :" + tenthNum);
      
      	//8
      int unit;
      int complete,remainder; 
      System.out.println("Enter your number:");
      unit=scan.nextInt();
      if (unit > 0 && unit < 10)
      {
          System.out.println("" + 1.2 * unit);
      }
      else 
      {
          if (unit == 10)
          {
              System.out.println(10);
          }
          else
          {
              if(unit > 10 && unit < 54)
              {
                  complete=unit/10;
                  remainder=unit%10;
                  System.out.println((10*complete)+(1.2*remainder));
              }
              else
              {
                  if(unit==54)
                  {  
                      System.out.println(50);
                  }
                  else
                  {
                      if(unit>54&&unit<108)
                      {
                          complete=(unit-54)/10;
                          remainder=(unit-54)%10;
                          System.out.println(50+(complete*10)+(remainder*1.2));
                      }
                      else
                      {
                          if(unit==108)
                          {
                              System.out.println(100);
                          }
                          else
                          {
                              System.out.println("Error");
                          }
                      }
                  }
              }     
           }  
        }
 
        //9
        
      System.out.println("Enter your full name: ");
	  String fullName = scan.nextLine();
	  System.out.println("Enter your school: ");
	  String school = scan.nextLine();
	  System.out.println("Enter the number of subjects you study: ");
	  int subjects = scan.nextInt();
	  System.out.printf("My name is %s, My school is %s, The number of subjects I study is %d.", fullName, school, subjects);
  
	  //10
	  System.out.print("Enter 3 digit number: ");
      int number = scan.nextInt();
          int digit1 = number / 100;
          int digit2 = (number % 100) / 10;
          int digit3 = number % 10;
          int digitsSum = digit1 + digit2 + digit3;
          System.out.println("The suum of the digits is: " + digitsSum);

    }
}   



