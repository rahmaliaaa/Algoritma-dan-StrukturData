package Praktikum13;

public class Graph {
    public int numVertices;
    public int adjMatrix[][];
    public int weight;

    public Graph(int numVertices){
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }
    public void addEdge(int i, int j, int weight){ //modifikasi 3
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices){ //modifikasi1
            adjMatrix[i][j] = weight;
            adjMatrix[j][i] = weight; //modifikasi 3
        }
    }
    public void removeEdge(int i,  int j){
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices){ //modifikasi1
            adjMatrix[i][j] = 0;
            adjMatrix[j][i] = 0; //sebaliknya (modifikasi 2)
        }
    }
    public void print(){
        for (int i = 0; i < numVertices; i++){
            System.out.print(i + ": ");

           for (int j = 0; j < numVertices; j++) {
            System.out.print(adjMatrix[i][j] + " ");
           }
            System.out.println();
        }
    }
    public int getEdge(int i, int j){
        if (i < numVertices && j >= 0 && j < numVertices){
            return adjMatrix[i][j];
        }
        return 0;
    }
    public int getDegree(int vertex){ //modifikasi nomor 5
        int degree = 0;
        if (vertex < numVertices){
            for (int j = 0; j < numVertices; j++){
                if (adjMatrix[vertex][j] != 0){
                    degree++;
                }
            }
        }
        return degree;
    }
    public void printGetDegree() { //   modifikasi nomor 
        for ( int i = 0; i < numVertices; i++){
            System.out.println("Degree dari vertex " + i + ": " + getDegree(i));
        }
    }
}
