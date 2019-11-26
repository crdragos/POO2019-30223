public class TestNullPointerException {
    public static void main(String[] args) {
        String nullString = null;

        try {
            nullString.charAt(5);
        } catch (Exception nullPointerExeception) {
            System.out.println(nullPointerExeception.getMessage());
            nullPointerExeception.printStackTrace();
        }
    }
}
