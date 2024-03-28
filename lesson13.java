class ArithmeticProgression
{
    private int firstMember;
    private int difference;
    
    public ArithmeticProgression(int diff, int fM)
    {
        firstMember = fM;
        difference = diff;
    }
    
    public void printGeneralSeries()
    {
        System.out.println("The general series formula is: an = a1 + (n-1)d");
    }
    
    public int memberCalculation(int n)
    {
        return firstMember + (n - 1) * difference;
    }
    
    public int calculateN(int an)
    {
        if ((an - firstMember) % difference == 0)
        {
            return (an - firstMember) / difference + 1;
        }
        else
        {
            return 0;
        }
    }
}

class Tester
{
    public static void main(String[] args)
    {
        ArithmeticProgression series = new ArithmeticProgression(2, 5);
        System.out.println("The first member of the series: " + series.memberCalculation(1));
        System.out.println("The 5th member of the series: " + series.memberCalculation(5));
        System.out.println("The general series formula:");
        series.printGeneralSeries();
        System.out.println("The value of a when n=3: " + series.memberCalculation(3));
        System.out.println("The value of n when a=11: " + series.calculateN(11));
    }
}
