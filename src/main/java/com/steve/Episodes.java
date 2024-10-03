package com.steve;

import java.util.Calendar;

public class Episodes {
    private String guestName;
    private int seasonNumber;
    private int episodeNumber;
    private boolean liveMusic;
    private String episodeName;
    private Calendar episodeDate;

    public Episodes() {
        // Initialize the episodeDate field
        this.episodeDate = Calendar.getInstance();
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setLiveMusic(boolean liveMusic) {
        this.liveMusic = liveMusic;
    }

    public boolean isLiveMusic() {
        return liveMusic;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeDate(int year, int month, int day) {
        this.episodeDate.set(year, month, day);
    }

    public Calendar getEpisodeDate() {
        return episodeDate;
    }

    // Add the getEpisodeYear method
    public int getEpisodeYear() {
        return episodeDate.get(Calendar.YEAR);
    }

    // Add the getEpisodeMonth method
    public int getEpisodeMonth() {
        return episodeDate.get(Calendar.MONTH);
    }

    // Add the getEpisodeDay method
    public int getEpisodeDay() {
        return episodeDate.get(Calendar.DAY_OF_MONTH);
    }
}