package String;

import java.util.HashMap;

public class Test {

    public static void printMap(HashMap<Integer,Integer> map){

        for (int key: map.keySet()
             ) {
            System.out.println(map.get(key));
        }

    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        map1.put(1,2);
        map1.put(2,4);
        map1.put(3,6);
        Test.printMap(map1);
    }
}
