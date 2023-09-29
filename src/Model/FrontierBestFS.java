package Model;

import java.util.ArrayList;
import java.util.TreeMap;

public class FrontierBestFS extends Frontier {

    public TreeMap<Integer,ArrayList<Node>> frontier;

    public Graph graph;

    public FrontierBestFS() {
        frontier = new TreeMap<>();
        graph = new Graph();
    }

    @Override
    public boolean isEmpty() {
        return frontier.isEmpty();
    }

    @Override
    public void addToFrontier(ArrayList<Node> path) {
        // get the h-value
        int hValue = getHValueOfPath(path);
        // add <K,V> pair to the frontier based on K
        frontier.put(hValue, path);
    }

    private int getHValueOfPath(ArrayList<Node> path) {
        Node node = path.get(path.size() - 1);
        return node.getHeuristicValue();
    }

    @Override
    public ArrayList<Node> removeFromFrontier() {
        int key = frontier.firstKey();
        ArrayList<Node> path = frontier.remove(key);
        return path;
    }
}
