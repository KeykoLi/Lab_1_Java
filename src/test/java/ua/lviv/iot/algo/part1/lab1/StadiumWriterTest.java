package ua.lviv.iot.algo.part1.lab1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class StadiumWriterTest {
    private StadiumWriter writer;
    private StadiumManager manager;
    private static final String RESULT_FILENAME = "result.cvs";
    private static final String EXPECTED_FILENAME = "expected.cvs";
    private static final File expected = new File (EXPECTED_FILENAME);
    private File result;

    @BeforeEach
   public void setUp() throws IOException {
        writer = new StadiumWriter();
        manager = new StadiumManager();
        manager.addSportComplex(new Stadium("A", 10, 2,
                "S", "D", true, true, true, true));
        manager.addSportComplex(new SwimmingPool("Al", 4, 3,
                15, 3, 5, false, true,
                true));
       Files.deleteIfExists(Path.of(RESULT_FILENAME));
        result = new File(RESULT_FILENAME);
    }


    @Test
    public void testExpectedWriteToFile() throws IOException {
        writer.writeToFile(manager.getSportComplexes(), RESULT_FILENAME);
        assertTrue(Files.exists(result.toPath()));
        assertEquals(Files.readAllLines(expected.toPath()),
                Files.readAllLines(result.toPath()));

    }

    @Test
    public void testEmptyWriteToFile() throws IOException{
        LinkedList<AbstractStadium> stadiumList = new LinkedList <> ();
        writer.writeToFile(stadiumList, RESULT_FILENAME);
        assertFalse(result.exists());
    }

    @Test
    public void testFileOverride() throws  IOException{
        Files.createFile(Path.of(RESULT_FILENAME));
        testExpectedWriteToFile();

    }

    @AfterAll
    public static void deleteFiles() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

}