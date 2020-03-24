package io.dcmf.timeunit;

public class SecondTimeUnit extends AbstractTimeUnit {
    public SecondTimeUnit() {
    }

    public void setTimeValue(int seconds) {
        int timeUnitStep = 1;
        super.timeUnitValue = seconds / timeUnitStep;
        super.remainingSeconds = seconds % timeUnitStep;
    }

    public String getConverterTimeUnit() {
        return timeUnitValue + " second" + (timeUnitValue > 1 ? "s" : "");
    }
}
