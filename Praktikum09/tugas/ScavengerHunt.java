package tugas;

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
        Scanner sc = new Scanner(System.in);
        if (currentPlayerPoint != null) {
            if (currentPlayerPoint.checkAnswer(playerAnswer)) {
                if (currentPlayerPoint.getNextPoint() == null) { //double linked list (untuk bergerak maju)
                    System.out.println("Permainan telah berakhir.");
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
                    System.out.println("Ingin kembali ke pertanyaan sebelumnya? (ya/tidak)");
                    String choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("ya")) {
                        if (currentPlayerPoint.getPrevPoint() != null) { //double linked list (untuk bergerak mundur)
                            currentPlayerPoint = currentPlayerPoint.getPrevPoint();
                            wrongAnswerCount = 0;
                        } 
                    } else if (choice.equalsIgnoreCase("tidak")){
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
        Scanner sc = new Scanner(System.in);
        while (currentPlayerPoint != null) {
            System.out.println("Soal: " + currentPlayerPoint.getQuestion());
            System.out.print("Jawaban Anda: ");
            String playerAnswer = sc.nextLine();
            moveToNextPoint(playerAnswer);
        }
    }
}