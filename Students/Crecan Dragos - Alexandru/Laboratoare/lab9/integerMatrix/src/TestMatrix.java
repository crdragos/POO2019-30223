public class TestMatrix {
    public static void main(String[] args) {
        Integer m1[][] = new Integer[][]{{1, 2, 3}, {4, 5 ,6}, {1, 1, 1}};
        Integer m2[][] = new Integer[][]{{1, 1, 1}, {2, 2 ,2}, {0, 0, 0}};

        IntegerMatrix integerMatrix = new IntegerMatrix();

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');

        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');

        Double m3[][] = new Double[][]{{15.0, 32.0, 27.0}, {34.0, 27.5, 34.5}, {33.1, 12.4, 18.5}};
        Double m4[][] = new Double[][]{{21.0, 33.0, 12.0}, {68.0, 12.7, 56.7}, {41.2, 26.1, 12.4}};

        DoubleMatrix doubleMatrix = new DoubleMatrix();

        System.out.println("\n m3 + m4 is : ");
        GenericMatrix.printResult(m3, m4, doubleMatrix.addMatrix(m3, m4), '+');

        System.out.println("\n m3 * m4 is : ");
        GenericMatrix.printResult(m3, m4, doubleMatrix.multiplyMatrix(m3, m4), '*');

        Long[][] m5 = new Long[][]{{(long) 1234567899, (long) 1526347842, (long) 1965847123}, {(long) 1234117899, (long) 1126347842, (long) 1165847123}, {(long) 1526397411, (long) 1214236977, (long) 1452631789}};
        Long[][] m6 = new Long[][]{{(long) 1234567899, (long) 1526347842, (long) 1965847123}, {(long) 1234117899, (long) 1126347842, (long) 1165847123}, {(long) 1526397411, (long) 1214236977, (long) 1452631789}};

        LongMatrix longMatrix = new LongMatrix();
        System.out.println("\n m5 + m6 : ");
        GenericMatrix.printResult(m5, m6, longMatrix.addMatrix(m5, m6), '+');

        System.out.println("\n m5 * m6 : ");
        GenericMatrix.printResult(m5, m6, longMatrix.multiplyMatrix(m5, m6), '*');
    }
}
