public class TestAIOOBE {
    public static void main(String[] args) {
        int[] vector = new int[5];

        for (int i = 0; i < 5; i++) {
            vector[i] = i;
        }

        try {
            System.out.println(vector[4]);
            System.out.println(vector[5]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
