package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class Gym extends AbstractStadium{
    private int numberOfShowerRooms;
    private double square;
    private boolean volleyball;
    private boolean basketball;
    private boolean handball;
    private boolean karate;

    public Gym (String name, int capacity, int currentAttendance, int numberOfShowerRooms,
               double square, boolean volleyball, boolean basketball, boolean handball, boolean karate) {
        super (name, capacity, currentAttendance);
        this.numberOfShowerRooms = numberOfShowerRooms;
        this.square = square;
        this.volleyball = volleyball;
        this.basketball = basketball;
        this.handball = handball;
        this.karate = karate;
    }

    @Override
    public List<String> getSupportedSports() {
        List<String> supportedSports = new ArrayList<>();
        if (volleyball == true)
            supportedSports.add("Volleyball");
        if (basketball == true)
            supportedSports.add("Basketball");
        if (handball == true)
            supportedSports.add("Handball");
        if (karate == true)
            supportedSports.add("Karate");
        return supportedSports;
    }
}
