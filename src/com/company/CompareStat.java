package com.company;

import java.util.Comparator;

public class CompareStat implements Comparator<SportsClub> {

    public int compare(SportsClub sportsClubOne, SportsClub sportsClubTwo) {
        return sportsClubOne.getClubStatistics().compareTo(sportsClubTwo.getClubStatistics());
    }

}
