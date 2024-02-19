import java.util.Scanner;
public class PlatMobil26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char [][] kota = {{'B', 'A', 'N', 'T', 'E', 'N'},
                        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                        {'B', 'O', 'G', 'O', 'R'},
                        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                        {'S', 'A', 'R', 'A', 'B', 'A', 'Y', 'A'},
                        {'M', 'A', 'L', 'A', 'N', 'G'},
                        {'T', 'E', 'G', 'A', 'L'}};
        char inputKode;
        do {
            System.out.print("Masukkan lode plat mobil: ");
            inputKode = sc.next().charAt(0);

            int indexKode = -1;
            for (int i = 0; i < kode.length; i++){
                if (kode [i] ==  inputKode){
                    indexKode = i;
                    break;
                }
            }
            if (indexKode == 1){
                System.out.println("Kode Plat Mobil tidak ditemukan!");
            } else {
                System.out.print(" Nama Kota: ");
                for (int j = 0; j< kota[indexKode].length; j++){
                    System.out.print(kota[indexKode][j]);
                }
                System.out.println();
            }
            System.out.print("Ingin Memasukkan Kode Plat Mobil Lainnya ? (y/n) : ");
        } while (sc.next().charAt(0) == 'y');
    }
}
