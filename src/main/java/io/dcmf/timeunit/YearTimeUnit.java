package io.dcmf.timeunit;

public class YearTimeUnit extends AbstractTimeUnit {
    public YearTimeUnit() {
    }

    public void setTimeValue(int seconds) {
        int timeUnitStep = 60 * 60 * 24 * 365;
        super.timeUnitValue = seconds / timeUnitStep;
        super.remainingSeconds = seconds % timeUnitStep;
    }

    public String getConverterTimeUnit() {
        return timeUnitValue + " year" + (timeUnitValue > 1 ? "s" : "");
    }
}
