package com.company;

import javafx.scene.control.Button;

public class SettingFXButtons {

    public static Button button(String buttonName, double reqSizeImg,
                                double YCoordinate, double XCoordinate,
                                boolean preserveRatio, boolean smooth) {

        Button button1 = new Button(buttonName);

        button1.setLayoutY(YCoordinate);
        button1.setLayoutX(XCoordinate);
        return button1;
    }
}
