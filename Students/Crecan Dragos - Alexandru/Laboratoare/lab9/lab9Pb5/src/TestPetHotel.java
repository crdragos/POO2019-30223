public class TestPetHotel {
    public static void main(String[] args) {
        Caine caine0 = new Caine("Azorel");
        Caine caine1 = new Caine("Bobita");
        Caine caine2 = new Caine("Maya");
        Caine caine3 = new Caine("Athos");
        Caine caine4 = new Caine("Rex");

        PetHotel petHotel = new PetHotel("Pet Hotel", 3);

        petHotel.cazeaza(caine0);
        petHotel.cazeaza(caine1);
        petHotel.cazeaza(caine2);
        petHotel.cazeaza(caine3);
        petHotel.cazeaza(caine4);
        petHotel.printCaini();

        petHotel.decazeaza(caine2);
        petHotel.cazeaza(caine3);
        petHotel.printCaini();

        petHotel.ingrijesteCaini();
        petHotel.printCaini();
    }
}
