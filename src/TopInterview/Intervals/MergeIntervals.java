package TopInterview.Intervals;

import java.util.Arrays;
import java.util.LinkedList;

//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // 1st step would be to sort the intervals based on the first element in each interval
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        // Creating the output array using a linkedlist, would be easier to get the last element and dynamically increase the size of the 2d array
        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval: intervals
             ) {
            if(merged.isEmpty() || merged.getLast()[1] < interval[0])
                merged.add(interval);
            else
                merged.getLast()[1] = Math.max(merged.getLast()[1],interval[1]);

        }

        return merged.toArray(new int[merged.size()][]);
    }

}
