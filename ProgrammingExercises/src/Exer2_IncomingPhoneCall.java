public class Exer2_IncomingPhoneCall extends Exer2_PhoneCall {

    public final static double RATE = .02;
    public Exer2_IncomingPhoneCall(String num)
    {
        super(num);
        price = RATE;
    }
    public void getInfo()
    {
        System.out.println("Incoming phone call " +
                getPhoneNumber() + " " + RATE + " per call. Total is $" +
                + getPrice());
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public double getPrice()
    {
        return price;
    }
}