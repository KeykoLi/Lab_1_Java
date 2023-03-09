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
        else {
            System.out.print("Не достатня кільскість вільних місць на стадіоні");
        }
    }

    public void decreaseAttendance() {
        final int DECREASE = 100;
        if (currentAttendance > DECREASE) {
            currentAttendance -= DECREASE;
        }
        else {
            System.out.print("Глядачів на стадіоні меньше 100");
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

    @Override
    public String toString() {
        return "Stadium:" +
                "\n\tName: " + name + "; " +
                "\n\tCapacity: " + capacity + "; " +
                "\n\tCurrent Attendance: " + currentAttendance + ";" +
                "\n\tHome Team: " + homeTeam + "; " +
                "\n\tAway Team:  " + awayTeam;
    }

    public static void main(String[] args) {
        Stadium[] stadium = new Stadium[4];
        stadium[0] = new Stadium();
        stadium[1] = new Stadium("Spartac", 3000, 2140, "Dinamo", "Shahtar");
        stadium[2] = Stadium.getInstance();
        stadium[3] = Stadium.getInstance();

        for (int i = 0; i < stadium.length; ++i) {
            System.out.println("" + stadium[i]);
        }
    }
}