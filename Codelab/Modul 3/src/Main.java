public class Main {
    public static void main(String[] args){
        KarakterGame karaktergame = new KarakterGame("Karakter Utama",100);
        Pahlawan pahlawan1 = new Pahlawan("Brimstone",150);
        Musuh musuh1 = new Musuh("Viper",200);

        karaktergame.tampilan();

        pahlawan1.tampilan();
        musuh1.tampilan();
        System.out.println();

        pahlawan1.serang(musuh1);
        System.out.println();
        musuh1.serang(pahlawan1);
        System.out.println();
        System.out.println();

    }
}
