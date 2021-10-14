module com.meeroslove.blackjack {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.meeroslove.blackjack to javafx.fxml;
    exports com.meeroslove.blackjack;
}