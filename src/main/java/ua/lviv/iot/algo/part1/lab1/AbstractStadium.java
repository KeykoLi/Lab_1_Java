package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class AbstractStadium {
    private String name;
    private int capacity;
    private int currentAttendance;

    abstract public List<String> getSupportedSports();
}
