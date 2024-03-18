package Praktikum03;
import java.util.Scanner;

public class UserProjectMain {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masuk sebagai (Guru/Admin) : ");
        String  Sebagai= sc.nextLine(); 

        if (Sebagai.equalsIgnoreCase("Guru")) { 
            UserProject[] users = { //inisialisasi daftar object
                new UserProject("Devin", "20040417"),
                new UserProject("Meisy", "20040607"),
                new UserProject("Rahmalia", "20050228"),
                new UserProject("Belqis", "20040415"),
                new UserProject("Aqila", "20040414")
            };
            System.out.print("Masukkan username : ");
            String inputUsername = sc.nextLine();
            System.out.print("Masukkan password : ");
            String inputPassword = sc.nextLine();
            
            boolean loginSuccessful = false;
            for (UserProject user : users) { 
                if (user.getUsername().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                    loginSuccessful = true;
                    break;
                }
            }
            
            if (loginSuccessful) {
                System.out.println("Login berhasil");
            } else {
                System.out.println("Login gagal!");
                System.out.println("Klik <enter> untuk kembali ke halaman login");
                sc.nextLine();
            }
        } else {
            System.out.println("data tidak valid. Hanya 'Guru' atau 'Admin' yang diperbolehkan.");
        }
    }
}