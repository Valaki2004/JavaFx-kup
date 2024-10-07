package hu.vtg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField areaid;

    @FXML
    private TextField magassagid;

    @FXML
    private TextField sugarid;

    @FXML
    void Calc(ActionEvent event) {
        startCalc();
    }

    private void startCalc(){
        String magasssaString = magassagid.getText();
        String sugaString = sugarid.getText();
        double radius =Double.parseDouble(sugaString);
        double height = Double.parseDouble(magasssaString);
        Double area = CalcArea(radius,height);
        areaid.setText(area.toString());
    }
    private double CalcArea (double sugar, double magassag){
        double area = 1.0/3.0 * Math.pow(sugar, 2) * Math.PI * magassag;
        return area;
    }
}

