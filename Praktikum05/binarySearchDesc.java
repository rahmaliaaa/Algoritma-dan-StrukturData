package Praktikum05;

public class binarySearchDesc {
    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearchDesc(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
      
        // Memeriksa apakah array berurutan secara menaik atau menurun
        boolean ascending = arr[start] < arr[end];      
        while (start <= end) {
            int mid = start + (end - start) / 2;
      
            if (arr[mid] == key) {
                return mid;
            }      
            if (ascending) {
                // Pencarian menaik
                if (arr[mid] < key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Pencarian menurun
                if (arr[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }      
        return -1;
    }
    public static void main(String[] args) {
        int[] daftarNilai = {10, 5, 20, 15, 5, 45};
        int indexData = sequentialSearch(daftarNilai, 10);
        if (indexData != -1){
            System.out.println("Data ditemukan pada indeks ke- " + indexData);
        } else {
            System.out.println("data tidak ditemukan");
        }
        int[] sortedNilaiAsc = { 5, 5, 10, 20, 30, 40, 50};
        int indexAsc = binarySearchDesc(sortedNilaiAsc, 10);
        if (indexAsc != -1){
            System.out.println("Data ditemukan pada indeks ke-" + indexAsc + " (ascending)");
        } else {
            System.out.println("data tidak ditemukan!");
        }
        int[] sortedNilaiDesc = {50, 40, 30, 20, 10, 5, 5};
        int indexDesc = binarySearchDesc(sortedNilaiDesc, 10);

        if (indexDesc != -1){
            System.out.println("Data ditemukan pada indeks ke=" + indexDesc + "(descending)");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }        
}
