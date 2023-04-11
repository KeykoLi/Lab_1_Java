package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class StadiumManagerTest {
    private StadiumManager stadiumManager;

    @BeforeEach
    void setUp(){
        stadiumManager = new StadiumManager();
        stadiumManager.addSportComplex(new Stadium("Spartac",29000,23500,
                "Shahtar", "Dynamo", true, true,true,true));
        stadiumManager.addSportComplex(new Gym("Vanguard",120,102,5,
                516,true,true,false,false));
        stadiumManager.addSportComplex(new IcePalaceOfSports("Severodonetsk", 150,130,
                "artificial", true, true,true, true));

    }

    @Test
    void addSportComplex(){
        var stadium = new Stadium("Lviv",3915, 3767,"Dnipro",
                "Metalist",false, false, true, false);
        stadiumManager.addSportComplex(stadium);
        Assertions.assertTrue(stadiumManager.getSportComplexes().contains(stadium));
        Assertions.assertEquals(4, stadiumManager.getSportComplexes().size());
    }

    @Test
    void findAllMoreCapacityThan(){
        List<AbstractStadium> sortList = stadiumManager.findAllMoreCapacityThan(1000);
        Assertions.assertEquals(3,sortList.size());
        for(var sportComplexes : sortList) {
            Assertions.assertTrue(sportComplexes.getCapacity() >1000);
        }
    }

    @Test
    void findAllCurrentAttendanceLessThan(){
        List<AbstractStadium> sortList = stadiumManager.findAllCurrentAttendanceLessThan(200);
        Assertions.assertEquals(6,sortList.size());
        for(var sportComplex : sortList){
            Assertions.assertTrue(sportComplex.getCurrentAttendance()<200);
        }
    }

}