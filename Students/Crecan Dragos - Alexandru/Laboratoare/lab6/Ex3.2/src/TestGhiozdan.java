public class TestGhiozdan {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();

        System.out.println("Initial in ghiozdan aveam: ");
        System.out.println(ghiozdan.getNrRechizite() + " rechizite, dintre care " + ghiozdan.getNrManuale() + " manuale si " + ghiozdan.getNrCaiete() + " caiete.");
        System.out.println();

        Caiet caietMatematica = new Caiet("Matematica");
        ghiozdan.addCaiet(caietMatematica);

        Caiet caietInformatica = new Caiet("Informatica");
        ghiozdan.addCaiet(caietInformatica);

        Caiet caietBiologie = new Caiet("Biologie");
        ghiozdan.addCaiet(caietBiologie);

        Manual manualChimie = new Manual("Chimie");
        ghiozdan.addManual(manualChimie);

        Manual manualIstorie = new Manual("Istorie");
        ghiozdan.addManual(manualIstorie);

        Manual manualRomana = new Manual("Romana");
        ghiozdan.addManual(manualRomana);

        Manual manualEngleza = new Manual("Engleza");
        ghiozdan.addManual(manualEngleza);

        System.out.println("Dupa adaugarea rechizitelor, in ghiozdan se afla: ");
        System.out.println(ghiozdan.getNrRechizite() + " rechizite, dintre care " + ghiozdan.getNrManuale() + " manuale si " + ghiozdan.getNrCaiete() + " caiete.");
        System.out.println();

        System.out.println("Rechizitele sunt: ");
        ghiozdan.listItems();
        System.out.println();

        System.out.println("Manualele sunt: ");
        ghiozdan.listManuale();
        System.out.println();

        System.out.println("Caietele sunt: ");
        ghiozdan.listCaiete();
        System.out.println();
    }
}
