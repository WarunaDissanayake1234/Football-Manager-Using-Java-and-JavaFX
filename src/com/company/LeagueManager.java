package com.company;

public interface LeagueManager {

	void addNewClub(SportsClub sportsClub);

    void deleteClub(int clubID);

    void displayClubStat(int clubID);

    void displayPremierLeagueTable();
    
    void addNewMatch(int clubOneId, int clubTwoID, int clubOneGoalsScored, int clubTwoGoalsScored, int day, int month, int year);

    void saveToFile();

    void loadFile();

}
