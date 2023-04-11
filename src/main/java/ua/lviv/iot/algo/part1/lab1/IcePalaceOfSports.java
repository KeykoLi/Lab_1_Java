package ua.lviv.iot.algo.part1.lab1;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public final class IcePalaceOfSports extends AbstractStadium {
    private String cover;
    private boolean closedType;
    private boolean curling;
    private boolean hockey;
    private boolean figureSkating;

    public IcePalaceOfSports(final String name, final int capacity,
                             final int currentAttendance, final String cover,
                             final boolean closedType, final boolean curling,
                             final boolean hockey,
                             final boolean figureSkating) {
        super(name, capacity, currentAttendance);
        this.cover = cover;
        this.closedType = closedType;
        this.curling = curling;
        this.hockey = hockey;
        this.figureSkating = figureSkating;
    }

    @Override
    public List<String> getSupportedSports() {
        List<String> supportedSports = new ArrayList<>();
        if (curling) {
            supportedSports.add("Curling");
        }
        if (hockey) {
            supportedSports.add("Hockey");
        }
        if (figureSkating) {
            supportedSports.add("Figure skating");
        }
        return supportedSports;
    }
}
