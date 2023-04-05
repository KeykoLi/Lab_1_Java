package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class IcePalaceOfSports extends AbstractStadium {
    private String cover;
    private boolean closedType;
    private boolean curling;
    private boolean hockey;
    private boolean figureSkating;

    public IcePalaceOfSports (String name, int capacity, int currentAttendance,String cover, boolean closedType,
                              boolean curling, boolean hockey, boolean figureSkating) {
        super (name, capacity, currentAttendance);
        this.cover = cover;
        this.closedType = closedType;
        this.curling = curling;
        this.hockey = hockey;
        this.figureSkating = figureSkating;
    }

    @Override
    public void getSupportedSports() {
        System.out.println("What types of sports can be played at this sports complex:");
        if (curling == true)
            System.out.println("Curling");
        if (hockey == true)
            System.out.println("Hockey");
        if (figureSkating == true)
            System.out.println("Figure skating");

    }
}
