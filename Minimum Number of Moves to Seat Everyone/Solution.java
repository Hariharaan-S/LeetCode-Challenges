import java.util.Arrays;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int r = 0;
        for(int i=0;i<seats.length;i++){
            r += Math.abs(seats[i] - students[i]);
        }

        return r;
    }
}