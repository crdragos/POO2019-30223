import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        Masina masina1 = new Masina("Audi", Color.BLUE);
        Student student1 = new Student("Farcas", "Darius", masina1);
        Student student2 = null;

        try {
            student2 = student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Inainte de revopsirea masinii studentului 1:");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println();

        student1.getMasina().repaint(Color.black);

        System.out.println("Dupa revopsirea masinii studentului 1:");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
