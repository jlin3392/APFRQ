public class StepTracker {

    private int activeMin;
    private int numDays;
    private int activeDays;
    private int totalSteps;

    public StepTracker(int minSteps) {
        activeMin = minSteps;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        if (steps > activeMin) {
            activeDays++;
        }
        numDays++;
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (numDays == 0) {
            return 0.0;
        } else {
            return (double)(totalSteps/numDays);
        }
    }

}
