package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class GymTest {
    @Test
    void getSupportedSports() {
        var gym = new Gym();
        gym.setVolleyball(true);
        gym.setBasketball(true);
        gym.setHandball(true);
        gym.setKarate(true);
        assertEquals(List.of("Volleyball", "Basketball", "Handball", "Karate"), gym.getSupportedSports());
    }

}