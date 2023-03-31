package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class Gym extends SportComplex{
    private int numberOfShowerRooms;
    private double square;
    private boolean volleyball;
    private boolean basketball;
    private boolean handball;
    private boolean karate;

    public Gym(String name, int capacity, int currentAttendance, int numberOfShowerRooms, double square, boolean volleyball, boolean basketball, boolean handball, boolean karate) {
        super(name, capacity, currentAttendance);
        this.numberOfShowerRooms = numberOfShowerRooms;
        this.square = square;
        this.volleyball = volleyball;
        this.basketball = basketball;
        this.handball = handball;
        this.karate = karate;
    }
    @Override
    public void getSupportedSports() { System.out.println("What types of sports can be played at this sports complex:");
        if (volleyball == true)
            System.out.println("Volleyball");
        if (basketball == true)
            System.out.println("Basketball");
        if (handball == true)
            System.out.println("Handball");
        if (karate == true)
            System.out.println("Karate");

    }
}
