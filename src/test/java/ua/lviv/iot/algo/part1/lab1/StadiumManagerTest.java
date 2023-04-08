package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

class StadiumManagerTest {
    private  StadiumManager stadiumManager;
    @BeforeEach
    @Test
   void addSportComplex(){
        List<AbstractStadium> sportComplexes = new LinkedList<>();
        StadiumManager stadiumManager = new StadiumManager();
        sportComplexes.add(new Stadium("Spartac",29000,23500,
                "Shahtar", "Dynamo", true, true,true,true));
        sportComplexes.add(new Gym("Vanguard",120,98,5,
                516,true,true,false,false));
        sportComplexes.add(new SwimmingPool("Albion",400,315, 15,
                330,11, false, true, true));
        sportComplexes.add(new IcePalaceOfSports("Severodonetsk", 500,490,
                "artificial", true, true,true, true));

        var stadium= new Stadium("Lviv",34915, 32767,"Dnipro",
                "Metalist",false, false, true, false);
        stadiumManager.addSportComplex(stadium);
        assertEquals(4,sportComplexes.size());
    }

    @Test
    void findAllMoreCapacityThan(){
        List<AbstractStadium> sportComplexes = StadiumManager.findAllMoreCapacityThan(300);
        assertEquals(3,sportComplexes.size());
    }

    @Test
    void findAllCurrentAttendanceLessThan(){
        List<AbstractStadium> sportComplexes = StadiumManager.findAllCurrentAttendanceLessThan(100);
        assertEquals(0, sportComplexes.size());
    }

}