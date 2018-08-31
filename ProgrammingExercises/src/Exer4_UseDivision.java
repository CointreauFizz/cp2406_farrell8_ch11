public class Exer4_UseDivision {

    public abstract static class UseDivision {
        public static void main(String[] args) {
            Exer4_DomesticDivision abcDomDiv = new Exer4_DomesticDivision("Sales", 123, "California");
            Exer4_DomesticDivision xyzDomDiv = new Exer4_DomesticDivision("Technology", 234, "Kansas");
            Exer4_InternationalDivision abcIntDiv = new Exer4_InternationalDivision("Technology", 345,
                    "Germany", "German");
            Exer4_InternationalDivision xyzIntDiv = new Exer4_InternationalDivision("Marketing", 456,
                    "Japan", "Japanese");
            abcDomDiv.display();
            xyzDomDiv.display();
            abcIntDiv.display();
            xyzIntDiv.display();
        }
    }
}
