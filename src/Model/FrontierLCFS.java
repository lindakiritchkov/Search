package Model;

import java.util.ArrayList;
import java.util.TreeMap;

public class FrontierLCFS extends Frontier{

    public TreeMap<Integer,ArrayList<Node>> frontier;
    public Graph graph;

    public FrontierLCFS() {
        frontier = new TreeMap<>();
        graph = new Graph();
    }
    @Override
    public boolean isEmpty() {
        return frontier.isEmpty();
    }

    @Override
    public void addToFrontier(ArrayList<Node> path) {
        // find cost of path
        int cost = getCostOfPath(path);
        // add K,V pair to frontier
        frontier.put(cost, path);
    }

    private int getCostOfPath(ArrayList<Node> path) {
        int result = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            Node a = path.get(i);
            int indexA = graph.nodes.indexOf(a);
            Node b = path.get(i+1);
            int indexB = graph.nodes.indexOf(b);

            int costAB = graph.edgeMatrix[indexA][indexB];
            result += costAB;
        }
        return result;
    }

    @Override
    public ArrayList<Node> removeFromFrontier() {
        int key = frontier.firstKey();
        ArrayList<Node> path = frontier.remove(key);
        return path;
    }
}
