package convertor.models;

public class Moneda {
    private  String nume;
    private  String abreviere;

    public  String convert(String suma, Double valoareCurs) {
        Double sumaSchimbata;
        Double sumaInitiala = Double.parseDouble(suma);
        sumaSchimbata = sumaInitiala * valoareCurs;

        return sumaSchimbata.toString();
    }

}
