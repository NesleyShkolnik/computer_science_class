public class ArithmeticProgression
{
    private int firstMember;
    private int difference;

    public ArithmeticProgression(int fM, int diff)
    {
        firstMember = fM;
        difference = diff;
    }
    public int getFirstMember()
    {
        return firstMember;
    }
    public int getDifference()
    {
        return difference;
    }
    public void setFirstMember(int fM)
    {
        firstMember = fM;
    }

    public void setDifference(int diff)
    {
        difference = diff;
    }
    public ArithmeticProgression(ArithmeticProgression other)
    {
        firstMember=other.firstMember;
        difference=other.difference;
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
    public boolean equal(ArithmeticProgression other)
    {
        if((firstMember==other.firstMember)&&(difference==other.difference))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean smallDiff(ArithmeticProgression other)
    {
        if(other.difference < difference)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Tester
{
    public static void main(String[] args)
    {
        ArithmeticProgression check = new ArithmeticProgression(2, 2);
        int firstMember = check.getFirstMember();
        int difference = check.getDifference();
        System.out.println("First Member: " + firstMember);
        System.out.println("Difference: " + difference);
        check.setFirstMember(3);
        check.setDifference(3);
        ArithmeticProgression copy = new ArithmeticProgression(check);
        copy.printGeneralSeries();
        int member = check.memberCalculation(2);
        System.out.println("Member Calculation: " + member);
        int n = check.calculateN(2);
        System.out.println("N Calculation: " + n);
        ArithmeticProgression other = new ArithmeticProgression(3, 3);
        System.out.println("Are equal: " + check.equal(other));
        System.out.println("Small difference: " + check.smallDiff(other));
    }
}
