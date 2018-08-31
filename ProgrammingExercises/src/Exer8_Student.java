public abstract class Exer8_Student {

        private String id;
        private String lastName;
        protected double tuition;

        public Exer8_Student(String id, String name) {
            setId(id);
            setLastName(name);
        }

        public void setId(String idNum) {
            id = idNum;
        }

        public void setLastName(String name) {
            lastName = name;
        }

        public String getId() {
            return id;
        }

        public String getLastName() {
            return lastName;
        }

        public double getTuition() {
            return tuition;
        }

        public abstract void setTuition();


}