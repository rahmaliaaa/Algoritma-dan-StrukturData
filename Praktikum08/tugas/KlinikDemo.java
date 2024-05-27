package tugas;
import java.util.Scanner;
public class KlinikDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pasien yang akan didaftarkan: ");
        int kapasitas = sc.nextInt();
        int menu;
        Queue myQueue = new Queue(kapasitas);
        do {
            System.out.println("\nMasukkan operasi yang diinginkan");
            System.out.println("1. Input Data Pasien");
            System.out.println("2. Pasien yang telah dipanggil dan keluar dari antrian");
            System.out.println("3. Daftar pasien di antrian");
            System.out.println("4. Pasien yang sedang dipanggil");
            System.out.println("5. Mengosongkan antrian pasien");
            System.out.println("6. Exit");
            System.out.println("-----------------------------------------------------------");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nomor identitas: ");
                    String noID = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (L/P): ");
                    char jenisKelamin = sc.next().charAt(0);
                    sc.nextLine();
                    Pasien newPasien = new Pasien(nama, noID, jenisKelamin);
                    myQueue.enqueue(newPasien);
                    break;
                case 2:
                    Pasien deletedData = myQueue.dequeue();
                    if (deletedData != null) {
                        System.out.println("Data yang dikeluarkan: ");
                        System.out.println(deletedData);
                    }
                    break;
                case 3:
                    myQueue.print();
                    break;
                case 4:
                    myQueue.peek();
                    break;
                case 5:
                    myQueue.clear();
                    break;
            }
        } while (menu >= 1 && menu <= 5);
    }
}