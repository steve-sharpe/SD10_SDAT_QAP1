package com.steve;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class EpisodesTest {

    @Test
    public void testEpisodeName() {
        Episodes newEpisode = new Episodes();
        newEpisode.setEpisodeDate(2024, Calendar.SEPTEMBER, 24);
        newEpisode.setGuestName("Abra Whitney");
        newEpisode.setSeasonNumber(2);
        newEpisode.setEpisodeNumber(12);
        newEpisode.setLiveMusic(true);
        newEpisode.setEpisodeName("Abra Whitney Special");

        // Check if the episode name is correctly set
        Assertions.assertEquals("Abra Whitney Special", newEpisode.getEpisodeName());
    }

    @Test
    public void testEpisodeYear() {
        Episodes newEpisode = new Episodes();
        newEpisode.setEpisodeDate(2024, Calendar.SEPTEMBER, 24);

        // Check if the episode year is correctly set
        Assertions.assertEquals(2024, newEpisode.getEpisodeYear());
    }

    @Test
    public void testEpisodeMonth() {
        Episodes newEpisode = new Episodes();
        newEpisode.setEpisodeDate(2024, Calendar.SEPTEMBER, 24);

        // Check if the episode month is correctly set
        Assertions.assertEquals(Calendar.SEPTEMBER, newEpisode.getEpisodeMonth());
    }

    @Test
    public void testEpisodeDay() {
        Episodes newEpisode = new Episodes();
        newEpisode.setEpisodeDate(2024, Calendar.SEPTEMBER, 24);

        // Check if the episode day is correctly set
        Assertions.assertEquals(24, newEpisode.getEpisodeDay());
    }

    @Test
    public void testGuestName() {
        Episodes newEpisode = new Episodes();
        newEpisode.setGuestName("John Doe");

        // Check if the guest name is correctly set
        Assertions.assertEquals("John Doe", newEpisode.getGuestName());
    }

    @Test
    public void testSeasonNumber() {
        Episodes newEpisode = new Episodes();
        newEpisode.setSeasonNumber(3);

        // Check if the season number is correctly set
        Assertions.assertEquals(3, newEpisode.getSeasonNumber());
    }

    @Test
    public void testEpisodeNumber() {
        Episodes newEpisode = new Episodes();
        newEpisode.setEpisodeNumber(5);

        // Check if the episode number is correctly set
        Assertions.assertEquals(5, newEpisode.getEpisodeNumber());
    }

    @Test
    public void testLiveMusic() {
        Episodes newEpisode = new Episodes();
        newEpisode.setLiveMusic(true);

        // Check if the live music status is correctly set
        Assertions.assertTrue(newEpisode.isLiveMusic());
    }

    @Test
    public void testEpisodeDate() {
        Episodes newEpisode = new Episodes();
        newEpisode.setEpisodeDate(2023, Calendar.JUNE, 15);

        // Check if the episode date is correctly set
        Calendar expectedDate = Calendar.getInstance();
        expectedDate.set(2023, Calendar.JUNE, 15);

        Assertions.assertEquals(expectedDate.get(Calendar.YEAR), newEpisode.getEpisodeYear());
        Assertions.assertEquals(expectedDate.get(Calendar.MONTH), newEpisode.getEpisodeMonth());
        Assertions.assertEquals(expectedDate.get(Calendar.DAY_OF_MONTH), newEpisode.getEpisodeDay());
    }

    // New Tests

    @Test
    public void testGuestNameNotNull() {
        Episodes newEpisode = new Episodes();
        newEpisode.setGuestName("Jane Doe");

        // Check if the guest name is not null
        Assertions.assertNotNull(newEpisode.getGuestName());
    }

    @Test
    public void testSeasonNumberPositive() {
        Episodes newEpisode = new Episodes();
        newEpisode.setSeasonNumber(4);

        // Check if the season number is positive
        Assertions.assertTrue(newEpisode.getSeasonNumber() > 0);
    }

    @Test
    public void testEpisodeNumberInRange() {
        Episodes newEpisode = new Episodes();
        newEpisode.setEpisodeNumber(10);

        // Check if the episode number is within a specific range
        Assertions.assertTrue(newEpisode.getEpisodeNumber() >= 1 && newEpisode.getEpisodeNumber() <= 20);
    }
}