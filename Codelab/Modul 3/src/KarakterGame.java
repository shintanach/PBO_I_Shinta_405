public class KarakterGame {
    private String nama;
    private int kesehatan;

    public void serang(KarakterGame target){
        System.out.println(nama + " menyerang");

    }

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }
    public void tampilan(){
        System.out.println(getNama() + " memiliki kesehatan : "+ getKesehatan());
    }
}
