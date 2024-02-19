public class Sepeda {
        float kecepatan;
        int gear;

        public void tambahKecepatan(float increment){
            if (kecepatan + increment > 20) { // modifikasi 8
                kecepatan = 20;
            } else {
                kecepatan += increment;
            }
        }
        public void kurangiKecepatan(float decrement){
            if (kecepatan - decrement < 0) {
                kecepatan = 0; //modifikasi 9
            } else {
                kecepatan -= decrement;
            }
        }
        public void cetakInfo(){
            System.out.println("Kecepatan : " + kecepatan);
            System.out.println(" Gear : " + gear);
            System.out.println("==================");
        }
}
