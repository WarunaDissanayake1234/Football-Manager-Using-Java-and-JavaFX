package com.company;

import java.util.Objects;

public class UniversityFootballClub extends SportsClub {

    private static final long serialVersionUID =1L;
    private String W1789994_universityName;

    public UniversityFootballClub(int W1789994_clubID, String W1789994_clubName, String W1789994_clubLocation, int W1789994_numOfPlayers, FootballClubStat W1789994_footballClubStat, Date date) {
        super(W1789994_clubID, W1789994_clubName, W1789994_clubLocation, W1789994_numOfPlayers, W1789994_footballClubStat, date);
    }

    public String getW1789994_universityName() {
        return W1789994_universityName;
    }

    public void setW1789994_universityName(String w1789994_universityName) {
        W1789994_universityName = w1789994_universityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UniversityFootballClub that = (UniversityFootballClub) o;
        return W1789994_universityName.equals(that.W1789994_universityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), W1789994_universityName);
    }

    @Override
    public String toString() {
        return "UniversityFootballClub{" +
                "W1789994_universityName='" + W1789994_universityName + '\'' +
                '}';
    }
}
