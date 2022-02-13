package Adobe.SortingSearching;

//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MergeIntervals {



    //int[][]

    public int[][] merge(int[][] intervals) {

        for (int[] interval: intervals
             ) {
            for (int num: interval
                 ) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval: intervals
             ) {
            if( merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }

        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals obj1 = new MergeIntervals();
        int[][] intervals = new int[4][2];
        intervals[0][0] = 2;
        intervals[0][1] = 9;
        intervals[1][0] = 1;
        intervals[1][1] = 3;
        intervals[2][0] = 8;
        intervals[2][1] = 10;
        intervals[3][0] = 9;
        intervals[3][1] = 18;

        obj1.merge(intervals);
    }

}
