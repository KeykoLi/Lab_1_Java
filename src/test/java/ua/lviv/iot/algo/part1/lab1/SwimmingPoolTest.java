package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SwimmingPoolTest {
    @Test
    public void testToString() {
        var swimmingPool = new SwimmingPool("Delfin",1910, 1540,
                40,280.5, 10, true, true,
                true);
        String str = swimmingPool.toString();
        assertTrue(str.contains("super=AbstractStadium(name=Delfin, capacity=1910, currentAttendance=1540"));
        assertTrue(str.contains("numberOfShowerRooms=40, volume=280.5, maxNumberOfParticipants=10, springboardJumping=true, artisticSwimming=true, complexSwimming=true"));
    }

    @Test
    void getSupportedSports() {
        var swimmingPool = new SwimmingPool();
        swimmingPool.setSpringboardJumping(true);
        swimmingPool.setArtisticSwimming(true);
        swimmingPool.setComplexSwimming(true);
        assertEquals(List.of("Springboard jumping", "Artistic swimming","Complex swimming"), swimmingPool.getSupportedSports());
    }
}