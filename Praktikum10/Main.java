package Praktikum10;

public class Main {
    public static void main(String[] args) {

        ScavengerHuntPoint point1 = new ScavengerHuntPoint("1 :organ tubuh apa yang imut ?", "si-cute");
        ScavengerHuntPoint point2 = new ScavengerHuntPoint("2: Benda apa yang dijemur malah basah?", "es batu");
        ScavengerHuntPoint point3 = new ScavengerHuntPoint("3: upin ipin naik sawah", "wah");
        ScavengerHuntPoint point4 = new ScavengerHuntPoint("4 : mie ayam kalo dibalik apa?", "cakep");

        point1.setNextPoint(point2);
        point2.setNextPoint(point3);
        ScavengerHunt game = new ScavengerHunt(point1);
        game.startGame();
    }
}
