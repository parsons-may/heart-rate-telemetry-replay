public class Reading {
    String timestamp;
    int bpm;

    public Reading(String timestamp, int bpm) {
        this.timestamp= timestamp;
        this.bpm = bpm;
    }

    private String getTimeStamp() {
        return timestamp;
    }

    public int getBpm() {
        return bpm;
    }
}
