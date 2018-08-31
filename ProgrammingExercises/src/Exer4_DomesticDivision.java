public class Exer4_DomesticDivision extends Exer4_Division {

        protected String state;
        public Exer4_DomesticDivision(String title, int acct, String st)
        {
            super(title, acct);
            state = st;
        }
        public void display()
        {
            System.out.println("Domestic Division: " +
                    divisionTitle + "  Acct #" + acctNum +
                    "\nLocated in " + state);
        }
    }
