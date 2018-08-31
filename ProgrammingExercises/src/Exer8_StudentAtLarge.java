public class Exer8_StudentAtLarge extends Exer8_Student {

    public static final double SAL_TUITION = 2000;

    public Exer8_StudentAtLarge (String id, String name)
        {
            super(id, name);
            setTuition();
        }
        public void setTuition()
        {
            tuition = SAL_TUITION;
        }
    }