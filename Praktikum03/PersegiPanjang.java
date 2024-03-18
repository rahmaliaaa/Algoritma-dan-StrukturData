package Praktikum03;
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public int luas;
    public int keliling; 

    public PersegiPanjang(int p, int l) { //constructor berparamter
        this.panjang = p;
        this.lebar = l;
    }

    public void hitungLuas(int p, int l) { 
        luas = p * l;
    }

    public void hitungKeliling(int p, int l) { //method
        keliling = 2 * (p + l);
    }
    public void cetakInfo() { //method
        System.out.print("Panjang : " + panjang + ", Lebar : " +lebar);
        System.out.println(" , Luas : " + luas + ", Keliling : " + keliling);
    }

    public static void main(String[] args) {
        PersegiPanjang [] arrayOfPersegiPanjang = new PersegiPanjang[3]; //constructor

        arrayOfPersegiPanjang[0] = new PersegiPanjang(110, 30);
        arrayOfPersegiPanjang[1] = new PersegiPanjang(80, 40);
        arrayOfPersegiPanjang[2] = new PersegiPanjang(100, 20);

        System.out.println("panjang Panjang ke - 0, panjang : " +arrayOfPersegiPanjang[0].panjang + " , lebar : " +arrayOfPersegiPanjang[0].lebar);
        System.out.println("panjang Panjang ke - 1, panjang : " +arrayOfPersegiPanjang[1].panjang + " , lebar : " +arrayOfPersegiPanjang[1].lebar);
        System.out.println("panjang Panjang ke - 2, panjang : " +arrayOfPersegiPanjang[2].panjang + " , lebar : " +arrayOfPersegiPanjang[2].lebar);
        
    }

}