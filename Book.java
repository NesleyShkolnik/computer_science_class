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
    public String toString()
    {
        return "The book named " + name + "was written by " + author + "and is in the category number" + categoryNumber;
    }
}
