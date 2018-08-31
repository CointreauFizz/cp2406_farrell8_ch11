public class Exer8_GraduateStudent extends Exer8_Student {

    public static final double GRAD_TUITION = 6000;

    public Exer8_GraduateStudent(String id, String name)
        {
            super(id, name);
            setTuition();
        }
        public void setTuition()
        {
            tuition = GRAD_TUITION;
        }
    }