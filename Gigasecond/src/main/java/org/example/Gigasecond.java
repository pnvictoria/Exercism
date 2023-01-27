package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private final LocalDateTime now;
    private final long GIGASECOND = 1_000_000_000L;

    public Gigasecond(LocalDate birthDate) {
        this.now = birthDate.atStartOfDay();
    }
    public Gigasecond(LocalDateTime birthDateTime) {
        this.now = birthDateTime;
    }
    public LocalDateTime getDateTime() {
        return now.plusSeconds(GIGASECOND);
    }
}
