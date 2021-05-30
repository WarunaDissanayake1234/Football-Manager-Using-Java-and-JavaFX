package com.company;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class addMatchFX {
    public void addMatchOnAction(){
        AnchorPane W1789994_MainPane  = new AnchorPane();
        W1789994_MainPane.setId("W1789994_MainPane");
        W1789994_MainPane.setStyle("-fx-background-color: #030307;");



        AnchorPane W1789994_bodyPane = new AnchorPane(); //20191013_Show body Pane
        W1789994_bodyPane.setLayoutX(70);
        W1789994_bodyPane.setLayoutY(20);
        W1789994_bodyPane.setPrefHeight(435);
        W1789994_bodyPane.setPrefWidth(1200);
        W1789994_bodyPane.setStyle("-fx-background-color: #131022; -fx-background-radius: 10;");



        Label W1789994_club_1_ID = new Label("Home Club ID");
        W1789994_club_1_ID.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
        W1789994_club_1_ID.setLayoutX(25);
        W1789994_club_1_ID.setLayoutY(25);


        TextField W1789994_club_1_IDText = new TextField();
        W1789994_club_1_IDText.setLayoutX(211);
        W1789994_club_1_IDText.setLayoutY(24);

        Label W1789994_club_2_ID = new Label("Away Club ID");
        W1789994_club_2_ID.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
        W1789994_club_2_ID.setLayoutX(25);
        W1789994_club_2_ID.setLayoutY(100);



        TextField W1789994_club_2_IDText = new TextField();
        W1789994_club_2_IDText.setLayoutX(211);
        W1789994_club_2_IDText.setLayoutY(100);


        //W1789994_Home Team
        Label W1789994_home_Team_Goals = new Label("Home Club Goals");
        W1789994_home_Team_Goals.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
        W1789994_home_Team_Goals.setLayoutX(25);
        W1789994_home_Team_Goals.setLayoutY(175);

        TextField W1789994_goalHome_Team_Text = new TextField();
        W1789994_goalHome_Team_Text.setLayoutX(210);
        W1789994_goalHome_Team_Text.setLayoutY(175);


        //W1789994_Away team
        Label W1789994_away_Goals = new Label("Away Club Goals");
        W1789994_away_Goals.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
        W1789994_away_Goals.setLayoutX(25);
        W1789994_away_Goals.setLayoutY(250);

        TextField W1789994_goals_Away_Team = new TextField();
        W1789994_goals_Away_Team.setLayoutX(210);
        W1789994_goals_Away_Team.setLayoutY(250);


        //W1789994_Date Start
        Label W1789994_dateTopic = new Label("Match Date:");
        W1789994_dateTopic.setStyle("-fx-text-fill: #ffffff; -fx-font-size: 18px;");
        W1789994_dateTopic.setLayoutX(400);
        W1789994_dateTopic.setLayoutY(25);

        Label W1789994_dateLabel = new Label("Day");
        W1789994_dateLabel.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
        W1789994_dateLabel.setLayoutX(400);
        W1789994_dateLabel.setLayoutY(75);



        TextField W1789994_dateTextField = new TextField();
        W1789994_dateTextField.setLayoutX(450);
        W1789994_dateTextField.setLayoutY(75);

        Label W1789994_monthLb = new Label("Month");
        W1789994_monthLb.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
        W1789994_monthLb.setLayoutX(610);
        W1789994_monthLb.setLayoutY(75);

        TextField W1789994_MonthTxt = new TextField();
        W1789994_MonthTxt.setLayoutX(670);
        W1789994_MonthTxt.setLayoutY(75);

        Label W1789994_yearLb = new Label("Year");
        W1789994_yearLb.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
        W1789994_yearLb.setLayoutX(830);
        W1789994_yearLb.setLayoutY(75);

        TextField W1789994_YearTxt = new TextField();
        W1789994_YearTxt.setLayoutX(870);
        W1789994_YearTxt.setLayoutY(75);

        //W1789994_Date end

        Pane W1789994_input = new Pane();

        W1789994_input.setLayoutY(10);
        W1789994_input.setLayoutX(10);
        W1789994_input.setStyle("-fx-background-color: #1A172A; -fx-background-radius: 10;");
        W1789994_input.setPrefWidth(1020);
        W1789994_input.setPrefHeight(430);

        Button W1789994_addNewClubBtn = new Button("Add New Match");

        W1789994_addNewClubBtn.setLayoutY(125);
        W1789994_addNewClubBtn.setLayoutX(830);
        W1789994_addNewClubBtn.setPrefSize(125, 25);
        W1789994_addNewClubBtn.getStyleClass().add("button2");

        Button W1789994_resetBtn = new Button("Reset");
        W1789994_resetBtn.setLayoutY(125);
        W1789994_resetBtn.setLayoutX(730);
        W1789994_resetBtn.setPrefSize(75, 25);
        W1789994_resetBtn.getStyleClass().add("button2");

        W1789994_input.getChildren().addAll(W1789994_addNewClubBtn, W1789994_resetBtn, W1789994_club_2_ID, W1789994_club_1_ID, W1789994_club_1_IDText,
                W1789994_club_2_IDText, W1789994_dateTopic, W1789994_dateLabel, W1789994_dateTextField, W1789994_monthLb, W1789994_MonthTxt, W1789994_yearLb,
                W1789994_YearTxt, W1789994_away_Goals, W1789994_goals_Away_Team, W1789994_home_Team_Goals, W1789994_goalHome_Team_Text);

        W1789994_bodyPane.getChildren().addAll(W1789994_input);

        W1789994_addNewClubBtn.setOnAction(event -> {
            String W1789994_id_1_Str = W1789994_club_1_IDText.getText();
            String W1789994_id_2_Str = W1789994_club_2_IDText.getText();
            String W1789994_dateSt = W1789994_dateTextField.getText();
            String W1789994_monthSt = W1789994_MonthTxt.getText();
            String W1789994_yearSt = W1789994_YearTxt.getText();
            String W1789994_homeTGoalsSt = W1789994_goalHome_Team_Text.getText();
            String W1789994_awayTGoalsStr = W1789994_goals_Away_Team.getText();

            try {
                MainMenu.W1789994_MainManager.addNewMatch(Integer.parseInt(W1789994_id_1_Str), Integer.parseInt(W1789994_id_2_Str),
                        Integer.parseInt(W1789994_homeTGoalsSt), Integer.parseInt(W1789994_awayTGoalsStr), Integer.parseInt(W1789994_dateSt), Integer.parseInt(W1789994_monthSt), Integer.parseInt(W1789994_yearSt));
                AlertBoxFX.showAlert(Alert.AlertType.INFORMATION, "Success", "Club Added!");
            }catch (Exception e){
                AlertBoxFX.showAlert(Alert.AlertType.ERROR, "Error", "Please try again! Check Console For More Details!");
            }
        });

        W1789994_resetBtn.setOnAction(event -> {
            W1789994_club_1_IDText.setText("");
            W1789994_club_2_IDText.setText("");
            W1789994_dateTextField.setText("");
            W1789994_MonthTxt.setText("");
            W1789994_YearTxt.setText("");
            W1789994_goalHome_Team_Text.setText("");
            W1789994_goals_Away_Team.setText("");
        });

        W1789994_MainPane.getChildren().addAll(W1789994_bodyPane);
        Scene W1789994_calScene = new Scene(W1789994_MainPane, 1200, 400);
        Stage W1789994_newStageForCal = new Stage();
        W1789994_newStageForCal.setScene(W1789994_calScene);
        W1789994_newStageForCal.initStyle(StageStyle.UTILITY);
        W1789994_newStageForCal.setResizable(false);
        W1789994_calScene.getStylesheets().add(GUI_FX.class.getResource("secondStylesheet.css").toExternalForm());
        W1789994_newStageForCal.setScene(W1789994_calScene);
        W1789994_newStageForCal.show();
    }
}
