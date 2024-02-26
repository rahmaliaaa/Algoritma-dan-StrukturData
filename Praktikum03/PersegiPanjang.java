package Praktikum03;

public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static void main(String[] args) {
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

        arrayOfPersegiPanjang[0] = new PersegiPanjang();
        arrayOfPersegiPanjang[0].panjang = 110;
        arrayOfPersegiPanjang[0].lebar = 30;

        arrayOfPersegiPanjang[1] = new PersegiPanjang();
        arrayOfPersegiPanjang[1].panjang = 80;
        arrayOfPersegiPanjang[1].lebar = 40;

        arrayOfPersegiPanjang[2] = new PersegiPanjang();
        arrayOfPersegiPanjang[2].panjang = 100;
        arrayOfPersegiPanjang[2].lebar = 20;

        System.out.println("Persegi Panjang ke-1, panjnag: " + arrayOfPersegiPanjang[0].panjang+ ", lebar : " + arrayOfPersegiPanjang[0].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang + ", lebar : " + arrayOfPersegiPanjang[1].lebar);
        System.out.println("Persegi panjang ke-3, panjang : " + arrayOfPersegiPanjang[2].panjang + ", lebar: " + arrayOfPersegiPanjang[2].lebar);
    }
}
