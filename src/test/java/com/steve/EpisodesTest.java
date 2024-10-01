package com.steve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class EpisodesTest {

    @Test
    public void testIsSeasonEligible(){
        Episodes newEpisode = new Episodes();
        Calendar episodeDate = Calendar.getInstance();
        episodeDate.set(2024,Calendar.SEPTEMBER, 24);
        newEpisode.setGuestName("Abra Whitney");
        newEpisode.setSeasonNumber(2);
        newEpisode.setEpisodeNumber(12);
        newEpisode.setLiveMusic(true);

        MasterList masterListTest = new MasterList();
        masterListTest.setEpisodeName("Abra");
        masterListTest.addEligibleSeasonNumber(1);
        masterListTest.addEligibleSeasonNumber(2);

        Assertions.assertTrue(masterListTest.getEligibleSeasonNumbers().contains(3));
    }
}
