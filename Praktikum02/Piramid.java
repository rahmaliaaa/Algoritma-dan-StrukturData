public class Piramid {
    private float alasPesergi;
    private float sisi;
    private float tinggi;

    public Piramid(float alasPesergi, float sisi, float tinggi) {
        this.alasPesergi = alasPesergi;
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    public void tampilTinggi() {
        System.out.println("Tinggi: " + this.tinggi);
    }

    public void tampilSisi() {
        System.out.println("Sisi: " + this.sisi);
    }

    public void tampilAlasPesergi() {
        System.out.println("Alas pesegi: " + this.alasPesergi);
    }

    public void hitungLuas() {
        float s = (float) Math.sqrt(Math.pow(this.sisi, 2) - Math.pow(this.tinggi, 2));
        float luasAlas = this.alasPesergi * s;
        System.out.println("Luas: " + luasAlas);
    }

    public void hitungVolume() {
        float volume = (float) (1.0/3.0) * alasPesergi *  this.tinggi;
        System.out.println("Volume: " + volume);
    }
}