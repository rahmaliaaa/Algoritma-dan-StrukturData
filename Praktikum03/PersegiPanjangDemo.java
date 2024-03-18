package Praktikum03;
import java.util.Scanner;

public class PersegiPanjangDemo {
    public int panjang;
    public int lebar;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegiPanjang =  sc.nextInt();
        int panjang, lebar;
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jumlahPersegiPanjang];

        for (int i = 0; i< jumlahPersegiPanjang; i++){
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();
        }
        for (int i = 0; i < 3; i++){ //modifikasi
            System.out.println("Persegi panjang ke-" + (i + 1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
        }
    }
    public void cetakInfo(){
        System.out.println("Panjang : " + panjang + "Lebar : " + lebar);
    }
}
