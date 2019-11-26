public class TestExceptii {
    public static void main(String[] args) throws ExceptiePicaMaterie {
        Student student = new Student("Farcas", "Draius");
        Materie[] materii = new Materie[3];
        materii[0] = new Materie("SDA", 5, 7);
        materii[1] = new Materie("PC", 4, 4);
        materii[2] = new Materie("CAN", 6, 4);

        student.setMaterii(materii);

        try {
            student.promoveazaMatrie("SDA");
            student.promoveazaMatrie("PC");
        } catch (ExceptiePicaMaterie | ExceptiePicaLaborator exceptie) {
            exceptie.printStackTrace();
        } finally {
            try {
                student.promoveazaMatrie("CAN");
            } catch (ExceptiePicaLaborator exceptiePicaLaborator) {
                exceptiePicaLaborator.printStackTrace();
            }
        }
    }
}
