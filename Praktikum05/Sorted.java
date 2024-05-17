package Praktikum05;

public class Sorted {
    public static int sequentialSearch(int[] arr, int key) {
        int cariIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                cariIndex = i;
                break;
            }
        }
        return cariIndex; // Mengembalikan nilai indeks 
    }
    public static void main(String[] args) {
        int[] daftarNilai = {10, 5, 20, 15, 80, 45};
        int hasilPencarian = sequentialSearch(daftarNilai, 5);
        if (hasilPencarian != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + hasilPencarian);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
