package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Stadium {
    private String name;
    private int capacity;
    private int currentAttendance;
    private String homeTeam;
    private String awayTeam;

    private static Stadium instance;

    public void addAttendies(int count) {
        if (capacity >=currentAttendance + count) {
            currentAttendance += count;
        }
    }

    public void decreaseAttendance() {
        final int DECREASE = 100;
        if (currentAttendance > DECREASE) {
            currentAttendance -= DECREASE;
        }
    }

    public void changeHomeTeam(String teamName) {
        homeTeam = teamName;
    }

    public void changeAwayTeam(String teamName) {
        awayTeam = teamName;
    }

    public static Stadium getInstance() {
        if (instance == null) {
            instance = new Stadium();
        }
        return instance;
    }

    public static void main(String[] args) {
        Stadium[] stadium = {
            new Stadium(),
            new Stadium("Spartac", 3000, 2140, "Dinamo", "Shahtar"),
            Stadium.getInstance(),
            Stadium.getInstance()
        };

        for (Stadium stadiums : stadium) {
            System.out.println(stadiums);
        }
    }
}