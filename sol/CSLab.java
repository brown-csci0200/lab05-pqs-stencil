package sol;

/**
 * A class representing a CS Lab
 */
public class CSLab {
    private int courseCode;
    private MeetingTime meetingTime;

    /**
     * The constructor for CSLab.
     *
     * @param courseCode  the number representing the course code for the CS course
     * @param meetingTime the time that the lab meets
     */
    public CSLab(int courseCode, MeetingTime meetingTime) {
        this.courseCode = courseCode;
        this.meetingTime = meetingTime;
    }

    /**
     * @return the course code
     */
    public int getCourseCode() {
        return this.courseCode;
    }

    /**
     * @return the meeting time
     */
    public MeetingTime getMeetingTime() {
        return this.meetingTime;
    }

    @Override
    public String toString() {
        return "Lab for CSCI " + this.courseCode + " scheduled for " + this.meetingTime;
    }
}
