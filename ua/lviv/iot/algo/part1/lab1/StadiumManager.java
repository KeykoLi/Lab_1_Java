package ua.lviv.iot.algo.part1.lab1;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class StadiumManager {
    private static List<AbstractStadium> sportComplex = new LinkedList<>();
    private static final int FILTER_CURRENT_ATTENDANCE = 1000;
    private static final int FIlTER_CAPACITY = 25000;

    private static List<AbstractStadium> findAllMoreCapacityThan (int capacity) {
        return sportComplex.stream()
                             .filter(sportComplexes -> sportComplexes.getCapacity() > capacity)
                             .collect(Collectors.toList());
    }

    private static List<AbstractStadium> findAllCurrentAttendanceLessThan (int currentAttendance) {
        return sportComplex.stream()
                             .filter(sportComplex -> sportComplex.getCurrentAttendance() < currentAttendance)
                             .collect(Collectors.toList());
    }
    private void addSportComplex (AbstractStadium sportComplexToAdd) {
        sportComplex.add(sportComplexToAdd);
    }

    public static void main (String... args) {
        List<AbstractStadium> sportComplexes = new LinkedList<>();

        StadiumManager stadiumManager = new StadiumManager();
        stadiumManager.addSportComplex (new Stadium("Spartac",29000,23500,
                "Shahtar", "Dynamo", true, true,true, true));
        stadiumManager.addSportComplex (new SwimmingPool("Delfin",1910, 1540,
                40,280.5, 10, true, true,
                true));
        stadiumManager.addSportComplex (new Stadium("Lviv",34915, 32767,"Dnipro",
                "Metalist",false, false, true, false));
        stadiumManager.addSportComplex (new SwimmingPool("Albion",400,315,
                15,330,11, false, true,
                true));
        stadiumManager.addSportComplex (new Gym("Vanguard",120,98,5,
                516,true,true,false,false));
        stadiumManager.addSportComplex (new IcePalaceOfSports("Severodonetsk", 500,490,
                "artificial", true, true,true, true));
        stadiumManager.addSportComplex (new IcePalaceOfSports("White bars",380, 308,
                "artificial", false,false, true,true ));
        stadiumManager.addSportComplex (new Gym("Vitaz", 100,78,5,
                490,false, false,true,true));

        for (AbstractStadium sportComplex: stadiumManager.sportComplex) {
            System.out.println(sportComplex+"\n");
        }

        System.out.println("All Sport complexes with capacity of more than " + FIlTER_CAPACITY + ":\n");
        System.out.println(StadiumManager.findAllMoreCapacityThan (FIlTER_CAPACITY));
        System.out.println("\nAll Sport complexes with current attendance less than " + FILTER_CURRENT_ATTENDANCE + ":\n");
        System.out.println(StadiumManager.findAllCurrentAttendanceLessThan (FILTER_CURRENT_ATTENDANCE));
    }
}


