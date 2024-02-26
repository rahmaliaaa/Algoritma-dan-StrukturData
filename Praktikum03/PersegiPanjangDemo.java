package Praktikum03;
import java.util.Scanner;
public class PersegiPanjangDemo {
    Scanner sc = new Scanner(System.in);
    PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

    for (int i = 0; i< 3; i++){
        arrayOfPersegiPanjang[i] = new PersegiPanjang();

        System.out.println("Persegi panjang ke-" + (i + 1));
        System.out.print("Masukkan panjang: ");
        arrayOfPersegiPanjang[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        arrayOfPersegiPanjang[i].lebar = sc.nextInt();
    }
}
