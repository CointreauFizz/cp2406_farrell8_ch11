public abstract class  Exer2_PhoneCall {

    String phoneNumber;
    double price;
    public Exer2_PhoneCall(String num)
    {
        phoneNumber = num;
        price = 0.0;
    }
    public void setPrice(double pr)
    {
        price = pr;
    }
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();
}