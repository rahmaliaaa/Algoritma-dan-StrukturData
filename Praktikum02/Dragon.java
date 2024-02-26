public class Dragon {
    private int x; //mendatar
    private int y; //vertikal
    private int direction;

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah baru tidak valid.");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: //atas
                this.y += steps;
                break;
            case 2: //kanan
                this.x += steps;
                break;
            case 3: //bawah
                this.y -= steps;
                break;
            case 4: //kiri
                this.x -= steps;
                break;
            default: 
                System.out.println("arah tidakvalid.");
        }
    }

    public void printStatus() {
        System.out.println("Posisi: (" + x + ", " + y + "), Arah: " + direction);
    }
}