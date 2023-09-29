package Model;

import java.util.ArrayList;
import java.util.TreeMap;

public class FrontierAStar extends Frontier {

    public TreeMap<Integer,ArrayList<Node>> frontier;
    public Graph graph;

    public FrontierAStar() {
        frontier = new TreeMap<>();
        graph = new Graph();
    }

    @Override
    public boolean isEmpty() {
        return frontier.isEmpty();
    }

    @Override
    public void addToFrontier(ArrayList<Node> path) {
        // find the f-value
        int fValue = getFValueOfPath(path);
        // add <K,V> pair to the frontier based on K
        frontier.put(fValue, path);
    }

    private int getFValueOfPath(ArrayList<Node> path) {
        // find f-value of given path
        int result = 0;
        for (int i = 0; i < path.size() - 1; i++) {
            // find the cost of the traversed path (all but the last node) so far
            Node a = path.get(i);
            int indexA = graph.nodes.indexOf(a);
            Node b = path.get(i+1);
            int indexB = graph.nodes.indexOf(b);

            int costAB = graph.edgeMatrix[indexA][indexB];
            result += costAB;
        }

        // add heuristic value of next node to visit
        Node nextNode = path.get(path.size() - 1);
        result += nextNode.getHeuristicValue();

        return result;
    }

    @Override
    public ArrayList<Node> removeFromFrontier() {
        int key = frontier.firstKey();
        ArrayList<Node> path = frontier.remove(key);
        return path;
    }
}


