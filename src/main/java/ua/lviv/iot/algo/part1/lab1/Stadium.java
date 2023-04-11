package ua.lviv.iot.algo.part1.lab1;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public final class Stadium extends AbstractStadium {
    private String homeTeam;
    private String awayTeam;
    private boolean bicycleTrack;
    private boolean skatingSport;
    private boolean football;
    private boolean athletics;

    public Stadium(final String name, final int capacity,
                   final int currentAttendance, final String homeTeam,
                   final String awayTeam, final boolean bicycleTrack,
                   final boolean skatingSport, final boolean football,
                   final boolean athletics) {
        super(name, capacity, currentAttendance);
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.bicycleTrack = bicycleTrack;
        this.skatingSport = skatingSport;
        this.football = football;
        this.athletics = athletics;
    }

    public void addAttendance(final int count) {
        if (getCapacity() >= getCurrentAttendance() + count) {
            int currentAtt = getCurrentAttendance() + count;
            setCurrentAttendance(currentAtt);
        }
    }

    public void decreaseAttendance() {
        final int DECREASE = 100;
        if (getCurrentAttendance() > DECREASE) {
           int currentAtt = getCurrentAttendance() - DECREASE;
           super.setCurrentAttendance(currentAtt);
        }
    }

    public void changeHomeTeam(final String teamName) {
        homeTeam = teamName;
    }

    public void changeAwayTeam(final String teamName) {
        awayTeam = teamName;
    }

    @Override
    public List<String> getSupportedSports() {
        List<String> supportedSports = new ArrayList<>();
        if (bicycleTrack) {
            supportedSports.add("Bicycle races");
        }
        if (skatingSport) {
            supportedSports.add("Skating");
        }
        if (football) {
            supportedSports.add("Football");
        }
        if (athletics) {
            supportedSports.add("Athletics");
        }
        return supportedSports;
    }

}
