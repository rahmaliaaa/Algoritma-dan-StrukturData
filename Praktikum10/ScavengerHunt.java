package Praktikum10;

import java.util.Scanner;

public class ScavengerHunt {
    private ScavengerHuntPoint startPoint;
    private ScavengerHuntPoint currentPlayerPoint;
    private int wrongAnswerCount;

    public ScavengerHunt(ScavengerHuntPoint startPoint) {
        this.startPoint = startPoint;
        this.currentPlayerPoint = startPoint;
        this.wrongAnswerCount = 0;
    }
    public void moveToNextPoint(String playerAnswer) {
        if (currentPlayerPoint != null) {
            if (currentPlayerPoint.checkAnswer(playerAnswer)) {
                currentPlayerPoint = currentPlayerPoint.getNextPoint();
                wrongAnswerCount = 0;
            } else {
                System.out.println("Jawaban salah! Coba lagi.");
                wrongAnswerCount++;
                if (wrongAnswerCount == 2) {
                    System.out.println("Jawaban yang benar adalah: " + currentPlayerPoint.getAnswer());
                    currentPlayerPoint = currentPlayerPoint.getNextPoint();
                    wrongAnswerCount = 0;
                    return;
                }
            }
        } else {
            System.out.println("Permainan telah berakhir.");
        }
    }
    

    public void startGame() {
        System.out.println("Selamat datang di Scavenger Hunt Game!");
        System.out.println("Mulai dari titik awal:");

        Scanner scanner = new Scanner(System.in);

        while (currentPlayerPoint != null) {
            System.out.println("Soal: " + currentPlayerPoint.getQuestion());
            System.out.print("Jawaban Anda: ");
            String playerAnswer = scanner.nextLine();
            moveToNextPoint(playerAnswer);
        }

        System.out.println("Permainan selesai. Sampai Jumpa!");
    }
}
