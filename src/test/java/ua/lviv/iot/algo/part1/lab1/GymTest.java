package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class GymTest {
    @Test
    public void testToString() {
        var gym = new Gym("Vanguard",120,98,5,
                516,true,true,false,false);
        String str = gym.toString();
        assertTrue(str.contains("super=AbstractStadium(name=Vanguard, capacity=120, currentAttendance=98"));
        assertTrue(str.contains("numberOfShowerRooms=5, square=516.0, volleyball=true, basketball=true, handball=false, karate=false"));
    }

    @org.junit.jupiter.api.Test
    void getSupportedSports() {
        var gym = new Gym();
        gym.setVolleyball(true);
        gym.setBasketball(true);
        gym.setHandball(true);
        gym.setKarate(true);
        assertEquals(List.of("Volleyball", "Basketball", "Handball", "Karate"), gym.getSupportedSports());
    }

}