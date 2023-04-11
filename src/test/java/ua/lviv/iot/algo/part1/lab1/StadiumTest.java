package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import  java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StadiumTest {
    @Test
    void add200Attendance() {
        var stadium=new Stadium();
        stadium.setCurrentAttendance(1500);
        stadium.setCapacity(2000);
        stadium.addAttendance(200);
        assertTrue(stadium.getCurrentAttendance() == 1700);
    }

    @Test
    void decreaseAttendance() {
        var stadium=new Stadium();
        stadium.setCurrentAttendance(1500);
        stadium.decreaseAttendance();
        assertTrue(stadium.getCurrentAttendance() == 1400);
    }

    @Test
    void changeHomeTeamToDinamo() {
        var stadium = new Stadium();
        stadium.setHomeTeam("Dnipro");
        stadium.changeHomeTeam("Dinamo");
        assertTrue(stadium.getHomeTeam() == "Dinamo");
    }

    @Test
    void changeAwayTeamToDnipro() {
        var stadium = new Stadium();
        stadium.setAwayTeam("Dinamo");
        stadium.changeAwayTeam("Dnipro");
        assertTrue(stadium.getAwayTeam() == "Dnipro");
    }

    @Test
    void getSupportedBicycleSkatingFootballAthletics() {
        var stadium = new  Stadium();
        stadium.setBicycleTrack(true);
        stadium.setSkatingSport(true);
        stadium.setFootball(true);
        stadium.setAthletics(true);
        assertEquals(List.of("Bicycle races", "Skating","Football","Athletics"), stadium.getSupportedSports());
    }

    @Test
    void getSupportedBicycleSkatingFootball() {
        var stadium = new  Stadium();
        stadium.setBicycleTrack(true);
        stadium.setSkatingSport(true);
        stadium.setFootball(true);
        stadium.setAthletics(false);
        assertEquals(List.of("Bicycle races", "Skating","Football"), stadium.getSupportedSports());
    }

    @Test
    void getSupportedBicycleSkating() {
        var stadium = new  Stadium();
        stadium.setBicycleTrack(true);
        stadium.setSkatingSport(true);
        stadium.setFootball(false);
        stadium.setAthletics(false);
        assertEquals(List.of("Bicycle races", "Skating"), stadium.getSupportedSports());
    }
}