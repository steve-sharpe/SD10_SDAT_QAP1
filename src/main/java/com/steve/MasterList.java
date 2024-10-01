package com.steve;

import java.util.ArrayList;
import java.util.List;

public class MasterList {

    private List<Integer> eligibleSeasonNumbers;

    private String episodeName;

    public void addEligibleSeasonNumber(int eligibleSeasonNumber) {
        if (eligibleSeasonNumbers == null) {
            eligibleSeasonNumbers = new ArrayList<>();
        }

        eligibleSeasonNumbers.add(eligibleSeasonNumber);
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public List<Integer> getEligibleSeasonNumbers() {
        return eligibleSeasonNumbers;
    }

    public void setEligibleSeasonNumbers(List<Integer> eligibleSeasonNumbers) {
        this.eligibleSeasonNumbers = eligibleSeasonNumbers;
    }

    @Override
    public String toString() {
        return "MasterList [eligibleSeasonNumbers="
                + eligibleSeasonNumbers + ", episodeName=" + episodeName + "]";
    }





}
