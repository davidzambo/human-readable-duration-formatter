package io.dcmf.timeunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondTimeUnitTest {

    SecondTimeUnit timeUnit;
    private static final int TIME_UNIT_STEP = 1;

    @BeforeEach
    void setUp() {
        this.timeUnit = new SecondTimeUnit();
    }

    @Test
    void initialRemainingSecondTest() {
        assertEquals(this.timeUnit.getRemainingSeconds(), 0);
    }

    @Test
    void initialTimeUnitValueTest() {
        assertEquals(this.timeUnit.getTimeUnitValue(), 0);
    }

    @Test
    void setTimeUnitWithEqualTimeValueTest() {
        this.timeUnit.setTimeValue(TIME_UNIT_STEP);
        assertEquals(this.timeUnit.getTimeUnitValue(), 1);
        assertEquals(this.timeUnit.getRemainingSeconds(), 0);
    }

    @Test
    void setTimeUnitTestWithMoreTimeValue() {
        this.timeUnit.setTimeValue(TIME_UNIT_STEP + 1);
        assertEquals(this.timeUnit.getTimeUnitValue(), 2);
        assertEquals(this.timeUnit.getRemainingSeconds(), 0);
    }

    @Test
    void getConvertedTimeUnitWithOneValue() {
        this.timeUnit.setTimeValue(TIME_UNIT_STEP);
        assertEquals(this.timeUnit.getConverterTimeUnit(), "1 second");
    }

    @Test
    void getConvertedTimeUnitWithMultipleValue() {
        this.timeUnit.setTimeValue(TIME_UNIT_STEP * 2);
        assertEquals(this.timeUnit.getConverterTimeUnit(), "2 seconds");
    }

    @Test
    void getConvertedTimeUnitWithLessThanOneValue() {
        this.timeUnit.setTimeValue(0);
        assertEquals(this.timeUnit.getConverterTimeUnit(), "0 second");
    }

}