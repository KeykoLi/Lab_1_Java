package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> getSupportedSports() {
        List<String> supportedSports = new ArrayList<>();
        if (curling == true)
            supportedSports.add("Curling");
        if (hockey == true)
            supportedSports.add("Hockey");
        if (figureSkating == true)
            supportedSports.add("Figure skating");
        return supportedSports;
    }
}
