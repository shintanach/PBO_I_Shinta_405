import java.util.Scanner;

public class RekeningBank {
    String nomorRek,namaPemilik;
    double saldo, saldoskrng;
    double setor, tarik;

    public void tampilkaninfo(){
        System.out.println("Nomor Rekening : "+ nomorRek);
        System.out.println("Nama Pemilik : "+ namaPemilik);
        System.out.printf("Saldo : Rp. %.2f%n", saldo );
    }
    public RekeningBank(String a,String b,double c){
       nomorRek = a;
       namaPemilik = b;
       saldo = c;
    }
    public void setoruang(){
        Scanner input = new Scanner(System.in);
       // System.out.print("Nominal yang ingin anda setorkan : ");
        System.out.printf(namaPemilik + " menyetor : ");
        setor = input.nextDouble();
        saldoskrng = setor + saldo;
        saldo = saldoskrng;

        System.out.printf("Saldo sekarang : Rp. %.2f%n", saldo);

    }
    public void tarikuang(){
        Scanner input = new Scanner(System.in);
       // System.out.print("Nominal yang ingin anda tarik : ");
        System.out.print(namaPemilik + " menarik : Rp. ");
        tarik = input.nextDouble();
        if (tarik > saldo){
            System.out.println("(Gagal, saldo tidak mencukupi)");
            System.out.printf("Saldo saat ini : Rp.%.2f%n",saldo);

        }else {
            System.out.println("Berhasil");
            saldo = saldo - tarik;
            System.out.printf("Saldo saat ini : Rp.%.2f%n",saldo);
        }

    }

}
