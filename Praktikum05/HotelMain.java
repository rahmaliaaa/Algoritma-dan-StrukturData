package Praktikum05;
public class HotelMain {
    public static void main(String[] args) {
        Hotel [] hotels = new Hotel[5];
        Hotel hotel1 = new Hotel("Citihub Hotel", 359.775, 4.6);
        Hotel hotel2 = new Hotel("Merdeka hotel", 327.194, 4.8);
        Hotel hotel3 = new Hotel("Lotus Garden Hotel", 306.340, 4.5);
        Hotel hotel4 = new Hotel("Palem Garden Hotel", 85.145, 4.0);
        Hotel hotel5 = new Hotel("Viva hotel", 310.419, 4.3);

        hotels[0] = hotel1;
        hotels[1] = hotel2;
        hotels[2] = hotel3;
        hotels[3] = hotel4;
        hotels[4] = hotel5;

        Hotel.bubbleSortByHarga(hotels);
        System.out.println("========== Sorting Berdasarkan harga : ==========");
        for (Hotel hotel : hotels){
            hotel.displayInfo();
        }
        System.out.println("\n");

        Hotel.selectionSortDescending(hotels);
        System.out.println("=========== Sorting Berdasarkan rating : ");
        for (Hotel hotel : hotels){
            hotel.displayInfo();
        }
    }
}
