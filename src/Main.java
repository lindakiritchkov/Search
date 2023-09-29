import Model.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("----- Starting DFS search -----");
        new GraphSolver(new FrontierDFS());
        System.out.println("");

        System.out.println("----- Starting BFS search -----");
        new GraphSolver(new FrontierBFS());
        System.out.println("");

        System.out.println("----- Starting LCFS search -----");
        new GraphSolver(new FrontierLCFS());
        System.out.println("");

        System.out.println("----- Starting Best-First search -----");
        new GraphSolver(new FrontierBestFS());
        System.out.println("");

        System.out.println("----- Starting A* search -----");
        new GraphSolver(new FrontierAStar());
        System.out.println("");
    }
}