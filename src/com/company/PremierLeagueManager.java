package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class PremierLeagueManager implements Serializable, LeagueManager {

    private static final long serialVersionUID = 1L;

    public static ArrayList<SportsClub> clubList = new ArrayList<>();
    public static ArrayList<Match> matchList = new ArrayList<>();

    @Override
    public void addNewClub(SportsClub sportsClub) {
        if (!clubList.contains(sportsClub)) {
            clubList.add(sportsClub);
            System.out.println("New Club Added!");
        } else
            System.out.println("Club Already Exists!");

    }

    @Override
    public void deleteClub(int clubID) {
        if (!clubList.isEmpty()) {
            for (int i = 0; i < clubList.size(); i++){
                if(clubList.get(i).getW1789994_clubID() == clubID){
                    clubList.remove(clubList.get(i));
                    System.out.println("Club Removed!");
                }
            }
        } else
            System.out.println("Club Does Not Exist!");
    }

    @Override
    public void displayClubStat(int clubID) {
        for (SportsClub sportsClub : clubList) {
            if (sportsClub.getW1789994_clubID() == clubID) {
                System.out.println();
                System.out.println("Statistics of " + sportsClub.getW1789994_clubName());
                System.out.println(sportsClub.getClubStatistics().toString());
                System.out.println();
                return;
            }
        }
        System.out.println("No Club With Id" + clubID);
        System.out.println("Please Try Again!");
    }

    @Override
    public void displayPremierLeagueTable() {
        clubList.sort(new CompareStat().reversed());
        String leftAlignment = "| %-9s | %-17s | %-11s | %-9s | %-11s | %-10s | %n";

        System.out.format("+-----------+-------------------+-------------+-----------+--------------------------+%n");
        System.out.format("|  Club ID  |     Club Name     | Club Points | Club Wins | Club Losses | Club Goals |%n");
        System.out.format("+-----------+-------------------+-------------+-----------+-------------+------------+%n");
        for (SportsClub sportsClub : clubList) {
            System.out.format(leftAlignment, sportsClub.getW1789994_clubID(), sportsClub.getW1789994_clubName(),
                    sportsClub.getClubStatistics().getClubPoints(), sportsClub.getClubStatistics().getWinCount(),
                    sportsClub.getClubStatistics().getLossCount(), sportsClub.getClubStatistics().getGoalsScored());
        }
        System.out.format("+-----------+-------------------+-------------+-----------+-------------+------------+%n");
    }

    @Override
    public void addNewMatch(int clubOneId, int clubTwoID, int clubOneGoalsScored, int clubTwoGoalsScored, int day, int month, int year) {
        SportsClub clubOne = null;
        SportsClub clubTwo = null;
        Match match = null;
        Date date = new Date(day, month, year);

        for (SportsClub sportsClub : clubList) {
            if (sportsClub.getW1789994_clubID() == clubOneId) {
                clubOne = sportsClub;
            }
            if (sportsClub.getW1789994_clubID() == clubTwoID) {
                clubTwo = sportsClub;
            }
        }

        if (clubOne == null) {
            System.out.println("No Club With ID " + clubOneId);
        } else if (clubTwo == null) {
            System.out.println("No Club With ID " + clubTwoID);
        }


        assert clubOne != null;
        clubOne.getClubStatistics().setGoalsReceived(clubOne.getClubStatistics().getGoalsReceived() + clubTwoGoalsScored) ;
        clubOne.getClubStatistics().setGoalsScored(clubOne.getClubStatistics().getGoalsScored() + clubOneGoalsScored);
        clubOne.getClubStatistics().setMatchPlayedCount(clubOne.getClubStatistics().getMatchPlayedCount() + 1);

        assert clubTwo != null;
        clubTwo.getClubStatistics().setGoalsReceived(clubTwo.getClubStatistics().getGoalsReceived() + clubOneGoalsScored) ;
        clubTwo.getClubStatistics().setGoalsScored(clubTwo.getClubStatistics().getGoalsScored() + clubTwoGoalsScored);
        clubTwo.getClubStatistics().setMatchPlayedCount(clubTwo.getClubStatistics().getMatchPlayedCount() + 1);

        if (clubOneGoalsScored > clubTwoGoalsScored) {
            clubOne.getClubStatistics().setWinCount(clubOne.getClubStatistics().getWinCount() + 1);
            clubTwo.getClubStatistics().setLossCount(clubTwo.getClubStatistics().getLossCount() + 1);
        } 
        
        else if (clubTwoGoalsScored > clubOneGoalsScored) {
            clubTwo.getClubStatistics().setWinCount(clubTwo.getClubStatistics().getWinCount() + 1);
            clubOne.getClubStatistics().setLossCount(clubOne.getClubStatistics().getLossCount() + 1);
        }
        
        else {
            clubOne.getClubStatistics().setDrawCount(clubOne.getClubStatistics().getDrawCount() + 1);
            clubTwo.getClubStatistics().setDrawCount(clubTwo.getClubStatistics().getDrawCount() + 1);
        }

        match = new Match(clubOne, clubTwo, clubOneGoalsScored, clubTwoGoalsScored, date);
        matchList.add(match);

    }
    @Override
    public void saveToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("PremireLeagueData.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clubList);
            objectOutputStream.writeObject(matchList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
        } catch (IOException e) {
            System.out.println("Error Initializing Stream!");
        }
    }


    @Override
    public void loadFile() {
        try {
            System.out.println("Welcome!");
            FileInputStream fileInputStream = new FileInputStream("PremireLeagueData.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            clubList = (ArrayList<SportsClub>) objectInputStream.readObject();
            matchList = (ArrayList<Match>) objectInputStream.readObject();
            objectInputStream.close();
            objectInputStream.close();
        }
        catch(FileNotFoundException e){
    
        }
        catch (IOException e) {
            System.out.println("Error Initializing Stream!");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }    
    }

}