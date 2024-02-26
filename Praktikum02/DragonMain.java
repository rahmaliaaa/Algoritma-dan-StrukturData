public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon(5, 5, 1);
        Dragon dragon2 = new Dragon(7, 7, 2);

        dragon1.printStatus();
        dragon2.printStatus();

        dragon1.move(2);
        dragon1.changeDirection(4);
        dragon1.move(3);
        dragon1.printStatus();

        dragon2.move(1);
        dragon2.changeDirection(3);
        dragon2.move(4);
        dragon2.printStatus();
    }
}