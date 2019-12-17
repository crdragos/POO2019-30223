package convertor.controllers;

import convertor.models.Moneda;
import convertor.views.MainMenuFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController {
    private Moneda moneda;
    private MainMenuFrame mainMenuFrame;

    public MainMenuController(Moneda model, MainMenuFrame view) {
        moneda = model;
        mainMenuFrame = view;

        view.addConvertActionListener(new ConvertActionListener());
    }

    private class ConvertActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            String valuta1 = "";
            String valuta2 = "";
            String convertedValue = "";
            try {
                userInput = mainMenuFrame.getUserInput();
                valuta1 = mainMenuFrame.getValuta1Input();
                valuta2 = mainMenuFrame.getValuta2Input();

                if (valuta1.equals("USD") == true) {
                    if (valuta2.equals("USD") == true) {
                        convertedValue = moneda.convert(userInput, 1.0);
                    } else if (valuta2.equals("EUR") == true) {
                        convertedValue = moneda.convert(userInput, 0.89);
                    } else if (valuta2.equals("RON") == true) {
                        convertedValue = moneda.convert(userInput, 4.27);
                    }
                } else if (valuta1.equals("EUR") == true) {
                    if (valuta2.equals("EUR") == true) {
                        convertedValue = moneda.convert(userInput, 1.0);
                    } else if (valuta2.equals("USD") == true) {
                        convertedValue = moneda.convert(userInput, 1.12);
                    } else if (valuta2.equals("RON") == true) {
                        convertedValue = moneda.convert(userInput, 4.78);
                    }
                } else if (valuta1.equals("RON") == true) {
                    if (valuta2.equals("RON") == true) {
                        convertedValue = moneda.convert(userInput, 1.0);
                    } else if (valuta2.equals("EUR") == true) {
                        convertedValue = moneda.convert(userInput, 0.21);
                    } else if (valuta2.equals("USD") == true) {
                        convertedValue = moneda.convert(userInput, 0.23);
                    }
                }

                mainMenuFrame.setResult(convertedValue);

            } catch (NumberFormatException nfex) {
                mainMenuFrame.showError("Bad input : '" + userInput + "'");
            }
        }
    }
}
