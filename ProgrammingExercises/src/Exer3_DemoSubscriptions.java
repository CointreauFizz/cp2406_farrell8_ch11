public class Exer3_DemoSubscriptions {

    public static void main(String args[])

    {

        Exer3_PhysicalNewspaperSubscription pnsGood = new Exer3_PhysicalNewspaperSubscription();

        Exer3_OnlineNewspaperSubscription onsGood = new Exer3_OnlineNewspaperSubscription();

        Exer3_PhysicalNewspaperSubscription pnsBad = new Exer3_PhysicalNewspaperSubscription();

        Exer3_OnlineNewspaperSubscription onsBad = new Exer3_OnlineNewspaperSubscription();

        pnsGood.setName("DePalma");

        pnsGood.setAddress("23 Oak Avenue");

        display(pnsGood);

        pnsBad.setName("Gomez");

        pnsBad.setAddress("Maple Street");

        display(pnsBad);

        onsGood.setName("Carter");

        onsGood.setAddress("carter@myMail.com");

        display(onsGood);

        onsBad.setName("Lee");

        onsBad.setAddress("Elm Street");

        display(onsBad);

        }

        public static void display(Exer3_NewspaperSubscription n)
        {
            System.out.println("Name: " + n.getName() + "   Address: " +

                    n.getAddress() + "   Rate: " + n.getRate() + "\n");

        }

    }

