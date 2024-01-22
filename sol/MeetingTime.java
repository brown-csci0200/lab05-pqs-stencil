package sol;

/**
 * A class representing a meeting time
 */
public class MeetingTime {
    private DayOfWeek dayOfWeek;
    private int startTime;

    /**
     * A constructor for meeting time.
     *
     * @param dayOfWeek the day of the week
     * @param startTime the hour that the meeting starts, in 24 hour time
     */
    public MeetingTime(DayOfWeek dayOfWeek, int startTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return this.dayOfWeek + " at " + this.startTime;
    }

}