package Praktikum03;
import java.util.Scanner; 

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.next();

            System.out.print("NIM: ");
            String nim = sc.next();

            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = sc.next().charAt(0);

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();

            daftarMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.tampilkanInfo();
        }

        double totalIpk = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.getIpk();
        }
        double rataRataIpk = totalIpk / jumlahMahasiswa;
        System.out.println("\nRata-rata IPK: " + rataRataIpk);
    }    
}
