public class Main2 {
    public static void main(String[] args){
        RekeningBank rekening1 = new RekeningBank("202410370110405","Shinta Alya",15000000);
        rekening1.tampilkaninfo();
        System.out.println();
        RekeningBank rekening2 = new RekeningBank("202410370110403","Nadia Setiana",10000000);
        rekening2.tampilkaninfo();
        System.out.println();

        rekening1.setoruang();
        System.out.println();

        rekening2.setoruang();
        System.out.println();

        rekening1.tarikuang();
        System.out.println();

        rekening2.tarikuang();
        System.out.println();

        rekening1.tampilkaninfo();
        System.out.println();

        rekening2.tampilkaninfo();

    }
}
