package Praktikum13;

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1, 2);
        g.addEdge(0, 2, 4);
        g.addEdge(1, 2, 1);
        g.addEdge(2, 0, 6);
        g.addEdge(2, 3, 7);
        g.addEdge(6, 7, 2); //modifikasi
        g.print();

        System.out.println("Edge antara V1 dan V2 :" + g.getEdge(1 , 2));
        System.out.println("Edge antara V3 dan V2 :" + g.getEdge(3 , 2));
        g.printGetDegree();
    }
}