# Heart Rate Telemetry Replay

A Java command-line tool that summarizes simulated heart-rate readings for my ESP32 heart-rate monitor project. The included sample data lets you run the demo without an ESP32 or a pulse sensor.

## Run the demo

With JDK 19 installed, run these commands from the repository root:

```bash
javac -d out src/*.java
java -cp out Main
```

The program reads `readings.csv` from the repository root. The CSV has a `timestamp,bpm` header, followed by one reading per line.

## Sample result

The included CSV contains readings of 76, 80, and 84 BPM, plus one row with `abc` in the BPM column to demonstrate how the program handles invalid input.

```text
Valid readings: 3
Skipped rows: 1
Average BPM: 80.0
```

## Tests

`test/SessionAnalyzerTest.java` contains two JUnit 5 tests. One checks the average of three readings, and the other checks that a fractional average retains its decimal part.

## Related project

[ESP32 Heart Rate Monitor](https://github.com/parsons-may/Heart-Rate-Monitor)