package com.meeroslove.blackjack;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class mainmenuController {
    /*public int userID;
    mainmenuController(int id){
        userID = id;
    }*/
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button plBlackjack;

    @FXML
    private Button plRoulette;

    @FXML
    private Button plBaccara;

    @FXML
    private Button signOutButton;

    @FXML
    private Label nameLabel;

    @FXML
    private Button statisticsButton;

    @FXML
    void initialize() {
        signOutButton.setOnAction(actionEvent -> {
            signOutButton.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 700, 400);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setTitle("Welcome to MRM Casino");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        });
        nameLabel.setText("Zig Heil!");

    }
}
