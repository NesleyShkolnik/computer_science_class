class Book
{
    String name;
    String author;
    int categoryNumber;
    public Book(String bookName, String authorName, int num)
    {
        name=bookName;
        author=authorName;
        categoryNumber=num;
    }
    public String getName()
    {
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getCategoryNumber()
    {
        return categoryNumber;
    }
    public void setName(String bookName)
    {
        name = bookName;
    }
    public void setAuthor(String bookAuthor)
    {
        author = bookAuthor;
    }
    public void setCategoryNumber(int num)
    {
        categoryNumber = num;
    }
    public Book(Book other)
    {
        name = other.name;
        author = other.author;
        categoryNumber = other.categoryNumber;
    }
    public String toString()
    {
        return "The book named " + name + "was written by " + author + "and is in the category number" + categoryNumber;
    }
    public boolean check(Book otherBook)
    {
        if(categoryNumber == otherBook.categoryNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
