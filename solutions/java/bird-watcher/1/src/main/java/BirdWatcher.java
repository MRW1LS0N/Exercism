import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
      return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
       
     return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
         birdsPerDay[birdsPerDay.length - 1] +=1;
     
    }

    public boolean hasDayWithoutBirds() {
       return Arrays.stream(birdsPerDay).anyMatch(x -> x == 0);
    }

   public int getCountForFirstDays(int numberOfDays) {
    int day = 0;
    if (numberOfDays > birdsPerDay.length ) {
        return Arrays.stream(birdsPerDay).sum();
    }
    for (int i = 0; i < numberOfDays; i++) {
        day += birdsPerDay[i];
    }
    return day;
}

    public int getBusyDays() {
      return (int) Arrays.stream(birdsPerDay).filter(x -> x >= 5).count();
        
    }
}
