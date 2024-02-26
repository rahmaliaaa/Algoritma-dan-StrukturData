public class Snake {
    protected int x;
    protected int y;

    public Snake(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveLeft() {
        this.x--;
    }

    public void moveRight() {
        this.x++;
    }

    public void moveUp() {
        this.y++;
    }

    public void moveDown() {
        this.y--;
    }

    public void printPosition() {
        System.out.println("Position: (" + this.x + ", " + this.y + ")");
    }
}