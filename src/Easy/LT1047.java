//Remove All Adjacent Duplicates In String
//Input: s = "azxxzyz"
//Output: "ay"
package Easy;

import java.util.Stack;

public class LT1047 {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            char temp = s.charAt(i);
            char top;
            if( stack.isEmpty() != true) {
                top = stack.peek();
                if (top == temp) {
                    stack.pop();
                    continue;
                }
            }
                stack.push(temp);

        }
        String reverse = "";
        while (!stack.isEmpty()){
            reverse = stack.pop() + reverse;
        }
        return reverse;
    }

    // Stack approad using stringbuilder
    public String removeDuplicates2(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int stringBuilderLength = -1;
        for (int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(stringBuilderLength != -1 && cur == stringBuilder.charAt(stringBuilderLength)){
                stringBuilderLength--;
                stringBuilder.deleteCharAt(stringBuilderLength+1);
                continue;
            }
            else{
                stringBuilderLength++;
                stringBuilder.append(cur);
            }
        }

        return stringBuilder.toString();
    }
    // a    0   a       z   1   az      x   2   azx     x   1   az      z   0   a
    public static void main(String[] args) {
        LT1047 lt1047 = new LT1047();
        String s = "a";
        String res = lt1047.removeDuplicates2(s);
        System.out.println(res);
    }


}
