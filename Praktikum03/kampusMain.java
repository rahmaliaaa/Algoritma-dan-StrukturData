package Praktikum03;
import java.util.Scanner;

public class kampusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        float rataIpk = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = sc.nextInt();
        sc.nextLine();

        Kampus[] dataKampus = new Kampus[jumlah];

        for(int i = 0; i<jumlah; i++){
            System.out.println("Masukkan Data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama Mahasiswa : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM Mahasiswa : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan  Jenis Kelamin : ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan niali IPK : ");
            float ipk = Float.parseFloat(sc.nextLine());
    
            dataKampus[i] = new Kampus(nama, nim, jenisKelamin, ipk);
    
            rataIpk += ipk;
            sc.nextLine();
        }
        int a = 0;
        for (Kampus kampus : dataKampus){
            System.out.println("Data Mahasiswa ke-" + (a+1));
            kampus.CetakInfo();
            a++;
        }
        rataIpk /= jumlah;
        System.out.println("Rata-rata IPK :" + rataIpk);
    }
}

