
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       int[] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int count:this.birdsPerDay)
            {
                if(count == 0) return true;
            }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if(numberOfDays>7) numberOfDays = 7;
        for(int i=0;i < numberOfDays;i++)
            {
                count += this.birdsPerDay[i];
            }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int birds:this.birdsPerDay)
            {
                if(birds > 4) count += 1;
            }
        return count;
    }
}
