package com.company;

import java.io.Serializable;
import java.util.Objects;

public class FootballClubStat implements Serializable, Comparable<FootballClubStat> {

    private static final long serialVersionUID = 1L;
    private int winCount;
    private int lossCount;
    private int drawCount;
    private int matchPlayedCount;
    private int goalsScored;
    private int goalsReceived;
    private int clubPoints;

    public FootballClubStat(int winCount, int lossCount, int drawCount, int matchPlayedCount, int goalsScored,
                            int goalsReceived) {
        this.winCount = winCount;
        this.lossCount = lossCount;
        this.drawCount = drawCount;
        this.matchPlayedCount = matchPlayedCount;
        this.goalsScored = goalsScored;
        this.goalsReceived = goalsReceived;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getLossCount() {
        return lossCount;
    }

    public void setLossCount(int lossCount) {
        this.lossCount = lossCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }

    public int getMatchPlayedCount() {
        return matchPlayedCount;
    }

    public void setMatchPlayedCount(int matchPlayedCount) {
        this.matchPlayedCount = matchPlayedCount;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public void setGoalsReceived(int goalsReceived) {
        this.goalsReceived = goalsReceived;
    }

    public int getClubPoints() {
        return (this.winCount * 3) + (this.drawCount);
    }

    public void setClubPoints(int clubPoints) {
        this.clubPoints = clubPoints;
    }

    @Override
    public String toString() {
        return "Number Of Wins: " + winCount + "\nNumber Of Losses: " + lossCount + "\nNumber Of Draws: " + drawCount
                + "\nNumber Of Matches Played: " + matchPlayedCount + "\nTotal Number Of Goals Scored: " + goalsScored
                + "\nTotal Number Of Goals Received: " + goalsReceived + "\nClub Points: " + getClubPoints();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof FootballClubStat))
            return false;
        FootballClubStat that = (FootballClubStat) obj;
        return winCount == that.winCount && lossCount == that.lossCount && drawCount == that.drawCount
                && matchPlayedCount == that.matchPlayedCount && goalsScored == that.goalsScored
                && goalsReceived == that.goalsReceived && clubPoints == that.clubPoints;
    }

    @Override
    public int hashCode() {
        return Objects.hash(winCount, lossCount, drawCount, matchPlayedCount, goalsScored, goalsReceived, clubPoints);
    }

    @Override
    public int compareTo(FootballClubStat footballClubStat) {
        if (getClubPoints() == footballClubStat.getClubPoints()) {
            return getGoalsScored() - footballClubStat.getGoalsScored();
        } else
            return getClubPoints() - footballClubStat.getClubPoints();
    }
}