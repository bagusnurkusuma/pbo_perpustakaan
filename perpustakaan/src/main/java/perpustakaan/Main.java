package perpustakaan;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new PerpustakaanUmum();
        perpustakaan.pinjamBuku("Buku A");
        perpustakaan.kembalikanBuku("Buku B");
        perpustakaan.lihatDaftarBuku();
    }
}