package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StadiumManager {
    private static List<SportComplex> sportComplexes = new LinkedList<>();

    private void addSportComplex(SportComplex sportComplexToAdd){
        this.sportComplexes.add(sportComplexToAdd);
    }

    public static List<SportComplex>findAllMoreCapacityThan(int capacity){
        return sportComplexes.stream()
                .filter(sportComplexes -> sportComplexes.getCapacity()>capacity)
                .collect(Collectors.toList());
    }

    public static List<SportComplex>findAllCurrentAttendanceLessThan(int currentAttendance){
        return sportComplexes.stream()
                .filter(sportComplex -> sportComplex.getCurrentAttendance()<currentAttendance)
                .collect(Collectors.toList());
    }

    public static void main(String... args){
        List<SportComplex> sportComplexes=new LinkedList<>();
        StadiumManager stadiumManager= new StadiumManager();
        stadiumManager.addSportComplex(new Stadium("Spartac",29000,23500,"Shahtar", "Dynamo", true,true,true, true));
        stadiumManager.addSportComplex(new SwimmingPool("Delfin",1910, 1540,40,280.5, 10, true, true, true));
        stadiumManager.addSportComplex(new Stadium("Lviv",34915, 32767,"Dnipro", "Metalist",false, false, true, false));
        stadiumManager.addSportComplex(new SwimmingPool("Albion",400,315,15,330,11, false, true,true));
        stadiumManager.addSportComplex(new Gym("Vanguard",120,98,5,516,true,true,false,false));
        stadiumManager.addSportComplex(new IcePalaceOfSports("Severodonetsk", 500,490,"artificial", true, true,true, true));
        stadiumManager.addSportComplex(new IcePalaceOfSports("White bars",380, 308,"artificial", false,false, true,true ));
        stadiumManager.addSportComplex(new Gym("Vitaz", 100,78,5,490,false, false,true,true));

        for( SportComplex sportComplex: stadiumManager.sportComplexes){
            System.out.println(sportComplex+"\n");
        }

        final int filterCapacity=25000;
        System.out.println("All Sport complexes with capacity of more than " + filterCapacity+":\n");
        System.out.println(StadiumManager.findAllMoreCapacityThan(filterCapacity));

        final int sortCurrent=1000;
        System.out.println("\nAll Sport complexes with current attendance less than " + sortCurrent+":\n");
        System.out.println(StadiumManager.findAllCurrentAttendanceLessThan(sortCurrent));
    }
}


