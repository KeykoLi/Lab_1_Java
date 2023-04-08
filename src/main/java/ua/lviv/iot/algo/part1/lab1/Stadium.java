package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

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

    public void addAttendance (int count)
    {
        if (getCapacity() >= getCurrentAttendance() + count){
            int currentAtt = getCurrentAttendance() + count;
            setCurrentAttendance(currentAtt);
        }
    }

    public void decreaseAttendance()
    {
        final int DECREASE = 100;
        if (getCurrentAttendance() > DECREASE){
           int currentAtt = getCurrentAttendance()- DECREASE;
           super.setCurrentAttendance(currentAtt);
        }
    }

    public void changeHomeTeam (String teamName) {
        homeTeam = teamName;
    }

    public void changeAwayTeam (String teamName) {
        awayTeam = teamName;
    }

    @Override
    public List<String> getSupportedSports() {
        List<String> supportedSports = new ArrayList<>();
        if (bicycleTrack == true)
            supportedSports.add("Bicycle races");
        if (skatingSport == true)
            supportedSports.add("Skating");
        if (football == true)
            supportedSports.add("Football");
        if (athletics == true)
            supportedSports.add("Athletics");
        return supportedSports;
    }

}