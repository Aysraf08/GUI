/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aysraf08
 */
public class KalkulatorController implements Initializable {

    @FXML
    private Button no1;
    @FXML
    private Button hapus;
    @FXML
    private Button no2;
    @FXML
    private Button no3;
    @FXML
    private Button tambah;
    @FXML
    private Button no4;
    @FXML
    private Button no5;
    @FXML
    private Button no6;
    @FXML
    private Button kurang;
    @FXML
    private Button no7;
    @FXML
    private Button no8;
    @FXML
    private Button no9;
    @FXML
    private Button kali;
    @FXML
    private Button no0;
    @FXML
    private Button sama;
    @FXML
    private Button bagi;
    @FXML
    private TextField hasil;
    private int Data1;
    private String oprator = "netral";
    private int Data2;
    private int result;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClicked(ActionEvent event) {
        if(event.getSource() == no0) {
            hasil.setText(hasil.getText() + "0");
        } else if(event.getSource() == no1) {
            hasil.setText(hasil.getText() + "1");
        } else if(event.getSource() == no2) {
            hasil.setText(hasil.getText() + "2");
        } else if(event.getSource() == no3) {
            hasil.setText(hasil.getText() + "3");
        } else if(event.getSource() == no4) {
            hasil.setText(hasil.getText() + "4");
        } else if(event.getSource() == no5) {
            hasil.setText(hasil.getText() + "5");
        } else if(event.getSource() == no6) {
            hasil.setText(hasil.getText() + "6");
        } else if(event.getSource() == no7) {
            hasil.setText(hasil.getText() + "7");
        } else if(event.getSource() == no8) {
            hasil.setText(hasil.getText() + "8");
        } else if(event.getSource() == no9) {
            hasil.setText(hasil.getText() + "9");
        } else if(event.getSource() == tambah) {
            if(!hasil.getText().isBlank()) {
                Data1 = Integer.parseInt(hasil.getText());
                oprator = "plus";
                hasil.setText("");
            } 
        } else if(event.getSource() == kurang) {
            if(!hasil.getText().isBlank()) {
                Data1 = Integer.parseInt(hasil.getText());
                oprator = "minus";
                hasil.setText("");
            }
        } else if(event.getSource() == kali) {
            if(!hasil.getText().isBlank()) {
                Data1 = Integer.parseInt(hasil.getText());
                oprator = "time";
                hasil.setText("");
            }   
        } else if(event.getSource() == bagi) {
            if(!hasil.getText().isBlank()) {
                Data1 = Integer.parseInt(hasil.getText());
                oprator = "devided";
                hasil.setText("");
            }   
        } else if(event.getSource() == sama) { 
            if(!hasil.getText().isBlank()) {
                Data2 = Integer.parseInt(hasil.getText());
                if(oprator.equals("plus")) {
                    result = Data1 + Data2;
                } else if(oprator.equals("minus")) {
                    result = Data1 - Data2;
                } else if(oprator.equals("time")) {
                    result = Data1 * Data2;
                } else if(oprator.equals("devided")) {
                    result = Data1 / Data2;
                }
                hasil.setText(String.valueOf(result));
                oprator = "netral";
            } else {
                hasil.setText("");
            }
        } else if(event.getSource() == hapus) {
            hasil.setText("");
        }
    }
    
}
