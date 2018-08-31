public class Exer8_UndergraduateStudent extends Exer8_Student {

    public static final double UNDERGRAD_TUITION = 4000;

    public Exer8_UndergraduateStudent(String id, String name) {
        super(id, name);
        setTuition();


    }

    public void setTuition() {
        tuition = UNDERGRAD_TUITION;
    }

}