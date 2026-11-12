import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        SessionAnalyzer sessionAnalyzer = new SessionAnalyzer();

        List<String> lines = Files.readAllLines(Path.of("readings.csv"));

        for(int i=1; i<lines.size(); i++) {
            String row = lines.get(i);
            String[] parts = row.split(",");
            int bpm = Integer.parseInt(parts[1]);
            Reading firstReading = new Reading(parts[0], bpm);
            sessionAnalyzer.addReading(firstReading);
            System.out.println(firstReading.getBpm());
        }
        System.out.println(sessionAnalyzer.averageBPM());
    }
}
