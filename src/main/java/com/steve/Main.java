package com.steve;

import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Episodes episode = new Episodes();

        // Set episode date
        episode.setEpisodeDate(24, 10, 31);

        // Set other properties
        episode.setGuestName("John Doe");
        episode.setSeasonNumber(1);
        episode.setEpisodeNumber(1);
        episode.setLiveMusic(true);

        // Print episode details
        System.out.println("Episode Year: " + episode.getEpisodeYear());
        System.out.println("Episode Month: " + episode.getEpisodeMonth());
        System.out.println("Episode Day: " + episode.getEpisodeDay());
        System.out.println("Guest Name: " + episode.getGuestName());
        System.out.println("Season Number: " + episode.getSeasonNumber());
        System.out.println("Episode Number: " + episode.getEpisodeNumber());
        System.out.println("Live Music: " + episode.isLiveMusic());

        // Print the episode using toString method
        System.out.println(episode);
    }
}
