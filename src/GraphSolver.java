import Model.Frontier;
import Model.Graph;
import Model.Node;

import java.util.ArrayList;

public class GraphSolver {

    public Graph graph;
    public Frontier frontier;

    public GraphSolver(Frontier frontier) {
        graph = new Graph();
        this.frontier = frontier;

        ArrayList<Node> solutionPath = search(graph, graph.S);
        System.out.println("");

        if (solutionPath.isEmpty()) {
            System.out.println("No solution found.");
        }

        String pathToPrint = "";
        for (int i = 0; i < solutionPath.size(); i++) {
            Node node = solutionPath.get(i);
            pathToPrint = pathToPrint.concat(node.getLabel());
        }

        System.out.println("Solution found: " + pathToPrint);
    }


    public ArrayList<Node> search(Graph graph, Node start) {
        ArrayList<Node> startPath = new ArrayList<>();
        startPath.add(start);

        frontier.addToFrontier(startPath);

        System.out.print("Expanded Nodes: ");
        while (!frontier.isEmpty()) {
            ArrayList<Node> pathToCheck = frontier.removeFromFrontier();
            Node nk = pathToCheck.get(pathToCheck.size() - 1);

            if (goal(nk)) {
                return pathToCheck;
            } else {
                for (int i = 0; i < 10; i ++) {
                    if (graph.edgeMatrix[graph.nodes.indexOf(nk)][i] != 99) {
                        ArrayList<Node> neighborPath = clone(pathToCheck);
                        neighborPath.add(graph.nodes.get(i));
                        frontier.addToFrontier(neighborPath);
                    }
                }
            }
        }

        return new ArrayList<>();
    }

    public boolean goal(Node node) {
        String label = node.getLabel();
        System.out.print(label);
        return label.equals("Z");
    }

    public ArrayList<Node> clone(ArrayList<Node> nodes) {
        ArrayList<Node> clonedList = new ArrayList<>();
        for (Node node : nodes) {
            Node newNode = new Node(node.getLabel(), node.getHeuristicValue());
            clonedList.add(newNode);
        }
        return clonedList;
    }
}
