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
public final class SwimmingPool extends AbstractStadium {
   private int numberOfShowerRooms;
   private double volume;
   private int maxNumberOfParticipants;
   private boolean springboardJumping;
   private boolean artisticSwimming;
   private boolean complexSwimming;

    public SwimmingPool(final String name, final int capacity,
                        final int currentAttendance,
                        final int numberOfShowerRooms,
                        final double volume,
                        final int maxNumberOfParticipants,
                        final boolean springboardJumping,
                        final boolean artisticSwimming,
                        final boolean complexSwimming) {
        super(name, capacity, currentAttendance);
        this.numberOfShowerRooms = numberOfShowerRooms;
        this.volume = volume;
        this.maxNumberOfParticipants = maxNumberOfParticipants;
        this.springboardJumping = springboardJumping;
        this.artisticSwimming = artisticSwimming;
        this.complexSwimming = complexSwimming;
    }

    @Override
    public List<String> getSupportedSports() {
        List<String> supportedSports = new ArrayList<>();
        if (springboardJumping) {
            supportedSports.add("Springboard jumping");
        }
        if (artisticSwimming) {
            supportedSports.add("Artistic swimming");
        }
        if (complexSwimming) {
            supportedSports.add("Complex swimming");
        }
        return supportedSports;
    }
}
