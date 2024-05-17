package GerbangTol;
import java.util.Scanner;

public class GerbangTolDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int kapasitas = sc.nextInt();
        int menu;
        Queue myQueue = new Queue(kapasitas);

        do {
            System.out.println("\nMasukkan operasi yang diinginkan");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Peek rear");
            System.out.println("6. Clear");
            System.out.println("7. Exit");
            System.out.println("-----------------------------------");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan no plat : ");
                    String noPlat = sc.nextLine();
                    System.out.print("Masukkan no kartu : ");
                    String noKartu = sc.nextLine();
                    System.out.print("Masukkan saldo : ");
                    double saldo = sc.nextDouble();
                    sc.nextLine(); // Consume the newline character
                    Kendaraan newKendaraan = new Kendaraan(noPlat, noKartu, saldo);
                    myQueue.enqueue(newKendaraan);
                    break;
                case 2:
                    Kendaraan deletedData = myQueue.dequeue();
                    if (deletedData != null) {
                        System.out.println("Data yang dikeluarkan : ");
                        System.out.println(deletedData);
                    }
                    break;
                case 3:
                    myQueue.print();
                    break;
                case 4:
                    myQueue.peekRear();
                    break;
                case 5:
                    myQueue.peekRear();
                    break;
                case 6:
                    myQueue.clear();
                    break;
            }
        } while (menu >= 1 && menu <= 6);
    }
}