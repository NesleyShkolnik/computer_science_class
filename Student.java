class Student
{
    private String privateName;
    private String lastName;
    private int id;
    public Student(String pName, String lName, int iD)
    {
        privateName = pName;
        lastName = lName;
        id = iD;
    }
    public String toString()
    {
        return  "First name: " + privateName + "\nLast name: " + lastName + "\nId: " + id;
    }
}
class Tester
{
    public static void main(String[] args)
    {
        Student student = new Student("Nesley", "Shkolnik", 217222207);
        System.out.println(student.toString());
    }
}
