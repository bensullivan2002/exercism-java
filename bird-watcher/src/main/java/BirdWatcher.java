
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int day : birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int firstNDaysCount =  0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            firstNDaysCount = firstNDaysCount + birdsPerDay[i];
        }
        return firstNDaysCount;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;
        for (int day : birdsPerDay) {
            if (day >= 5) {
                busyDaysCount++;
            }
        }
        return busyDaysCount;
    }
}
