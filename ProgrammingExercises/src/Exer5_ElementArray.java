public abstract class Exer5_ElementArray {

        public static void main(String[] args)
        {
            Exer5_Element elements[] = new Exer5_Element[5];
            int i;
            elements[0] = new Exer5_MetalElement("Au", 79, 197.0);
            elements[1] = new Exer5_NonMetalElement("He", 2, 4.003);
            elements[2] = new Exer5_MetalElement("Ag", 47, 107.9);
            elements[3] = new Exer5_NonMetalElement("Ne", 1029, 20.18);
            elements[4] = new Exer5_MetalElement("Cu", 29, 63.55);
            for(i = 0; i < elements.length; ++i)
                elements[i].describeElement();
        }
    }