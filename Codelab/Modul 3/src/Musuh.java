public class Musuh extends KarakterGame {
    Musuh(String nama, int kesehatan){
        super(nama,kesehatan);
    }
    @Override
    public void serang(KarakterGame pahlawan){
        int kes;
        System.out.println(getNama() + " menyerang " + pahlawan.getNama() + " Snake Bite!");
        kes = pahlawan.getKesehatan() - 15;
        pahlawan.setKesehatan(kes);

        System.out.printf(pahlawan.getNama() + " sekarang memiliki " + pahlawan.getKesehatan());
    }


}
