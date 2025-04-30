package perpustakaan;

public interface Peminjaman {

    void info();
    void pinjambuku(String judul);
    void pinjambuku(String judul, String durasi);
    void kembalikanbuku(String judul);
}
