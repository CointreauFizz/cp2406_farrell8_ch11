public class Exer1_UseBook {

 public static void main(String[] args)
    {
        Exer1_Fiction aNovel = new Exer1_Fiction("Huckelberry Finn");
        Exer1_NonFiction aManual = new Exer1_NonFiction("Elements of Style");
        System.out.println("Fiction " +
                aNovel.getTitle() + " costs $" +
                aNovel.getPrice());
        System.out.println("Non-Fiction " +
                aManual.getTitle() + " costs $" +
                aManual.getPrice());
    }
}