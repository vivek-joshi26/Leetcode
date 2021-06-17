//Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
/*
1
1   1
1   2   1
1   3   3   1
1   4   6   4   1
 */
package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LT118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        //Initially add [1]
        triangle.get(0).add(1);

        // outer loop for maintaining the rowcount
        for (int i = 1; i < numRows; i++){
            // create a new list
            List<Integer> row = new ArrayList<>();
            // get the list of previous row
            List<Integer> prevRow = triangle.get(i-1);
            // add 1 at the start of new row
            row.add(1);

            // loop for getting the inner values of individual rows
            for (int j = 1; j < i ; j++){
                // get the data from previous row, we need some of the element from same index and same index -1, ex for value of 3 rows 3 element we need, 2 rows 2 and 3 element
                row.add(prevRow.get(j-1)    +   prevRow.get(j));
            }

            // add 1 at the end of row
            row.add(1);
            //add list to the outer list
            triangle.add(row);
        }


        //System.out.println(triangle);
        return triangle;
    }

    public static void main(String[] args) {
        LT118 obj = new LT118();
        obj.generate(5);

    }
}
