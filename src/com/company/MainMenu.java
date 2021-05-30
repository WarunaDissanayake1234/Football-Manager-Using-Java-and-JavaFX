package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class MainMenu {
    public static LeagueManager W1789994_MainManager = new PremierLeagueManager();

    public static Scanner W1789994_scanner = new Scanner(System.in);  //20191013_For Input some details


    private static boolean W1789994_Flag = false;

    public static void main(String[] args) throws IOException {

        W1789994_MainManager.loadFile();

        while (true) {
            System.out.println("-------------Welcome to Premier League Manager System---------------");

            System.out.println("---------------------------------");
            System.out.println("Please Enter 1 - Add new Clubs: ");
            System.out.println("---------------------------------");
            System.out.println("Please Enter 2 - Delete Clubs: ");
            System.out.println("---------------------------------");
            System.out.println("Please Enter 3 - Print the Statics:");
            System.out.println("---------------------------------");
            System.out.println("Please Enter 4 - Print the table: ");
            System.out.println("---------------------------------");
            System.out.println("Please Enter 5 for add Match data:");
            System.out.println("---------------------------------");
            System.out.println("Please Enter 6 - Save: ");
            System.out.println("---------------------------------");
            System.out.println("Please Enter 7 - Open GUI: ");
            System.out.println("---------------------------------");
            System.out.println("Please Enter 8 - Exit: ");
            System.out.println("---------------------------------");
            System.out.println();

            System.out.print("Please Enter Number above Option: ");

            String W1789994_Option = W1789994_scanner.next();


            System.out.println("------------------------------------------------");

            //20191013_Method for MainMenu
            LeagueManager W1789994_leagueManager = new PremierLeagueManager();

            switch (W1789994_Option) {
                case "1":
                    W1789994_addNewClub();
                    break;
                case "2":
                    W1789994_DeleteClubInfo();
                    break;
                case "3":
                    W1789994_displayClubStat();
                    break;
                case "4":
                    W1789994_leagueManager.displayPremierLeagueTable();
                    break;
                case "5":
                    W1789994_MatchData();
                    break;
                case "6":
                    W1789994_leagueManager.saveToFile();
                    break;
                case "7":
                    W1789994_App_launch(GUI_FX.class);
                    break;
                case "8":
                    System.out.println("!!!GOOD BYE!!!");
                    System.exit(0);
                default: //20191013_When user Input another option
                    System.out.println("PLEASE TRY AGAIN!");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("");
            }
        }
    }


    //20191013_GUI_Launch method
    public static void W1789994_App_launch(Class<? extends Application> W1789994_GUI) {
        if (!W1789994_Flag) {
            Platform.setImplicitExit(false);
            new Thread(() -> Application.launch(W1789994_GUI)).start();
            W1789994_Flag = true;
        } else {
            Platform.runLater(() -> {
                try {
                    Application W1789994_application = W1789994_GUI.newInstance();
                    Stage W1789994_primaryStage = new Stage();
                    W1789994_application.start(W1789994_primaryStage);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }


    private static void W1789994_MatchData() {
        while (true) {
            try {
                System.out.println("Please Enter ClubID of HTeam: ");
                int W1789994_homeClubID = W1789994_scanner.nextInt();

                System.out.println("Please Enter ClubID of ATeam: ");
                int W1789994_awayClubID = W1789994_scanner.nextInt();

                System.out.println("Please  Enter Match Date: ");
                int date = W1789994_scanner.nextInt();

                System.out.println("Please Enter Match Month: ");
                int month = W1789994_scanner.nextInt();

                System.out.println("Please Enter Match Year: ");
                int year = W1789994_scanner.nextInt();

                System.out.println("Enter Goals Scored by Home Team: ");
                int W1789994_HTeamGoals = W1789994_scanner.nextInt();

                System.out.println("Enter Goals Scored by Away Team: ");
                int W1789994_ATeamGoals = W1789994_scanner.nextInt();

                W1789994_MainManager.addNewMatch(W1789994_homeClubID, W1789994_awayClubID, W1789994_HTeamGoals, W1789994_ATeamGoals, date, month, year);

            } catch (InputMismatchException e) {
                System.out.println("Error Please TRY!!!");
                W1789994_scanner.next();
                System.out.println("");
            }
        }
    }

    private static void W1789994_displayClubStat() {
        try {
            System.out.println("Enter ClubID: ");
            int clubID = W1789994_scanner.nextInt();

            W1789994_MainManager.displayClubStat(clubID);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
            W1789994_scanner.next();
            System.out.println("");
        }
    }

    private static void W1789994_DeleteClubInfo() {
        while (true) {
            try {
                System.out.println("Enter ClubID To Delete: ");
                int clubID = W1789994_scanner.nextInt();

                System.out.println("Are You Sure You Want To Delete Club " + clubID + "? (y/n) ");
                String deleteChoice = W1789994_scanner.next().toLowerCase();

                switch (deleteChoice) {
                    case "y":
                        W1789994_MainManager.deleteClub(clubID);
                        break;
                    case "n":
                        break;
                    default:
                        System.out.println("Please Re-Enter!");
                        continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT!");
                W1789994_scanner.next();
                System.out.println("");
            }
        }
    }

    private static void W1789994_addNewClub() {
        SportsClub sportsClub = null;

        while (true) {
            try {
                System.out.println("Enter Club ID: ");
                int clubID = W1789994_scanner.nextInt();

                System.out.println("Enter Name: ");
                String clubName = W1789994_scanner.next();

                System.out.println("Enter Location: ");
                String clubLocation = W1789994_scanner.next();

                System.out.println("Enter Number Of Members: ");
                int numOfMembers = W1789994_scanner.nextInt();

                System.out.println("Enter Club Number Of Wins: ");
                int clubWins = W1789994_scanner.nextInt();

                System.out.println("Enter Club Number Of Loses: ");
                int clubLoses = W1789994_scanner.nextInt();

                System.out.println("Enter Club Number Of Ties: ");
                int clubTies = W1789994_scanner.nextInt();

                System.out.println("Enter Club Number Of Matches Played: ");
                int numOfMatches = W1789994_scanner.nextInt();

                System.out.println("Enter Club Number Of Total Goals Scored: ");
                int numOfGoalsScored = W1789994_scanner.nextInt();

                System.out.println("Enter Club Number Of Total Goals Received: ");
                int numOfGoalsReceived = W1789994_scanner.nextInt();

                System.out.println("Enter Club Created Date: ");
                int date = W1789994_scanner.nextInt();

                System.out.println("Enter Club Created Month: ");
                int month = W1789994_scanner.nextInt();

                System.out.println("Enter Club Created Year: ");
                int year = W1789994_scanner.nextInt();

                System.out.println("Club Type (University, School): ");
                String clubType = W1789994_scanner.next().toLowerCase();

                switch (clubType) {
                    case "university":
                        System.out.println("Club University Name: ");
                        String clubCoach = W1789994_scanner.next().toLowerCase();

                        System.out.println("Club University Coach Name: ");
                        String W1789994_universityName = W1789994_scanner.next().toLowerCase();

                        sportsClub = new SportsClub(
                                clubID, clubName, clubLocation, numOfMembers, new FootballClubStat(clubWins, clubLoses,
                                        clubTies, numOfMatches, numOfGoalsScored, numOfGoalsReceived),
                                new Date(date, month, year));
                        break;

                    case "school":
                        System.out.println("Club School Name: ");
                        String schoolCoach = W1789994_scanner.next().toLowerCase();

                        System.out.println("Club School Coach Name: ");
                        String schoolName = W1789994_scanner.next().toLowerCase();

                        sportsClub = new SportsClub(
                                clubID, clubName, clubLocation, numOfMembers, new FootballClubStat(clubWins, clubLoses,
                                        clubTies, numOfMatches, numOfGoalsScored, numOfGoalsReceived),
                                new Date(date, month, year));
                        break;

                    default:
                        System.out.println("Please Try Re-Enter Club Type!");
                        continue;
                }

                W1789994_MainManager.addNewClub(sportsClub);
                break;
            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT!");
                W1789994_scanner.next();
                System.out.println("");
            }
        }
    }

//    public void sortArrayList() { //sorting to decending order
//        Comparator comparePoints = new Comparator<FootballClub>() {
//            @Override
//            public int compare(FootballClub cl1, FootballClub cl2) {
//                int pts1 = cl1.getpoints();
//                int pts2 = cl2.getpoints();
//                if (pts1 == pts2) {
//                    int club1GD = cl1.getgoals_scored() - cl1.getgoals_recieved();
//                    int club2GD = cl2.getgoals_scored() - cl2.getgoals_recieved();
//                    return club2GD - club1GD;
//                }
//                return pts2 - pts1;
//            }
//        };
//        Collections.sort(clubData, comparePoints);
//    }
}
