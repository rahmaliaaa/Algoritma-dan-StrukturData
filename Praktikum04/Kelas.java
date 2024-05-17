package Praktikum04;
public class Kelas {
    Mahasiswa[] daftMahasiswas;
    int index;

    public Kelas(int kuota){
        daftMahasiswas = new Mahasiswa[kuota];
    }
    public void add(Mahasiswa mahasiswa){
        if (index < daftMahasiswas.length){
            daftMahasiswas[index] = mahasiswa;
            index++;
        } else {
            System.out.println("Kelas sudah penuh");
        }
    }    
    public void displayInfo() {
        for (Mahasiswa mahasiswa : daftMahasiswas){
                mahasiswa.displayInfo();
        }
    }
    public void bubbleSortByIPK(){
        int n = daftMahasiswas.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (daftMahasiswas[j].ipk > daftMahasiswas[j + 1].ipk){
                    Mahasiswa temp = daftMahasiswas[j];
                    daftMahasiswas[j] = daftMahasiswas[j + 1];
                    daftMahasiswas[j + 1] = temp;
                }
            }
        }
    }
    public void selectionSortByUmur(){
        int n = daftMahasiswas.length;

        for (int i = 0; i < n - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (daftMahasiswas[j].umur < daftMahasiswas[minIndex].umur){
                    minIndex = j;
                }
            }
            Mahasiswa temp = daftMahasiswas[minIndex];
            daftMahasiswas[minIndex] = daftMahasiswas[i];
            daftMahasiswas[i] = temp;
        }
    }
    public void insertionSortByIPKDesc() {
        int n = daftMahasiswas.length;

        for (int i = 1; i < n; i++) {
            Mahasiswa key = daftMahasiswas[i];
            int j = i - 1;
            while (j >= 0 && daftMahasiswas[j].ipk < key.ipk) {
                daftMahasiswas[j + 1] = daftMahasiswas[j];
                j = j - 1;
            }
            daftMahasiswas[j + 1] = key;
        }
    }
    public int sequentialSearchByNama(String keyword) {
        for (int i = 0; i < daftMahasiswas.length; i++) {
            if (daftMahasiswas[i] != null && 
            daftMahasiswas[i].nama.toLowerCase().contains(keyword.toLowerCase())) {
                return i; // Mengembalikan indeks pertama yang cocok
            }
        }
        return -1; // Jika tidak ditemukan
    }
    public int binarySearchByUmur(int targetUmur) {
        int low = 0;
        int high = index - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (daftMahasiswas[mid].umur == targetUmur) {
                return mid; 
            } else if (daftMahasiswas[mid].umur < targetUmur) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return -1;
}
}
