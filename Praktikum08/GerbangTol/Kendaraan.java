// Kelas Kendaraan
public class Kendaraan {
    private String noPlat;
    private String noKartu;
    private double saldo;

    public Kendaraan(String noPlat, String noKartu, double saldo) {
        this.noPlat = noPlat;
        this.noKartu = noKartu;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "No Plat: " + noPlat + ", No Kartu: " + noKartu + ", Saldo: " + saldo;
    }
}