package Model;

import java.util.ArrayList;

public class Graph {

    public int[][] edgeMatrix;
    public ArrayList<Node> nodes;
    public Node S;
    public Node A;
    public Node B;
    public Node C;
    public Node D;
    public Node E;
    public Node F;
    public Node G;
    public Node H;
    public Node Z;

    public Graph() {
        S = new Node("S", 24);
        A = new Node("A", 21);
        B = new Node("B", 19);
        C = new Node("C", 19);
        D = new Node("D", 9);
        E = new Node("E", 11);
        F = new Node("F", 12);
        G = new Node("G", 4);
        H = new Node("H", 6);
        Z = new Node("Z", 0);

        nodes = new ArrayList<>();
        nodes.add(S);
        nodes.add(A);
        nodes.add(B);
        nodes.add(C);
        nodes.add(D);
        nodes.add(E);
        nodes.add(F);
        nodes.add(G);
        nodes.add(H);
        nodes.add(Z);


        edgeMatrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                edgeMatrix[i][j] = 99;
            }
        }

        edgeMatrix[0][1] = 3; // SA
        edgeMatrix[0][2] = 9; // SB
        edgeMatrix[0][3] = 4; // SC

        edgeMatrix[1][3] = 2;  // AC
        edgeMatrix[2][3] = 13; // BC

        edgeMatrix[3][4] = 5; // CD
        edgeMatrix[3][5] = 4; // CE
        edgeMatrix[3][6] = 8; // CF

        edgeMatrix[4][6] = 5; // DF
        edgeMatrix[5][6] = 7; // EF

        edgeMatrix[6][7] = 8;  // FG
        edgeMatrix[6][8] = 7;  // FH
        edgeMatrix[6][9] = 18; // FZ

        edgeMatrix[7][9] = 9; // GZ
        edgeMatrix[8][9] = 6; // HZ
    }
}
