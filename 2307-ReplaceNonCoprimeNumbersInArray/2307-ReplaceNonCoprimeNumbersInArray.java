// Last updated: 9/21/2025, 7:55:41 PM
import java.util.*;

class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return (int)((long) a * b / gcd(a, b));
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            stack.push(num);

            while (stack.size() >= 2) {
                int top = stack.pop();
                int next = stack.pop();

                int currentGcd = gcd(top, next);

                if (currentGcd == 1) {
                    stack.push(next);
                    stack.push(top);
                    break;
                } else {
                    int merged = lcm(top, next);
                    stack.push(merged);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        Collections.reverse(result);

        return result;
    }
}