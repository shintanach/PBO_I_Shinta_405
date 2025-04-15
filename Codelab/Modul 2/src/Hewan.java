public class Hewan {
    String nama,jenis,suara;

    public void tampilkaninfo(){
        System.out.println("Nama  : "+ nama);
        System.out.println("Jenis : "+ jenis);
        System.out.println("Suara : "+ suara);

    }
    public Hewan (String a, String b, String c){
        nama = a;
        jenis = b;
        suara = c;
    }
}
