package com.alihassanstore.task3;

public class SeasonData {

    int pictures ;
    String seasonName ,testText;

    public SeasonData(int pictures, String seasonName, String testText) {
        this.pictures = pictures;
        this.seasonName = seasonName;
        this.testText = testText;
    }

    public String getTestText() {
        return testText;
    }

    public void setTestText(String testText) {
        this.testText = testText;
    }

    public SeasonData(int pictures, String seasonName) {
        this.pictures = pictures;
        this.seasonName = seasonName;
    }

    public int getPictures() {
        return pictures;
    }

    public void setPictures(int pictures) {
        this.pictures = pictures;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }
}
