package Praktikum03;
import java.util.Scanner;

public class GuruMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jumlah;
    
        System.out.print("Masukkan jumlah guru: ");
        jumlah = sc.nextInt();
        sc.nextLine();
    
        Guru[] dataGuru = new Guru[jumlah];
    
        for (int i = 0; i < dataGuru.length; i++){
            System.out.println("Masukkan Data guru ke-" + (i+1));
            System.out.print("Masukkan Nama Guru : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIP Guru : ");
            String nip = sc.nextLine();
            System.out.print("Masukkan Jabatan Guru (PNS/Honorer) : ");
            String jabatan = sc.nextLine();
            System.out.print("Masukkan Golongan Guru (1/2) : ");
            int golongan = sc.nextInt();
    
            dataGuru[i] = new Guru(nama, nip, jabatan, golongan);
            sc.nextLine();
        }
        int a = 0;
        for (Guru guru : dataGuru){
            System.out.println("Data Guru ke-" + (a+1));
            guru.CetakInfo();
            a++;
        }
    }
}
