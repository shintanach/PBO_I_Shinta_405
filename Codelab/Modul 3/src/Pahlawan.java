public class Pahlawan extends KarakterGame {
    Pahlawan(String nama, int kesehatan){
        super(nama,kesehatan);
    }

    @Override
    public void serang(KarakterGame musuh){
        int kese;
        System.out.println(getNama() + " menyerang " + musuh.getNama() + " Orbital Strike!");
        kese = musuh.getKesehatan() - 20;
        musuh.setKesehatan(kese);

        System.out.println(musuh.getNama() + " sekarang memiliki " + musuh.getKesehatan());
    }

}
