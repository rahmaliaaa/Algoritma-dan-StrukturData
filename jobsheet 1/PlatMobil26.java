import java.util.Scanner;
public class PlatMobil26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String [] kota = {"BANTEN", " JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};
        char inputKode;

        do {
            System.out.print("Masukkan kode plat mobil: ");
            inputKode = sc.next().charAt(0);

            int indexKode = -1;
            for (int i = 0; i < kode.length; i++){
                if (kode [i] ==  inputKode){
                    indexKode = i;
                    break;
                }
            }
            if (indexKode == -1){
                System.out.println("Kode Plat Mobil tidak ditemukan!");
            } else {
                System.out.println(" Nama Kota: " + kota[indexKode]);
            }
            System.out.print("Ingin Memasukkan Kode Plat Mobil Lainnya ? (y/n) : ");
        } while (sc.next().charAt(0) == 'y');
    }
}