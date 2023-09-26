package Model;

public class Node {

    public int heuristicValue;
    public String label;

    public Node(String label, int heurVal) {
        this.heuristicValue = heurVal;
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public int getHeuristicValue() {
        return this.heuristicValue;
    }

    @Override
    public boolean equals(Object obj) {
        Node o = (Node) obj;
        String oLabel = o.getLabel();

        return oLabel.equals(this.label);
    }
}
