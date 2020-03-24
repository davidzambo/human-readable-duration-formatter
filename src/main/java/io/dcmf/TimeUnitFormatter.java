package io.dcmf;

import io.dcmf.timeunit.*;

import java.util.ArrayList;

public class TimeUnitFormatter {

    public TimeUnitFormatter() {
    }

    public static String formatDuration(int duration) {
        if (duration == 0) {
            return "now";
        }

        ArrayList<TimeUnit> valueableTimeUnits =
                TimeUnitFormatter.calculateTimeUnits(duration, TimeUnitFormatter.populateTimeUnits());

        StringBuilder sb = new StringBuilder();
        String postFix;

        for (int i = 0; i < valueableTimeUnits.size(); i++) {
            postFix = TimeUnitFormatter.getPostfix(i, valueableTimeUnits.size());

            sb.append(valueableTimeUnits.get(i).getConverterTimeUnit());

            if (postFix != null) {
                sb.append(postFix);
            }
        }
        return sb.toString();
    }

    private static String getPostfix(int counter, int elemCount) {
        if (counter < elemCount - 2) {
            return ", ";
        }

        if (counter == elemCount - 2) {
            return " and ";
        }

        return null;
    }

    private static ArrayList<TimeUnit> populateTimeUnits() {
        ArrayList<TimeUnit> timeUnits = new ArrayList<TimeUnit>();
        timeUnits.add(new YearTimeUnit());
        timeUnits.add(new DayTimeUnit());
        timeUnits.add(new HourTimeUnit());
        timeUnits.add(new MinuteTimeUnit());
        timeUnits.add(new SecondTimeUnit());
        return timeUnits;
    }

    private static ArrayList<TimeUnit> calculateTimeUnits(int duration, ArrayList<TimeUnit> timeUnits) {
        ArrayList<TimeUnit> valueableTimeUnits = new ArrayList<TimeUnit>();
        int remainingSeconds = duration;

        for (TimeUnit timeUnit : timeUnits) {
            timeUnit.setTimeValue(remainingSeconds);

            if (timeUnit.getTimeUnitValue() > 0) {
                valueableTimeUnits.add(timeUnit);
            }

            remainingSeconds = timeUnit.getRemainingSeconds();
            if (!timeUnit.hasRemainingSeconds()) {
                break;
            }
        }

        return valueableTimeUnits;
    }
}
