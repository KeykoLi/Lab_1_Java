package ua.lviv.iot.algo.part1.lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StadiumWriter {

    private static FileWriter fileWriter;

    public String writeToFile(List<AbstractStadium> sportComplexes, String fileName) throws IOException {
        if( sportComplexes == null || sportComplexes.isEmpty()){
            return null;
        }
        try(FileWriter writer = new FileWriter(fileName);){
                for( var complex: sportComplexes){
                    writer.write(complex.getHeaders());
                    writer.write("\r\n");
                    writer.write(complex.toCSV());
                    writer.write("\r\n");
                }
        } catch( IOException e) {

        }return fileName;

    }

    public static void main(String ... arg) throws IOException{
       var manager = new StadiumManager();
        manager.addSportComplex(new Stadium("A", 10, 2,
                "S", "D", true, true, true, true));
        manager.addSportComplex(new SwimmingPool("Al", 4, 3,
                15, 3, 5, false, true,
                true));
        StadiumWriter writer = new StadiumWriter();
        writer.writeToFile(manager.getSportComplexes(),"expected.cvs");
    }
}