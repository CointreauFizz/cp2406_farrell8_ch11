public class Exer4_InternationalDivision extends Exer4_Division {

        protected String country;
        protected String language;
        public Exer4_InternationalDivision(String title, int acct, String cty, String lang)
        {
            super(title, acct);
            country = cty;
            language = lang;
        }
        public void display()
        {
            System.out.println("International Division: " + divisionTitle +
                    "  Acct #" + acctNum + "\nLocated in " + country +
                    " Language is " + language);
        }
    }
