package TopInterview.Intervals;

import java.util.Arrays;
import java.util.LinkedList;

public class MeetingRooms {

    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval:intervals
             ) {
            if(merged.isEmpty())
                merged.add(interval);
            else if(merged.getLast()[1] > interval[0])
                return false;
            else merged.getLast()[1] = Math.max(merged.getLast()[1],interval[1]);
        }
        return true;
    }

}
