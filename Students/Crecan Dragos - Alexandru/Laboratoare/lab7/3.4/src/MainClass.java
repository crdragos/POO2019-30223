import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Person[] persoane = new Person[5];

        persoane[0] = new Person("Coman", "Florin", 21);
        persoane[1] = new Person("Man", "Andrei", 25);
        persoane[2] = new Person("Apostol", "Catalin", 20);
        persoane[3] = new Person("Apostol", "Darius", 21);
        persoane[4] = new Person("Alexandru", "Andrei", 20);

        Arrays.sort(persoane);

        for (int i = 0; i < persoane.length; i++) {
            System.out.println(persoane[i].toString());
        }
    }
}
