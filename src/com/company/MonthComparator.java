package com.company;

import java.util.Comparator;

public class MonthComparator implements Comparator<Match>{

    @Override
    public int compare(Match matchOne, Match matchTwo) {
        return matchOne.getDate().compareTo(matchTwo.getDate().getMonth());
    }
}
