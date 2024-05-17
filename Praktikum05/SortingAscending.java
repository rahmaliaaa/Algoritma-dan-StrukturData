package Praktikum05;
public class SortingAscending {
    public static void sequentialSearch(int[] arr,int key){
        for (int i =0; i < arr.length; i++){
            if (arr[i] < key ){ //modifikasi perubahan tanda dari lebih dari menjadi kurang dari 
                System.out.println("Data tidak ditemukan");
                return;
            }else if (arr[i] == key){
                System.out.println("Data ditemukan pada indeks ke- " + i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] daftarNilai = {10, 5, 20, 15, 5, 45};
        sequentialSearch(daftarNilai, 20);
    }
}
