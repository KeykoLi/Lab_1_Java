package ua.lviv.iot.algo.part1.lab1;

import java.util.List;
import java.util.LinkedList;

public final class StadiumManager {
    private static List<AbstractStadium> sportComplexes = new LinkedList<>();

     List<AbstractStadium> getSportComplexes() {
        return sportComplexes;
    }

    public static List<AbstractStadium> findAllMoreCapacityThan(
            final int capacity) {
        return sportComplexes.stream()
                .filter(sportComplexes ->
                        sportComplexes.getCapacity() > capacity)
                .toList();
    }

    public static List<AbstractStadium> findAllCurrentAttendanceLessThan(
            final int currentAttendance) {
        return sportComplexes.stream()
                .filter(sportComplexes ->
                        sportComplexes
                                .getCurrentAttendance() < currentAttendance)
                .toList();
    }

    public void addSportComplex(final AbstractStadium sportComplexToAdd) {
        this.sportComplexes.add(sportComplexToAdd);
    }
}
