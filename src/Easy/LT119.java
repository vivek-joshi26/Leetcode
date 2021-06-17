//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
package Easy;

import java.util.ArrayList;
import java.util.List;

public class LT119 {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int i = 1; i < rowIndex + 1; i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i-1);
            row.add(1);
            for (int j = 1; j < i; j++){
                row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }

    public static void main(String[] args) {
        LT119 obj = new LT119();
        System.out.println(obj.getRow(4));
    }
}
