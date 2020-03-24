package io.dcmf.timeunit;

public class DayTimeUnit extends AbstractTimeUnit {
    public DayTimeUnit() {
    }

    public void setTimeValue(int seconds) {
        int timeUnitStep = 60 * 60 * 24;
        super.timeUnitValue = seconds / timeUnitStep;
        super.remainingSeconds = seconds % timeUnitStep;
    }

    public String getConverterTimeUnit() {
        return timeUnitValue + " day" + (timeUnitValue > 1 ? "s" : "");
    }
}
