import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        SessionAnalyzer sessionAnalyzer = new SessionAnalyzer();

        List<String> lines = Files.readAllLines(Path.of("readings.csv"));
        int skippedRows =0;
        int validReadings =0;
        for(int i=1; i<lines.size(); i++) {
            String row = lines.get(i);
            String[] parts = row.split(",");
            if(parts.length !=2) {
                skippedRows++;
                continue;
            }
            int bpm = Integer.parseInt(parts[1]);
            Reading firstReading = new Reading(parts[0], bpm);
            sessionAnalyzer.addReading(firstReading);
            validReadings++;

            System.out.println(firstReading.getBpm());
        }
        System.out.println(sessionAnalyzer.averageBPM());
        System.out.println("Skipped rows: " + skippedRows);
        System.out.println("Valid readings: " + validReadings);
    }
}
