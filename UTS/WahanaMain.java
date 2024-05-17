package UTS;
import java.util.Arrays;
import java.util.Scanner;

public class WahanaMain {
    static Pengunjung[] pengunjungs = new Pengunjung[100]; 
    static int total = 0; //total pengunjung

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan;
        do { //loop
            System.out.println("-------------------------------------------------");
            System.out.println("Menu : ");
            System.out.println("1. Memasukkan data");
            System.out.println("2. Cari data");
            System.out.println("3. Lihat data");
            System.out.println("4. Laporan");
            System.out.println("0. keluar");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextInt(); //unyuk menerima data input
            System.out.println("-------------------------------------------------");

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    searchData();
                    break;
                case 3:
                    displayData();
                    break;
                case 4:
                    laporan();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            } 
        } while (pilihan != 0); //melakukan perulangan selama pilihan menu tidak = 0
    }
    static void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kategori pengunjung: ");
        String kategori = sc.nextLine();
        System.out.println("Nama: ");
        String nama = sc.nextLine();
        System.out.println("Durasi (jam): ");
        int durasi = sc.nextInt();
        System.out.println();

        Pengunjung pengunjung = new Pengunjung(kategori, nama, durasi);
        pengunjungs[total++] = pengunjung; // Menambahkan objek Pengunjung ke dalam array pengunjung dan menginkrementasi total
        System.out.println("Biaya: " + pengunjung.biaya);
    }
    static void searchData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama : ");
        String cariNama = sc.next();
        
        boolean ditemukan = false;
        for (int i = 0; i < total; i++){
            if (pengunjungs[i].nama.toLowerCase().contains(cariNama.toLowerCase())){ //untuk merubah menjadi huruf kecil semua, contains untuk memeriksa apakah nama mengandung string yg dicari, 
                ditemukan = true; //jika ya, maka variabel diubah menjadi true
                System.out.println("--------------------------------------------------");
                System.out.println("Tipe pengunjung  | " + pengunjungs[i].kategori);
                System.out.println("Nama             | " + pengunjungs[i].nama );
                System.out.println("Durasi           | " + pengunjungs[i].durasi);
                System.out.println("Biaya            | " + pengunjungs[i].biaya);
                System.out.print("-------------------------------------------------");
            }
        }
        if (!ditemukan){ //jika data tidak ditemukan, terjadi jika perulangan pertama tidak terpenuhi
            System.out.println("Data tidak ditemukan");
            System.out.println("masukkan data yang benar!");
        }
    }
    static void displayData() {
        // Bubble sort
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < total - 1; i++) { 
            for (int j = 0; j < total - i - 1; j++) {
                if (pengunjungs[j].biaya > pengunjungs[j + 1].biaya) {
                    // Tukar posisi elemen jika biaya lebih besar pada elemen sebelah kanan
                    Pengunjung temp = pengunjungs[j]; 
                    pengunjungs[j] = pengunjungs[j + 1];
                    pengunjungs[j + 1] = temp;
                }
            }
        }
        // Tampilkan data setelah diurutkan
        for (int i = 0; i < total; i++) {
            System.out.println("-------------------------------------------------");
            System.out.println("Tipe pengunjung  | " + pengunjungs[i].kategori);
            System.out.println("Nama             | " + pengunjungs[i].nama);
            System.out.println("Durasi           | " + pengunjungs[i].durasi);
            System.out.println("Biaya            | " + pengunjungs[i].biaya + "jam");
            System.out.println("--------------------------------------------------");
        }
    }
    
    static void laporan(){
        int totalPengunjungAnak = 0;
        int totalPengunjungDewasa = 0;

        for (int i = 0; i < total; i++)
            if (pengunjungs[i].kategori.equals("anak-anak")){
                totalPengunjungAnak += pengunjungs[i].biaya;
            } else if (pengunjungs[i].kategori.equals("dewasa")){ 
                totalPengunjungDewasa += pengunjungs[i].biaya;
        }
        System.out.println("Total pendapatan");
        System.out.println("Dewasa : " + totalPengunjungDewasa);
        System.out.println("Anak-anak : " + totalPengunjungAnak);
    }
}

