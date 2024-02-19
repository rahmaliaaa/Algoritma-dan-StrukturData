import java.util.Scanner;
public class SIAKAD26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double totalNilai = 0;
        double totalBobotSKS = 0;
        String[] namaMK = {"Praktikum Dasar Pemograman","Pengantar Akuntansi, Manajemen, dan Bisnis","Matematika Dasar","Konsep Teknologi Informasi","Dasar Pemograman","Bahasa Inggris","Critical Thinking dan Problem Solving","Bahasa Indonesia","Agama"};
        double[] nilaiAngka = new double[9];
        String[] nilaiHuruf = new String[9];
        String[] kualifikasi = new String[9];
        double[] bobotSKS = new double[9];

        System.out.println("======================================================================");
        System.out.println("                    Program Menghitung IP Semester                    ");
        System.out.println("======================================================================");

        for (int i = 0; i < nilaiAngka.length; i++){
            System.out.print("Masukkan nilai angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }
        System.out.println("======================================================================");
        System.out.println("                        Hasil Konversi Nilai                          ");
        System.out.println("======================================================================");
        System.out.printf("| %-40s | %-12s | %-12s | %-12s | %-16s |\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai", "Kualifikasi");
        System.out.println("|-----------------------------------------------|-------------|--------------|--------------|--------------|-------------|");

        for (int i = 0; i < nilaiHuruf.length; i++){
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotSKS[i] = 4.0;
                kualifikasi[i] = "Sangat Baik";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotSKS[i] = 3.5;
                kualifikasi[i] = "Lebih dari Baik";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotSKS[i] = 3.0;
                kualifikasi[i] = "Baik";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotSKS[i] = 2.5;
                kualifikasi[i] = "Lebih dari Cukup";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotSKS[i] = 2.0;
                kualifikasi[i] = "Cukup";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotSKS[i] = 1.0;
                kualifikasi[i] = "Kurang";
            } else {
                nilaiHuruf[i] = "E";
                bobotSKS[i] = 0.0;
                kualifikasi[i] = "Gagal";
            }
            totalNilai += bobotSKS[i];
            totalBobotSKS += 3;
        }
        double IpSemester = totalNilai / totalBobotSKS;

        for (int i = 0; i < namaMK.length; i++){
            totalNilai += bobotSKS[i]* nilaiAngka[i];
            System.out.printf("| %-40s | %-12.2f | %-12s | %-12.2f | %-16s |\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotSKS[i], kualifikasi[i]);
        }
        System.out.println("==========================================================================");
        System.out.println("IP Semester : " +IpSemester);
    }
}