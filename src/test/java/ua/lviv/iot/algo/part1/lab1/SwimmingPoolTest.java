package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SwimmingPoolTest {
    @Test
    void getSupportedSports() {
        var swimmingPool = new SwimmingPool();
        swimmingPool.setSpringboardJumping(true);
        swimmingPool.setArtisticSwimming(true);
        swimmingPool.setComplexSwimming(true);
        assertEquals(List.of("Springboard jumping", "Artistic swimming","Complex swimming"), swimmingPool.getSupportedSports());
    }
}