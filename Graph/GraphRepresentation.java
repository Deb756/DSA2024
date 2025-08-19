package Graph;

import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {

        int n = 5;
        int m = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<Integer>());
        }
        // edge 1-2
        adj.get(1).add(2);
        adj.get(2).add(1);
        // edge 1-3
        adj.get(1).add(3);
        adj.get(3).add(1);
        // edge 2-4
        adj.get(2).add(4);
        adj.get(4).add(2);
        // edge 3-4
        adj.get(3).add(4);
        adj.get(4).add(3);
        // edge 2-5
        adj.get(2).add(5);
        adj.get(5).add(2);
        // edge 4-5
        adj.get(4).add(5);
        adj.get(5).add(4);

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
        }
        System.out.println();

    }

}
