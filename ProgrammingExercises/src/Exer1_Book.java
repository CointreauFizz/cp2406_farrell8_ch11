public abstract class Exer1_Book {

    private String title;
    public double price;
    public Exer1_Book(String t)
    {
        title = t;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}