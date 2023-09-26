package Model;

import java.util.ArrayList;

public abstract class Frontier {
    
    public abstract boolean isEmpty();
    public abstract void addToFrontier(ArrayList<Node> path);
    public abstract ArrayList<Node> removeFromFrontier();
}
