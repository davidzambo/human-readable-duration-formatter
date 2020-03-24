package io.dcmf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeUnitFormatterTest {
    public static final int SECOND = 1;
    public static final int MINUTE = SECOND * 60;
    public static final int HOUR = MINUTE * 60;
    public static final int DAY = HOUR * 24;
    public static final int YEAR = DAY * 365;

    @Test
    void case1Second() {
        assertEquals("1 second", TimeUnitFormatter.formatDuration(SECOND));
    }

    @Test
    void case20Seconds() {
        assertEquals("20 seconds", TimeUnitFormatter.formatDuration(20 * SECOND));
    }


    @Test
    void case1Minute() {
        assertEquals("1 minute", TimeUnitFormatter.formatDuration(60 * SECOND));
    }

    @Test
    void case1Minute1Second() {
        assertEquals("1 minute and 1 second", TimeUnitFormatter.formatDuration(MINUTE + SECOND));
    }

    @Test
    void case1Minute2Seconds() {
        assertEquals("1 minute and 2 seconds", TimeUnitFormatter.formatDuration(MINUTE + SECOND * 2));
    }

    @Test
    void case2Minutes() {
        assertEquals("2 minutes", TimeUnitFormatter.formatDuration(2 * MINUTE));
    }

    @Test
    void case2Minutes1Second() {
        assertEquals("2 minutes and 1 second", TimeUnitFormatter.formatDuration(2 * MINUTE + SECOND));
    }

    @Test
    void case2Minutes2Seconds() {
        assertEquals("2 minutes and 2 seconds", TimeUnitFormatter.formatDuration(2 * MINUTE + 2 * SECOND));
    }

    @Test
    void case1Hour() {
        assertEquals("1 hour", TimeUnitFormatter.formatDuration(60 * MINUTE));
    }

    @Test
    void case1Hour1Second() {
        assertEquals("1 hour and 1 second", TimeUnitFormatter.formatDuration(HOUR + SECOND));
    }

    @Test
    void case1Hour2Seconds() {
        assertEquals("1 hour and 2 seconds", TimeUnitFormatter.formatDuration(HOUR + 2 * SECOND));
    }

    @Test
    void case1Hour1Minute() {
        assertEquals("1 hour and 1 minute", TimeUnitFormatter.formatDuration(HOUR + MINUTE));
    }

    @Test
    void case1Hour2Minutes() {
        assertEquals("1 hour and 2 minutes", TimeUnitFormatter.formatDuration(HOUR + 2 * MINUTE));
    }

    @Test
    void case1Hour2Minutes1Second() {
        assertEquals("1 hour, 2 minutes and 1 second", TimeUnitFormatter.formatDuration(HOUR + 2 * MINUTE + SECOND));
    }

    @Test
    void case1Hour2Minutes2Seconds() {
        assertEquals("1 hour, 2 minutes and 2 seconds", TimeUnitFormatter.formatDuration(HOUR + 2 * MINUTE + 2 * SECOND));
    }

    @Test
    void case1Day() {
        assertEquals("1 day", TimeUnitFormatter.formatDuration(24 * HOUR));
    }

    @Test
    void case1Day1Second() {
        assertEquals("1 day and 1 second", TimeUnitFormatter.formatDuration(24 * HOUR + SECOND));
    }

    @Test
    void case1Day2Seconds() {
        assertEquals("1 day and 2 seconds", TimeUnitFormatter.formatDuration(24 * HOUR + 2 * SECOND));
    }

    @Test
    void case1Day1Minute() {
        assertEquals("1 day and 1 minute", TimeUnitFormatter.formatDuration(24 * HOUR + MINUTE));
    }

    @Test
    void case1Day2Minutes() {
        assertEquals("1 day and 2 minutes", TimeUnitFormatter.formatDuration(24 * HOUR + 2 * MINUTE));
    }

    @Test
    void case1Day2Minutes1Second() {
        assertEquals(
                "1 day, 2 minutes and 1 second",
                TimeUnitFormatter.formatDuration(24 * HOUR + 2 * MINUTE + SECOND)
        );
    }

    @Test
    void case1Day2Minutes2Seconds() {
        assertEquals(
                "1 day, 2 minutes and 2 seconds",
                TimeUnitFormatter.formatDuration(24 * HOUR + 2 * MINUTE + 2 * SECOND)
        );
    }

    @Test
    void case1Day3Minutes() {
        assertEquals(
                "1 day and 3 minutes",
                TimeUnitFormatter.formatDuration(24 * HOUR + 2 * MINUTE + 60 * SECOND)
        );
    }

    @Test
    void case2Days3Minutes() {
        assertEquals(
                "2 days and 3 minutes",
                TimeUnitFormatter.formatDuration(2 * DAY + 2 * MINUTE + 60 * SECOND)
        );
    }

    @Test
    void case1year() {
        assertEquals(
                "1 year",
                TimeUnitFormatter.formatDuration(YEAR)
        );
    }
}