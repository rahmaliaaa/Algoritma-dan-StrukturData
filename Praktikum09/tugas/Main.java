package tugas;
public class Main {
    public static void main(String[] args) {

        ScavengerHuntPoint point1 = new ScavengerHuntPoint("1 :organ tubuh apa yang imut ?", "si-cute");
        ScavengerHuntPoint point2 = new ScavengerHuntPoint("2: Benda apa yang dijemur malah basah?", "es batu");
        ScavengerHuntPoint point3 = new ScavengerHuntPoint("3: upin ipin naik sawah", "wah");

        point1.setNextPoint(point2);
        point2.setNextPoint(point3);
        point2.setPrevPoint(point1); //double linked list
        point3.setPrevPoint(point2); //double linked list
        ScavengerHunt game = new ScavengerHunt(point1);
        game.startGame();
    }
}
