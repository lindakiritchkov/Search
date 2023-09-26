package Model;

import java.util.ArrayList;
import java.util.LinkedList;

public class FrontierBFS extends Frontier {

    public LinkedList<ArrayList<Node>> frontier;

    public FrontierBFS() {
        frontier = new LinkedList<>();
    }

    @Override
    public boolean isEmpty() {
        return frontier.isEmpty();
    }

    @Override
    public void addToFrontier(ArrayList<Node> path) {
        frontier.add(path);
    }

    @Override
    public ArrayList<Node> removeFromFrontier() {
        ArrayList<Node> path = frontier.remove();
        return path;
    }
}
