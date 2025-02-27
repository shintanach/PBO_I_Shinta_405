import java.time.LocalDate;
import java.util.Scanner;

public class Codelab {
    public static void main(String[] args) {
        String nama;
        char Jkelamin;
        int tahun;
        Scanner input = new Scanner(System.in);

        System.out.printf("Masukkan Nama : ");
        nama = input.nextLine();

        System.out.printf("Masukkan Jenis Kelamin : ");
        Jkelamin = input.next().charAt(0);

        System.out.printf("Masukkan Tahun Lahir : ");
        tahun = input.nextInt();

        int tahunskrng = LocalDate.now().getYear();
        int umur = tahunskrng - tahun;

        System.out.println("\nData Diri : ");
        System.out.println("Nama :  " + nama);
        if (Jkelamin == 'l' || Jkelamin == 'L'){
            System.out.println("Jenis Kelamin : Laki-laki");
        } else if (Jkelamin == 'p'||Jkelamin == 'P') {
            System.out.println("Jenis Kelamin : Perempuan ");
        }else {
            System.out.println("Inputan tidak valid");
        }
        System.out.printf("Umur : "+ umur);

    }
}