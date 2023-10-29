public class MainClass {
    // Atribut
    private String nama;
    private int umur;

    // Konstruktor
    public MainClass(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
        }

    // Metode untuk menampilkan informasi
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    // Metode untuk mengubah nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode untuk mengubah umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas MainClass
        MainClass objek = new MainClass("John Doe", 30);

        // Memanggil metode tampilkanInformasi
        objek.tampilkanInformasi();

        // Mengubah nama dan umur
        objek.setNama("Jane Doe");
        objek.setUmur(25);

        // Memanggil metode tampilkanInformasi lagi
        objek.tampilkanInformasi();
    }
}
