import Model.FrontierBFS;
import Model.FrontierDFS;
import Model.FrontierLCFS;

public class Main {

    public static void main(String[] args) {

        System.out.println("----- Starting DFS search -----");
        new GraphSolver(new FrontierDFS());
        System.out.println("");

        System.out.println("----- Starting BFS search -----");
        new GraphSolver(new FrontierBFS());

        System.out.println("----- Starting LCFS search -----");
        new GraphSolver(new FrontierLCFS());
    }
}