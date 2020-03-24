package io.dcmf.timeunit;

public class HourTimeUnit extends AbstractTimeUnit {
    public HourTimeUnit() {
    }

    public void setTimeValue(int seconds) {
        int timeUnitStep = 60 * 60;
        super.timeUnitValue = seconds / timeUnitStep;
        super.remainingSeconds = seconds % timeUnitStep;
    }

    public String getConverterTimeUnit() {
        return timeUnitValue + " hour" + (timeUnitValue > 1 ? "s" : "");
    }
}