// Geek is a software engineer. He is assigned with the task of calculating average waiting time of all the processes by following shortest job first policy.
// The shortest job first (SJF) or shortest job next, is a scheduling policy that selects the waiting process with the smallest execution time to execute next.
// Given an array of integers bt of size n. Array bt denotes the burst time of each process. Calculate the average waiting time of all the processes and return the nearest integer which is smaller or equal to the output.
// Note: Consider all process are available at time 0.
// Example 1:
// Input:
// n = 5
// bt = [4,3,7,1,2]
// Output: 4
// Explanation: After sorting burst times by shortest job policy, calculated average waiting time is 4.
// Example 2:
// Input:
// n = 4
// arr = [1,2,3,4]
// Output: 2
// Explanation: After sorting burst times by shortest job policy, calculated average waiting time is 2.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function solve() which takes bt[] as input parameter and returns the average waiting time of all the processes.

//(imp) WT = WT+Burst time , avg WT = (1+2+...+WTn)/no of elem
import java.util.Arrays;

public class SortestJobFirst {
    public static int solve(int bt[] ) {
        // code here
        Arrays.sort(bt);
        int totalWT = 0;
        int wt = 0;
        int noElem = bt.length;
        // len-1 bcz last Bt not added to wt as we start the wt = 0 for 1st BT elem
        for (int i = 0; i < bt.length-1; i++) {
            wt += bt[i];
            totalWT += wt;
        }
        // System.out.println(noElem);
        // System.out.println(totalWT);
        return totalWT/noElem;
      }

      public static void main(String[] args) {
        int sjf[] = {4,3,7,1,2};
        System.out.println("Avg Wating Time : "+solve(sjf));
      }
}
