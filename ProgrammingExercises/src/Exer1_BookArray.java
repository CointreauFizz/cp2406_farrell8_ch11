public class Exer1_BookArray {

    public static void main(String[] args) {
        Exer1_Book someBook[] = new Exer1_Book[10];
        int x;
        someBook[0] = new Exer1_Fiction("Scarlet Letter");
        someBook[1] = new Exer1_NonFiction("Introduction to Java");
        someBook[2] = new Exer1_Fiction("Twilight");
        someBook[3] = new Exer1_NonFiction("The Road Not Taken");
        someBook[4] = new Exer1_Fiction("A Tale of Two Cities");
        someBook[5] = new Exer1_NonFiction("Europe on $5 a Day");
        someBook[6] = new Exer1_Fiction("War and Peace");
        someBook[7] = new Exer1_Fiction("A Simple Plan");
        someBook[8] = new Exer1_Fiction("Disclosure");
        someBook[9] = new Exer1_Fiction("Nancy Drew");
        for (x = 0; x < someBook.length; ++x)
            System.out.println("Book: " + someBook[x].getTitle() + " costs $" + someBook[x].getPrice());
    }

}

