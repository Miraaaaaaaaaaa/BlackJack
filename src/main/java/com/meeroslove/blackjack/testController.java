package com.meeroslove.blackjack;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class testController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView img;

    @FXML
    void initialize() {
        Image pic = new Image("Cat.jpg");
        img.setImage(pic);


    }
}
