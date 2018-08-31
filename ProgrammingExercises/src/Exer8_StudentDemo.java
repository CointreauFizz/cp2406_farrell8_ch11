public class Exer8_StudentDemo {

        public static void main(String[] args)
        {
            Exer8_Student students[] = new Exer8_Student[6];
            int i;
            students[0] = new Exer8_UndergraduateStudent("111", "Lambert");
            students[1] = new Exer8_UndergraduateStudent("122", "Lembeck");
            students[2] = new Exer8_GraduateStudent("233", "Miller");
            students[3] = new Exer8_GraduateStudent("256", "Marmon");
            students[4] = new Exer8_StudentAtLarge("312", "Nichols");
            students[5] = new Exer8_StudentAtLarge("376", "Nussbaum");
            for(i = 0; i < students.length; ++i)
                System.out.println("\nStudent # " +
                        students[i].getId() + " Name: " +
                        students[i].getLastName() + "  Tuition: " +
                        students[i].getTuition() + " per year");
        }
    }