package com.company;

import javafx.scene.control.*;

public class AlertBoxFX {

    public static void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.setHeaderText("Message!");
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.getStyleClass().add("dialogPane");
        dialogPane.getStylesheets().add(GUI_FX.class.getResource("secondStylesheet.css").toExternalForm());
        alert.show();
    }
}