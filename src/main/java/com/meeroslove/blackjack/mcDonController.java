package com.meeroslove.blackjack;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mcDonController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    private Button rbtn;

    @FXML
    private Button mbtn;

    @FXML
    private TextField textfield;

    @FXML
    private Button sbmt;

    @FXML
    void initialize() {

        mbtn.setOnAction(actionEvent -> {
            label.setText("Misha");
        });
        rbtn.setOnAction(actionEvent -> {
            label.setText("Roma");
        });
        sbmt.setOnAction(actionEvent -> {
            String text = new String();
            text = textfield.getText();
            label.setText(text);
        });
    }
}
