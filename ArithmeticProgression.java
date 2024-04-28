public class ArithmeticProgression
{
    private int firstMember;
    private int difference;

    public ArithmeticProgression(int fM, int diff)
    {
        firstMember = fM;
        difference = diff;
    }

    public void printGeneralSeries()
    {
        System.out.println("The general series formula is: an = a1 + (n-1) * difference");
    }

    public int memberCalculation(int n)
    {
        int a = firstMember + (n - 1) * difference;
        return a;
    }

    public int calculateN(int an)
    {
        int n = (an - firstMember) % difference;
        if (n == 0)
        {
            return n;
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
        ArithmeticProgression check = new ArithmeticProgression(2, 2);
        check.printGeneralSeries();
        check.memberCalculation(2);
        check.calculateN(2);
    }
}
