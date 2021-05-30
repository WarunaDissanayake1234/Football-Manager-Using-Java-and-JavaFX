package com.company;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AddRandomMatchFX {
    public void addRandomMatchOnAction() {
        AnchorPane mainAnchorPane  = new AnchorPane();
        mainAnchorPane.setId("mainAnchorPane");
        mainAnchorPane.setStyle("-fx-background-color:rgb(136, 161, 177);");

        Button generateBtn = new Button("Generate");
        generateBtn.setLayoutY(50.0);
        generateBtn.setLayoutX(50.0);
        generateBtn.setPrefSize(125.0, 25.0);
        generateBtn.getStyleClass().add("button2");

        generateBtn.setOnAction(event -> {
            List<SportsClub> matchTeams = getRandomElement(PremierLeagueManager.clubList);

            String homeTeam = null;
            String awayTeam = null;

            for (int i = 0; i < PremierLeagueManager.clubList.size() ; i++){
                for (int j = 1; j < i; j++){
                    if (matchTeams.get(0) != matchTeams.get(1)){
                        homeTeam = matchTeams.get(0).getW1789994_clubName();
                        awayTeam = matchTeams.get(1).getW1789994_clubName();
                    }
                    else {
                        homeTeam = PremierLeagueManager.clubList.get(i).getW1789994_clubName();
                        awayTeam = PremierLeagueManager.clubList.get(j).getW1789994_clubName();
                        break;
                    }
                }
            }
            System.out.println(homeTeam + " VS " + awayTeam);

            Random random = new Random();
            int homeGaols = random.nextInt(10);
            int awayGoals = random.nextInt(10);

            System.out.println(homeTeam + " : " + homeGaols );
            System.out.println(awayTeam + " : " + awayGoals );

            int day = random.nextInt(29) + 1;
            int month = random.nextInt(11) + 1;
            int year = 2020;

            MainMenu.W1789994_MainManager.addNewMatch(matchTeams.get(0).getW1789994_clubID(), matchTeams.get(1).getW1789994_clubID(), homeGaols, awayGoals, day, month, year);

        });

        mainAnchorPane.getChildren().addAll(generateBtn);

        Scene calScene = new Scene(mainAnchorPane, 500, 150);
        Stage newStageForCal = new Stage();
        newStageForCal.setScene(calScene);
        newStageForCal.initStyle(StageStyle.UTILITY);
        newStageForCal.setResizable(false);
        calScene.getStylesheets().add(GUI_FX.class.getResource("secondStylesheet.css").toExternalForm());
        newStageForCal.setScene(calScene);
        newStageForCal.show();
    }

    public List<SportsClub> getRandomElement(List<SportsClub> list) {
        Random random = new Random();
        List<SportsClub> tempList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int randomNum = random.nextInt(list.size());
            tempList.add(list.get(randomNum));
        }
        return tempList;
    }

}
