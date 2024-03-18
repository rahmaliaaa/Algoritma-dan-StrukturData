package Praktikum03;

public class Kampus {
    public String nama;
    public String nim;
    public String jenisKelamin;
    public float ipk;

    public Kampus(String nama, String nim, String jenisKelamin, float ipk){ //konstructor berparamter 
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public String getNama () { //konstruktor deafult 
            return nama;
    }
    public String getNim () {
        return nim; 
    }
    public String getJenisKelamin () {
        return jenisKelamin;
    }
    public float getIpk (){
        return ipk;
    }       
    public void CetakInfo(){
        System.out.println("Nama            :" +this.nama);
        System.out.println("NIM             :" +this.nim);
        System.out.println("Jenis Kelamin   :" +this.jenisKelamin);
        System.out.println("Nilai IPK       :" +this.ipk);
    }
    
}
