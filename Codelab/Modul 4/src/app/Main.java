package app;
import perpustakaan.*;

public class Main {
    public static void main(String[] args){

        Buku buku = new Nonfiksi("Madilog","Tan Malaka");
        Buku buku1 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu");
        Peminjaman anggota1 = new Anggota("Shinta Alya","I405");
        Peminjaman anggota2 = new Anggota("Nadia Setiana", "I403");

        System.out.println();
        buku.displayinfo();
        buku1.displayinfo();
        System.out.println();

        anggota1.info();
        anggota2.info();
        System.out.println();

        anggota1.pinjambuku("Madilog");
        anggota2.pinjambuku("Hainuwele: Sang Putri Kelapa","7 hari");
        System.out.println();

        anggota1.kembalikanbuku("Madilog");
        anggota2.kembalikanbuku("Hainuwele: Sang Putri Kelapa");

    }
}
