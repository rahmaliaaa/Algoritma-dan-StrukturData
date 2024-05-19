package tugas;

import java.util.Scanner;

public class ScavengerHunt {
    Scanner sc = new Scanner(System.in);
    private ScavengerHuntPoint startPoint;
    private ScavengerHuntPoint currentPlayerPoint;
    private int wrongAnswerCount;

    public ScavengerHunt(ScavengerHuntPoint startPoint) {
        this.startPoint = startPoint;
        this.currentPlayerPoint = startPoint;
        this.wrongAnswerCount = 0;
        this.sc = new Scanner(System.in);
    }

    public void moveToNextPoint(String playerAnswer) {
        if (currentPlayerPoint != null) {
            if (currentPlayerPoint.checkAnswer(playerAnswer)) {
                if (currentPlayerPoint.getNextPoint() == null) { //double linked list untuk bergerak maju
                    System.out.println("Permainan telah berakhir.");
                    currentPlayerPoint = null;
                    return;
                }
                currentPlayerPoint = currentPlayerPoint.getNextPoint();
                wrongAnswerCount = 0;
            } else {
                System.out.println("Jawaban salah! Coba lagi.");
                wrongAnswerCount++;
                if (wrongAnswerCount == 2) { 
                    System.out.println("Jawaban yang benar adalah: " + currentPlayerPoint.getAnswer());
                    if (currentPlayerPoint.getNextPoint() == null) {
                        System.out.println("Permainan selesai. Sampai Jumpa!");
                        currentPlayerPoint = null;
                        return;
                    } else {
                        currentPlayerPoint = currentPlayerPoint.getNextPoint();
                        wrongAnswerCount = 0;
                    }
                } else {
                    System.out.println("Ingin mencoba lagi pada soal ini? (ya/tidak)");
                    String choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("ya")) { //program akan mengulang sampai kondisi terpenuhi
                    } else if (choice.equalsIgnoreCase("tidak")) {
                        System.out.println("Permainan selesai. Sampai Jumpa!");
                        currentPlayerPoint = null;
                        return;
                    }
                }
            }
        }
    }
    public void startGame() {
        System.out.println("Selamat datang di Scavenger Hunt Game!");
        System.out.println("Mulai dari titik awal:");
        while (currentPlayerPoint != null) {
            System.out.println("Soal: " + currentPlayerPoint.getQuestion());
            System.out.print("Jawaban Anda: ");
            String playerAnswer = sc.nextLine();
            moveToNextPoint(playerAnswer);
        }
    }
}