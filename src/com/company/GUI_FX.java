package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GUI_FX extends  Application {

    @Override
    public void start(Stage W1789994_primaryStage) throws Exception {

        BorderPane W1789994_BorderPaneForBody = new BorderPane();

        AnchorPane W1789994_anchorPaneForLeftSide = new AnchorPane();
        W1789994_anchorPaneForLeftSide.setId("W1789994_anchorPaneForLeftSide");

        AnchorPane W1789994_anchorPaneForRightSide = new AnchorPane();
        W1789994_anchorPaneForRightSide.setId("W1789994_anchorPaneForRightSide");



        //W1789994_Display Matches

        Button W1789994_MatchesForBtn =
                SettingFXButtons.button("Display Matches" ,80.1,200.1,130, true, true);
        W1789994_MatchesForBtn.setOnAction(e ->{
            DisplayMatchesFX W1789994_displayMatchesFX = new DisplayMatchesFX();
            W1789994_displayMatchesFX.displayMatches();
        });





        //W1789994_Add Random Match
        Button W1789994_deleteACRClubBtn =
                SettingFXButtons.button("Add Random Match" ,80.1,200.1,530, true, true);
        W1789994_deleteACRClubBtn.setOnAction(e ->{
            AddRandomMatchFX W1789994_deleteACRClubBtnOnAction = new AddRandomMatchFX();
            W1789994_deleteACRClubBtnOnAction.addRandomMatchOnAction();
        });





        //W1789994_Show Clubs
        Button displayClubBtn =
                SettingFXButtons.button("Show Clubs Data" ,80.1,480.1,130, true, true);
        displayClubBtn.setOnAction(e ->{
            displayClubFX displayClubFX = new displayClubFX();
            displayClubFX.displayClubOnAction();
        });





        //W1789994_Add New Match
        Button W1789994_addNewMatchBtn =
                SettingFXButtons.button("Add new Match" ,80.1,480.1,530, true, true);
        W1789994_addNewMatchBtn.setOnAction(e ->{
            addMatchFX W1789994_addMatchFX = new addMatchFX();
            W1789994_addMatchFX.addMatchOnAction();
        });



        //W1789994_Save Button
        Button W1789994_SaveBtn =
                SettingFXButtons.button("Save Details\t", 30.1,250.1,0.0,true, true);
        W1789994_SaveBtn.setId("leftSideBtn");
        W1789994_SaveBtn.setOnAction(e ->{
            MainMenu.W1789994_MainManager.saveToFile();
            AlertBoxFX.showAlert(Alert.AlertType.INFORMATION, "Saved", "Successfully Saved Data!");
        });




        //W1789994_Quit Button

        Button W1789994_quitBtn =
                SettingFXButtons.button("Quit\t", 30.1,450.1,0.0,true, true);
        W1789994_quitBtn.setId("leftSideBtn");
        W1789994_quitBtn.setOnAction(e ->{
            W1789994_primaryStage.close();
        });


        //W1789994_Title
        Label W1789994_HomeTitle = new Label("FootBall Management System");
        AnchorPane.setLeftAnchor(W1789994_HomeTitle,200.1);
        AnchorPane.setTopAnchor(W1789994_HomeTitle, 50.1);

        W1789994_anchorPaneForLeftSide.getChildren().addAll( W1789994_quitBtn,W1789994_SaveBtn);
        W1789994_anchorPaneForRightSide.getChildren().addAll(W1789994_HomeTitle,W1789994_MatchesForBtn, W1789994_deleteACRClubBtn, displayClubBtn, W1789994_addNewMatchBtn);

        W1789994_BorderPaneForBody.setLeft(W1789994_anchorPaneForLeftSide);
        W1789994_BorderPaneForBody.setCenter(W1789994_anchorPaneForRightSide);
        Scene W1789994_mainScene = new Scene(W1789994_BorderPaneForBody);

        //W1789994_WindowTitle
        W1789994_primaryStage.setTitle("FootBall Manager");
        W1789994_primaryStage.setScene(W1789994_mainScene);
        W1789994_primaryStage.setResizable(false);
        W1789994_mainScene.getStylesheets().add(GUI_FX.class.getResource("stylesheet.css").toExternalForm());
        W1789994_primaryStage.show();
    }
}
