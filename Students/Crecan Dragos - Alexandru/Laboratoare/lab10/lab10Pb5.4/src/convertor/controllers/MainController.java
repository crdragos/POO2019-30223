package convertor.controllers;

import convertor.models.Moneda;
import convertor.views.MainMenuFrame;

public class MainController {
    public static void main(String[] args) {
        Moneda moneda = new Moneda();
        MainMenuFrame mainMenuFrame = new MainMenuFrame(moneda);
        MainMenuController mainMenuController = new MainMenuController(moneda, mainMenuFrame);
        centerFrame(mainMenuFrame);
        mainMenuFrame.setVisible(true);
    }

    private static void centerFrame(MainMenuFrame mainMenuFrame) {
    }
}
