import java.util.Scanner;
public class Rumus26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu =0;

        while (menu !=4) {    
            System.out.println("===============================================");
            System.out.println("                    Menu:                      ");
            System.out.println("===============================================");
            System.out.println("| 1. Menghitung hasil perhitungan Kecepatan   |");
            System.out.println("| 2. Menghitung hasil perhitungan jarak       |");
            System.out.println("| 3. Menghitung hasil perhitungan waktu       |");
            System.out.println("| 4. Exit                                     |");
            System.out.print("| Pilih menu (1-4): ");
            menu = sc.nextInt();
            System.out.println("-----------------------------------------------");
            
            switch (menu){
                case 1:
                    System.out.print("Masukkan Jarak (meter) : ");
                    double jarak = sc.nextDouble();
                    System.out.print("Masukkkan waktu (detik) : ");
                    double waktu = sc.nextDouble();
                    double Kecepatan = jarak / waktu;
                    System.out.println("Kecepatan: " + Kecepatan + " m/s");
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    double kecepatan2 = sc.nextDouble();
                    System.out.print("Masukkan waktu (detik): ");
                    double waktu2 = sc.nextDouble();
                    double jarak2 = kecepatan2 * waktu2;
                    System.out.println("Jarak: " + jarak2 + " meter");
                    break;
                case 3:
                    System.out.print("Masukkan kecepatan (m/s): ");
                    double kecepatan3 = sc.nextDouble();
                    System.out.print("Masukkan jarak (meter): ");
                    double jarak3 = sc.nextDouble();
                    double waktu3 = jarak3 / kecepatan3;
                    System.out.println("Waktu: " + waktu3 + " detik");
                    break;
                case 4:
                    System.out.println("Terimakasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } 
    }
}