package Model;

import java.util.ArrayList;
import java.util.Stack;

public class FrontierDFS extends Frontier {

    public Stack<ArrayList<Node>> frontier;
    public FrontierDFS() {
        frontier = new Stack<>();
    }

    @Override
    public boolean isEmpty() {
        return frontier.isEmpty();
    }

    @Override
    public void addToFrontier(ArrayList<Node> path) {
        frontier.push(path);
    }

    @Override
    public ArrayList<Node> removeFromFrontier() {
        ArrayList<Node> path = frontier.pop();
        return path;
    }
}
