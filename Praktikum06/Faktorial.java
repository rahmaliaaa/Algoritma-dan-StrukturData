package Praktikum06;

import java.util.Scanner;
public class Faktorial {
    public int nilai;
    private static int iterasiBF = 0; //modifikasi
    private static int iterasiDC = 0;

    Faktorial(int nilai){
        this.nilai = nilai; 
    }
    public int faktorialBF(int n) {
        
        int fakto = 1;
        for (int i = 1; i <= n; i++){
            fakto = fakto * i;
            iterasiBF++; //modifikasi untuk menghitung jumlah iterasi
        }
        return fakto;
    }
    public int faktorialDC(int n){
        
        if (n == 1) {
            return 1;
        }
        else
        {
            iterasiDC++;
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial(i);
            System.out.print("Masukkan nilai data ke-" +(i+1)+ " : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " +fk[i].nilai+ "adalah : " +fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("======================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai " +fk[i].nilai+" adalah : " +fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("Jumlah iterasi Brute Force :" + iterasiBF);
        System.out.println("Jumlah iterasi Divide and Conquer: " + iterasiDC);
        System.out.println("=======================================================");
    }
}


