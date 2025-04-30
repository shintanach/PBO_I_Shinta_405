package perpustakaan;

public class Anggota implements Peminjaman {
    String nama;
    String Idanggota;

    public Anggota(String nama,String Idanggota ){
        this.nama = nama;
        this.Idanggota = Idanggota;
    }
    public void info(){
        System.out.println("Anggota : "+ nama + " (ID : " + Idanggota + ")");
    }

    @Override
    public void pinjambuku(String judul){
        System.out.println(nama + " meminjam buku berjudul : "+ judul);
    }

    @Override
    public void pinjambuku(String judul, String durasi){
        System.out.println(nama + " meminjam buku berjudul : "+ judul + " selama "+ durasi);
    }

    @Override
    public void kembalikanbuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul : "+ judul);
    }

}
