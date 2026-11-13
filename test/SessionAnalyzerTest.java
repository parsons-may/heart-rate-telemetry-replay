import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SessionAnalyzerTest {
    @Test
    public void averageBPMTest(){
        SessionAnalyzer sessionAnalyzer = new SessionAnalyzer();
        Reading reading1 = new Reading("2026-11-08T14:30:03" ,76);
        Reading reading2 = new Reading("2026-11-08T14:30:03" ,77);
        Reading reading3 = new Reading("2026-11-08T14:30:03" ,78);
        sessionAnalyzer.addReading(reading1);
        sessionAnalyzer.addReading(reading2);
        sessionAnalyzer.addReading(reading3);

        assertEquals(77, sessionAnalyzer.averageBPM());

    }
    @Test
    public void averageBPMForTwoReadings() {
        SessionAnalyzer sessionAnalyzer2 = new SessionAnalyzer();
        Reading reading4 = new Reading("2026-11-08T14:30:03" ,76);
        Reading reading5 = new Reading("2026-11-08T14:30:03" ,77);
        sessionAnalyzer2.addReading(reading4);
        sessionAnalyzer2.addReading(reading5);

        assertEquals(76.5, sessionAnalyzer2.averageBPM());
    }
}
