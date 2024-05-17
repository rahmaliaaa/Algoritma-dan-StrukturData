package UTS;
import java.util.Scanner;

class Pengunjung{
    String kategori;
    String nama;
    int durasi;
    int biaya;

    Pengunjung(String kategori, String nama, int durasi){ //kontraktor
        this.kategori = kategori;
        this.nama = nama;
        this.durasi = durasi;
        
        if (kategori.equals("anak-anak")){
            this.biaya = durasi * 10000;
        } else if (kategori.equals("dewasa")){
            this.biaya = durasi * 20000;
        }
    }
}