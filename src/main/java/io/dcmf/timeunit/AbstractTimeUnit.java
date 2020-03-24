package io.dcmf.timeunit;

public abstract class AbstractTimeUnit implements TimeUnit {
    protected int timeUnitValue;
    protected int remainingSeconds;

    public AbstractTimeUnit() {
    }

    public int getRemainingSeconds() {
        return remainingSeconds;
    }

    public boolean hasRemainingSeconds() {
        return remainingSeconds > 0;
    }

    public int getTimeUnitValue() {
        return this.timeUnitValue;
    }

    public abstract void setTimeValue(int seconds);

    public abstract String getConverterTimeUnit();
}
