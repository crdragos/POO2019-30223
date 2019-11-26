public class MainClass {
    public static void main(String[] args) {
        try {
            int intNr = 5;
            float floatNr = (float) 5.3;
            System.out.println("intNr = " + intNr);
            System.out.println("floatNr = " + floatNr);
            throw new Exception("Exceptie : testLab8Pb6.4");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("S-a ajuns la clauza finally.");
        }
    }
}
