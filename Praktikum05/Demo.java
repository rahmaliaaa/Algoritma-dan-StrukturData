package Praktikum05;

public class Demo { 
    public static void main(String[] args) {
        Kelas kelas1A = new Kelas(5);
        Mahasiswa mhs1 = new Mahasiswa("Ani", 18, 4.00);
        Mahasiswa mhs2 = new Mahasiswa("Budi", 19, 3.50);
        Mahasiswa mhs3 = new Mahasiswa("Cica", 17, 3.75);
        Mahasiswa mhs4 = new Mahasiswa("Deni", 20, 3.15);
        Mahasiswa mhs5 = new Mahasiswa("Eka", 18, 3.00);

        kelas1A.add(mhs1);
        kelas1A.add(mhs2);
        kelas1A.add(mhs3);
        kelas1A.add(mhs4);
        kelas1A.add(mhs5);

        kelas1A.bubbleSortByIPK();
        kelas1A.insertionSortByIPKDesc();
        kelas1A.selectionSortByUmur();

        // Pencarian berdasarkan nama
        String keyword = "Budi";
        int index = kelas1A.sequentialSearchByNama(keyword);
        if (index != -1) {
            System.out.println("Nama " + keyword + " ditemukan pada indeks " + index);
            kelas1A.daftMahasiswas[index].displayInfo();
        } else {
            System.out.println("Nama " + keyword + " tidak ditemukan");
        }
        int targetUmur = 20;
        int indexUmur = kelas1A.binarySearchByUmur(targetUmur);
        if (indexUmur != -1) {
            System.out.println("Mahasiswa dengan umur " + targetUmur + " ditemukan pada indeks " + indexUmur);
        } else {
            System.out.println("Mahasiswa dengan umur " + targetUmur + " tidak ditemukan");
        }
    }
}
