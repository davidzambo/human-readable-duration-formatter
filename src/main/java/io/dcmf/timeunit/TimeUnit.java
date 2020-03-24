package io.dcmf.timeunit;

public interface TimeUnit {

    void setTimeValue(int seconds);

    String getConverterTimeUnit();

    boolean hasRemainingSeconds();

    int getRemainingSeconds();

    int getTimeUnitValue();
}
