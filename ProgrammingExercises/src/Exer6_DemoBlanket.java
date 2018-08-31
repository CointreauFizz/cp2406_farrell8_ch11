public class Exer6_DemoBlanket extends Exer6_ElectricBlanket{

        public static void main(String[] args)
        {
            Exer6_Blanket b = new Exer6_Blanket();
            System.out.println(b.toString());
            b.setMaterial("wool");
            System.out.println(b.toString());
            b.setSize("Queen");
            System.out.println(b.toString());
            b.setMaterial("Fleece");
            System.out.println(b.toString());
            b.setSize("King");
            System.out.println(b.toString());
            b.setSize("Extra large");
            System.out.println(b.toString());
//------------------------------
            Exer6_ElectricBlanket e = new Exer6_ElectricBlanket();
            System.out.println(e.toString());
            e.setMaterial("Cashmere");
            System.out.println(b.toString());
            e.setSettings(3);
            e.setMaterial("Wool");
            System.out.println(e.toString());
            System.out.println(e.toString());
            b.setSize("5");
            System.out.println(b.toString());
            e.setHasAutoShutoff(true);
            System.out.println(e.toString());
            e.setSettings(10);
            System.out.println(e.toString());
            e.setHasAutoShutoff(true);
            System.out.println(e.toString());
        }

    }
