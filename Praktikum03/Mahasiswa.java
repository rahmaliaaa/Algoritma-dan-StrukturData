package Praktikum03;
import java.util.Scanner;

public class Mahasiswa {
    public String nama;
    public String nim;
    public char jenisKelamin;
    public double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public void tampilkanInfo() { //fungsi method
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
    }

    public double getIpk() { //method
        return ipk;
    }
}