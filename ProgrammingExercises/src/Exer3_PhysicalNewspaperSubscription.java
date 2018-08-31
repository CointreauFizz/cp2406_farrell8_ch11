public class Exer3_PhysicalNewspaperSubscription extends Exer3_NewspaperSubscription {

    private String name;
    private String address;
    private double rate;

    public void setName(String name) {
        this.name = name;
    }

        public void setAddress(String a)
        {
            boolean hasDigit = false;
            address = a;
            for(int x = 0; x < a.length(); ++x)
                if(Character.isDigit(a.charAt(x)))
                    hasDigit = true;
            if(hasDigit)
                rate = 15.00;
            else
            {
                rate = 0;
                System.out.print("\nAddress must contain a digit   ");
            }
        }

    }
