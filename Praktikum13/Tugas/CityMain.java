package Praktikum13.Tugas;
import java.util.Scanner;

public class CityMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jumlah kota: "); //input jumlah kota
        int jumlahKota = sc.nextInt();
        sc.nextLine();

        City graph = new City(jumlahKota);
        for (int i = 0; i < jumlahKota; i++) { //input nama kota
            System.out.print("Input nama kota: ");
            String cityName = sc.nextLine();
            graph.addVertex(i, cityName);
        }
        System.out.print("Input jumlah jalan: "); //input jumlah jalan
        int jumlahJalan = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlahJalan; i++) { //input detail jalan
            System.out.print("Kota 1: ");
            String kota1 = sc.nextLine();
            System.out.print("Kota 2: ");
            String kota2 = sc.nextLine();
            System.out.print("Jarak " + kota1 + " - " + kota2 + ": ");
            int jarak = sc.nextInt();
            sc.nextLine();

            int index1 = graph.getVertexIndex(kota1);
            int index2 = graph.getVertexIndex(kota2);

            if (index1 != -1 && index2 != -1) {
                graph.addEdge(index1, index2, jarak);
            } else {
                System.out.println("Input Invalid");
                i--;
            }
        }
        graph.printGraph(); //cetak graph
        sc.close();
    }
}
