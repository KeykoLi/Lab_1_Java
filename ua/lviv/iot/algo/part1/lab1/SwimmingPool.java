package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class SwimmingPool extends SportComplex {
   private int numberOfShowerRooms;
   private double volume;
   private int maxNumberOfParticipants;
   private boolean springboardJumping;
   private boolean artisticSwimming;
   private boolean complexSwimming;

    public SwimmingPool(String name, int capacity, int currentAttendance, int numberOfShowerRooms, double volume, int maxNumberOfParticipants, boolean springboardJumping, boolean artisticSwimming, boolean complexSwimming) {
    super(name, capacity, currentAttendance);
    this.numberOfShowerRooms=numberOfShowerRooms;
    this.volume=volume;
    this.maxNumberOfParticipants=maxNumberOfParticipants;
    this.springboardJumping=springboardJumping;
    this.artisticSwimming=artisticSwimming;
    this.complexSwimming=complexSwimming;
    }

    @Override
    public void getSupportedSports() {
        System.out.println("What types of sports can be played at this sports complex:");
        if(springboardJumping==true)
            System.out.println("Springboard jumping");
        if(artisticSwimming==true)
            System.out.println("Artistic swimming");
        if(complexSwimming==true)
            System.out.println("Complex swimming");
    }
}
