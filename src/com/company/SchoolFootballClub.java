package com.company;

import java.util.Objects;

public class SchoolFootballClub extends SportsClub {

    private static final long serialVersionUID = 1L;
    private String schoolName;
    private String coachName;

    public SchoolFootballClub(int clubID, String clubName, String clubLocation, int numOfMembers,
                              FootballClubStat footballClubStat, Date date, String schoolName, String coachName) {
        super(clubID, clubName, clubLocation, numOfMembers, footballClubStat, date);
        this.schoolName = schoolName;
        this.coachName = coachName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    @Override
    public String toString() {
        return "School Name='" + schoolName + "\nCoach Name='" + coachName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SchoolFootballClub))
            return false;
        SchoolFootballClub that = (SchoolFootballClub) obj;
        return Objects.equals(schoolName, that.schoolName) && Objects.equals(coachName, that.coachName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, coachName);
    }

}
