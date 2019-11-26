public class TestExceptie {
    public static void main(String[] args) throws ExceptiePica {
        Materie materie1 = new Materie("MSI", (float) 3);
        Materie materie2 = new Materie("SDA", (float) 8);
        Materie materie3 = new Materie("AF", (float) 9);

        Materie[] materii = new Materie[3];
        materii[0] = materie1;
        materii[1] = materie2;
        materii[2] = materie3;

        Student student1 = new Student("Farcas", "Darius", materii);

        try {
            student1.trece("SDA");
            student1.trece("MSI");
        } catch (ExceptiePica exceptiePica) {
            System.out.println(exceptiePica.getMessage());;
        } finally {
            student1.trece("AF");
            student1.trece("PSN");
            System.out.println(student1.toString());;
        }
    }
}
