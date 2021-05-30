package com.company;

import java.io.Serializable;

public class Match implements Serializable, Comparable<Match> {

    private SportsClub clubOne;
    private SportsClub clubTwo;
    private int clubOneGoalsScored;
    private int clubTwoGoalsScore;
    private Date date;

    public Match(SportsClub clubOne, SportsClub clubTwo, int clubOneGoalsScored, int clubTwoGoalsScore, Date date) {
        this.setClubOne(clubOne);
        this.setClubTwo(clubTwo);
        this.setClubOneGoalsScored(clubOneGoalsScored);
        this.setClubTwoGoalsScore(clubTwoGoalsScore);
        this.setDate(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getClubTwoGoalsScore() {
        return clubTwoGoalsScore;
    }

    public void setClubTwoGoalsScore(int clubTwoGoalsScore) {
        this.clubTwoGoalsScore = clubTwoGoalsScore;
    }

    public int getClubOneGoalsScored() {
        return clubOneGoalsScored;
    }

    public void setClubOneGoalsScored(int clubOneGoalsScored) {
        this.clubOneGoalsScored = clubOneGoalsScored;

    }
    public SportsClub getClubTwo() {
        return clubTwo;
    }

    public void setClubTwo(SportsClub clubTwo) {
        this.clubTwo = clubTwo;
    }

    public SportsClub getClubOne() {
        return clubOne;
    }

    public void setClubOne(SportsClub clubOne) {
        this.clubOne = clubOne;
    }


    @Override
    public int compareTo(Match match) {
        return this.clubOne.compareTo(match.getClubOne());
    }
}
