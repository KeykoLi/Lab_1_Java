package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IcePalaceOfSportsTest {
    @Test
    void getSupportedSports() {
        var icePalace = new IcePalaceOfSports();
        icePalace.setCurling(true);
        icePalace.setHockey(true);
        icePalace.setFigureSkating(true);
        assertEquals(List.of ("Curling", "Hockey", "Figure skating"), icePalace.getSupportedSports());
    }
}