package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class Stadium extends AbstractStadium {
    private String homeTeam;
    private String awayTeam;
    private boolean bicycleTrack;
    private boolean skatingSport;
    private boolean football;
    private boolean athletics;

    public Stadium(String name, int capacity, int currentAttendance, String homeTeam, String awayTeam,
                   boolean bicycleTrack, boolean skatingSport, boolean football, boolean athletics) {
        super (name, capacity, currentAttendance);
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.bicycleTrack = bicycleTrack;
        this.skatingSport = skatingSport;
        this.football = football;
        this.athletics = athletics;
    }

    public void changeHomeTeam (String teamName) {
        homeTeam = teamName;
    }

    public void changeAwayTeam (String teamName) {
        awayTeam = teamName;
    }

    @Override
    public void getSupportedSports() {
        System.out.println("What types of sports can be played at this sports complex:");
        if (skatingSport == true)
            System.out.println("Skating");
        if (football == true)
            System.out.println("Football");
        if (athletics == true)
            System.out.println("Athletic");
        if (bicycleTrack == true)
            System.out.println("Bicycle races");
    }


}