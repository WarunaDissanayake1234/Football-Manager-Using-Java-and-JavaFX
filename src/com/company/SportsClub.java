package com.company;

import java.util.Objects;
import java.io.Serializable;


public class SportsClub implements Serializable, Comparable<SportsClub> {
   
    private static final long serialVersionUID = 1L;


    private int W1789994_clubID;
    private String W1789994_clubName;
    private String W1789994_clubLocation;
    private int W1789994_numOfPlayers;
    private FootballClubStat W1789994_footballClubStat;
    private Date W1789994_date;

    public SportsClub(int W1789994_clubID, String W1789994_clubName, String W1789994_clubLocation, int W1789994_numOfPlayers, FootballClubStat W1789994_footballClubStat,
                      Date date) {
        this.W1789994_clubID = W1789994_clubID;
        this.W1789994_clubName = W1789994_clubName;
        this.W1789994_clubLocation = W1789994_clubLocation;
        this.W1789994_numOfPlayers = W1789994_numOfPlayers;
        this.W1789994_footballClubStat = W1789994_footballClubStat;
        this.W1789994_date = date;
    }

    public int getW1789994_clubID() {
        return W1789994_clubID;
    }

    public void setW1789994_clubID(int w1789994_clubID) {
        this.W1789994_clubID = w1789994_clubID;
    }

    public int getnumOfMembers() {
        return W1789994_numOfPlayers;
    }

    public void setnumOfMembers(int numOfMembers) {
        this.W1789994_numOfPlayers = numOfMembers;
    }

    public String getW1789994_clubLocation() {
        return W1789994_clubLocation;
    }

    public void setW1789994_clubLocation(String w1789994_clubLocation) {
        this.W1789994_clubLocation = w1789994_clubLocation;
    }

    public String getW1789994_clubName() {
        return W1789994_clubName;
    }

    public void setW1789994_clubName(String w1789994_clubName) {
        this.W1789994_clubName = w1789994_clubName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        SportsClub that = (SportsClub) obj;
        return W1789994_clubID == that.W1789994_clubID && W1789994_numOfPlayers == that.W1789994_numOfPlayers && Objects.equals(W1789994_clubName, that.W1789994_clubName)
                && Objects.equals(W1789994_clubLocation, that.W1789994_clubLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(W1789994_clubID, W1789994_clubName, W1789994_clubLocation, W1789994_numOfPlayers);
    }

    @Override
    public int compareTo(SportsClub sportsClub) {
        return (this.W1789994_clubName.compareTo(sportsClub.getW1789994_clubName()));
    }


    @Override
    public String toString() {
        return "Club ID: " + W1789994_clubID + "\nClub Name: " + W1789994_clubName + "\nLocation Of The Club: " + W1789994_clubLocation + "\nNumber Of Members" +
                W1789994_numOfPlayers;
    }

    public FootballClubStat getClubStatistics() {
        return W1789994_footballClubStat;
    }

    public void setClubStatistics(FootballClubStat footballClubStat) {
        this.W1789994_footballClubStat = footballClubStat;
    }

    public Date getDate() {
        return W1789994_date;
    }

    public void setDate(Date date) {
        this.W1789994_date = date;
    }

}