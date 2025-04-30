package perpustakaan;

public class Nonfiksi extends Buku{
    public Nonfiksi(String penulis,String judul){
        super(penulis,judul);
    }

    @Override
    public void displayinfo(){
        System.out.println( "Buku Non-fiksi : " + judul + " oleh " + penulis + " (Bidang: Sejarah dan Ilmu Pengetahuan)");
    }
}
