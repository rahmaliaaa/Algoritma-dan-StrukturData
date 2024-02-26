public class SnakeMain {
    public static void main(String[] args) {
        Snake snake1 = new Snake(3, 7);
        Snake snake2 = new Snake(5, 2);
        
        System.out.println(" Posisi Awal");
        snake1.printPosition();
        snake2.printPosition();

        snake1.moveRight();
        snake1.moveDown();

        snake2.moveLeft();
        snake2.moveUp();

        System.out.println("Posisi sesudah diubah");
        snake1.printPosition();
        snake2.printPosition();
    }
}