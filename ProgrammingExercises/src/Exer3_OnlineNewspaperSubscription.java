public class Exer3_OnlineNewspaperSubscription extends Exer3_NewspaperSubscription {
    private String address;
    private double rate;
    private String name;

    public void setAddress(String a)
        {
            boolean hasAtSign = false;
            address = a;
            for(int x = 0; x < a.length(); ++x)
                if(a.charAt(x) == '@')
                    hasAtSign = true;
            if(hasAtSign)
                rate = 9.00;
            else
            {
                rate = 0;
                System.out.print("\nAddress must contain an at-sign (@)   ");
            }
        }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}