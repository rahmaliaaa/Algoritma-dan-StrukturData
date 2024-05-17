package Praktikum06;

public class Search {
    public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
    
        while (low <= high) {
        int mid = low + (high - low) / 2;
    
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {78, 13, 24, 9, 30, 22, 41};
    
        int target1 = 41;
        int target2 = 9;
    
        int index1 = sequentialSearch(arr, target1);
        int index2 = binarySearch(arr, target2);
    
        if (index1 != -1) {
        System.out.println("Nilai " + target1 + " ditemukan pada indeks " + index1 + " menggunakan sequential search");
        } else {
        System.out.println("Nilai " + target1 + " tidak ditemukan menggunakan sequential search");
        }
        if (index2 != -1) {
        System.out.println("Nilai " + target2 + " ditemukan pada indeks " + index2 + " menggunakan binary search");
        } else {
        System.out.println("Nilai " + target2 + " tidak ditemukan menggunakan binary search");
        }
    }
}
