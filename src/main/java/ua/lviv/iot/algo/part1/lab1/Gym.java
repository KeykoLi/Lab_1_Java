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
public final class Gym extends AbstractStadium {
    private  int numberOfShowerRooms;
    private double square;
    private boolean volleyball;
    private  boolean basketball;
    private boolean handball;
    private boolean karate;

    public Gym(final String  name, final int capacity,
               final int currentAttendance, final int numberOfShowerRooms,
               final double square, final boolean volleyball,
               final boolean basketball, final boolean handball,
               final boolean karate) {
        super(name, capacity, currentAttendance);
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
        if (volleyball) {
            supportedSports.add("Volleyball");
        }
        if (basketball) {
            supportedSports.add("Basketball");
        }
        if (handball) {
            supportedSports.add("Handball");
        }
        if (karate) {
            supportedSports.add("Karate");
        }
        return supportedSports;
    }
}
