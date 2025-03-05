import java.time.LocalDate;
import java.util.Scanner;

public class Codelab {
    public static void main(String[] args) {
        String nama;
        char Jkelamin;
        int tahun;
        Scanner input = new Scanner(System.in); // Membuat objek 'input' dari kelas Scanner

        System.out.printf("Masukkan Nama : ");
        nama = input.nextLine();  // Membaca input nama pengguna sebagai string.

        System.out.printf("Masukkan Jenis Kelamin : ");
        Jkelamin = input.next().charAt(0); // Membaca satu karakter yang dimasukkan pengguna untuk jenis kelamin.

        System.out.printf("Masukkan Tahun Lahir : ");
        tahun = input.nextInt();

        int tahunskrng = LocalDate.now().getYear(); // Mengambil tahun saat ini menggunakan LocalDate
        int umur = tahunskrng - tahun; // menghitung umur

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