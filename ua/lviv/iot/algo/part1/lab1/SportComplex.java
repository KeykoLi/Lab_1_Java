package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public abstract class SportComplex {
    protected String name;
    protected int capacity;
    protected int currentAttendance;
    public abstract void getSupportedSports();

}
