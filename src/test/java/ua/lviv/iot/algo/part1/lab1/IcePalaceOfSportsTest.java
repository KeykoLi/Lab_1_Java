package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IcePalaceOfSportsTest {
    @Test
    public void testToString() {
        var icePalaceOfSports = new IcePalaceOfSports("Severodonetsk", 500,490,
                "artificial", true, true,true, true);
        String str = icePalaceOfSports.toString();
        assertTrue(str.contains("super=AbstractStadium(name=Severodonetsk, capacity=500, currentAttendance=490"));
        assertTrue(str.contains("cover=artificial, closedType=true, curling=true, hockey=true, figureSkating=true"));
    }

    @Test
    void getSupportedSports() {
        var icePalace = new IcePalaceOfSports();
        icePalace.setCurling(true);
        icePalace.setHockey(true);
        icePalace.setFigureSkating(true);
        assertEquals(List.of("Curling", "Hockey", "Figure skating"), icePalace.getSupportedSports());
    }
}