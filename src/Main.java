import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reading reading = new Reading("2026-11-08T14:30:00", 76);
        Reading reading2 = new Reading("2026-11-08T14:30:00", 78);
        SessionAnalyzer sessionAnalyzer = new SessionAnalyzer();
        sessionAnalyzer.addReading(reading);
        sessionAnalyzer.addReading(reading2);
        System.out.println(reading.bpm);
        System.out.println(sessionAnalyzer.averageBPM());

        List<String> lines = Files.readAllLines(Path.of("readings.csv"));

        for (String line: lines) {
            System.out.println(line);
        }
        String row = lines.get(1);
        String[] parts = row.split(",");

        int bpm = Integer.parseInt(parts[1]);

        Reading firstReading = new Reading(parts[0], bpm);
        System.out.println(firstReading.getBpm());
    }
}
