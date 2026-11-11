import java.util.ArrayList;

public class SessionAnalyzer {
    private ArrayList<Reading> readings = new ArrayList<>();

    public void addReading(Reading reading) {
        readings.add(reading);
    }

    public double averageBPM() {
        double average =0;
        double total =0;
        for(Reading reading: readings) {
           total+=  reading.getBpm();
        }
        average = total / readings.size();
        return  average;
    }
}
