public abstract class Exer5_Element {

        private String symbol;
        private int atomicNumber;
        private double atomicWeight;
        Exer5_Element(String s, int an, double aw)
        {
            symbol = s;
            atomicNumber =an;
            atomicWeight = aw;
        }
        String getSymbol()
        {
            return symbol;
        }
        int getAtomicNumber()
        {
            return atomicNumber;
        }
        double getAtomicWeight()
        {
            return atomicWeight;
        }
        public abstract void describeElement();
    }