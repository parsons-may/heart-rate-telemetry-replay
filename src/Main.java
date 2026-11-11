public class Main {
    public static void main(String[] args) {
        Reading reading = new Reading("2026-11-08T14:30:00", 76);
        Reading reading2 = new Reading("2026-11-08T14:30:00", 78);
        SessionAnalyzer sessionAnalyzer = new SessionAnalyzer();
        sessionAnalyzer.addReading(reading);
        sessionAnalyzer.addReading(reading2);
        System.out.println(reading.bpm);
        System.out.println(sessionAnalyzer.averageBPM());
    }
}
