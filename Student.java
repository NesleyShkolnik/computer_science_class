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
    public String getPrivateName()
    {
        return privateName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getId()
    {
        return id;
    }
    public void setPrivateName(String pName)
    {
        privateName = pName;
    }
    public void setLastName(String lName)
    {
        lastName = lName;
    }
    public void setId(int iD)
    {
        id = iD;
    }
    public Student(Student other)
    {
        privateName=other.privateName;
        lastName=other.lastName;
        id=other.id;
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
