package io.dcmf.timeunit;

public class MinuteTimeUnit extends AbstractTimeUnit {
    public MinuteTimeUnit() {
    }

    public void setTimeValue(int seconds) {
        int timeUnitStep = 60;
        super.timeUnitValue = seconds / timeUnitStep;
        super.remainingSeconds = seconds % timeUnitStep;
    }

    public String getConverterTimeUnit() {
        return timeUnitValue + " minute" + (timeUnitValue > 1 ? "s" : "");
    }
}
