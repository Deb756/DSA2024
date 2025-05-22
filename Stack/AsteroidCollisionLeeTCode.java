package Stack;

// We are given an integer array asteroids of size N representing asteroids in a row. For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are of same size, both will explode. Two asteroids moving in the same direction will never meet.
// Example 1:
// Input:
// N = 3
// asteroids[ ] = {3, 5, -3}
// Output: {3, 5}
// Explanation: The asteroid 5 and -3 collide resulting in 5. The 5 and 3 never collide.
// Example 2:
// Input:
// N = 2
// asteroids[ ] = {10, -10}
// Output: { }
// Explanation: The asteroid -10 and 10 collide exploding each other.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function asteroidCollision() which takes the array of integers asteroids and N as parameters and returns the state of asteroids after all collisions.
// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

import java.util.*;
import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Stack<Integer> st = new Stack();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                st.add(asteroids[i]);
            } else {
                int a = Math.abs(asteroids[i]);
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < a) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == a) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
            }
        }
        // System.out.println(st);
        int res[] = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}

public class AsteroidCollisionLeeTCode {
    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, 1, 2, -3, -7, 17, 15, -18, -17 };
        Solution s = new Solution();
        int arr2[] = s.asteroidCollision(arr);
        List<Integer> list = new ArrayList<>();
        for (int e : arr2) {
            list.add(e);
        }
        System.out.println(list);
    }
}
