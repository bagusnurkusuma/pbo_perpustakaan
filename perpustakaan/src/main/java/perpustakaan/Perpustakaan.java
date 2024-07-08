package perpustakaan;

public interface Perpustakaan {
    void pinjamBuku(String judulBuku);
    void kembalikanBuku(String judulBuku);
    void lihatDaftarBuku();
}