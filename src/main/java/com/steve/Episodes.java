package com.steve;

import java.util.Calendar;

public class Episodes {
    private Calendar episodeDate;
    private String guestName;
    private int seasonNumber;
    private int episodeNumber;
    private boolean liveMusic;

    public int getEpisodeYear(){
        return episodeDate.get(Calendar.YEAR);
    }

    public int getEpisodeMonth(){
        return episodeDate.get(Calendar.MONTH)+1;
    }

    public int getEpisodeDay(){
        return episodeDate.get(Calendar.DAY_OF_MONTH);
    }

    public void setEpisodeDate(int year, int month, int day){
        episodeDate.set(year, month, day);
    }

    public String getGuestName(){
        return guestName;
    }

    public void setGuestName(String guestName){
        this.guestName = guestName;
    }

    public int getSeasonNumber(){
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber){
        this.seasonNumber = seasonNumber;
    }

    public int getEpisodeNumber(){
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber){
        this.episodeNumber = episodeNumber;
    }

    public boolean isLiveMusic(){
        return liveMusic;
    }

    public void setLiveMusic(boolean liveMusic){
        this.liveMusic = liveMusic;
    }

    @Override
    public String toString(){
        return "Episode{" +
                ", episodeDate =" + episodeDate + + '\'' +
                ", guestName='" + guestName + '\'' +
                ", seasonNumber='" + seasonNumber + '\'' +
                ", episodeNumber='" + episodeNumber + '\'' +
                ", liveMusic='" + liveMusic + '}';

    }

}
