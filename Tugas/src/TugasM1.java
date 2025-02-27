import java.util.Scanner;

public class TugasM1 {
    public static void main(String[] args) {
        String username, password;
        String nama, nim;
        String username1 = "Admin405";
        String password1 = "password405";
        String Nama = "Shinta Alya Nachasyi";
        String NIM = "202410370110405";
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        int i = 0;


        System.out.println("Pilih Login : ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.printf("Masukkan Pilihan : ");
        pilihan = input.nextInt();

        input.nextLine();

        if (pilihan == 1){
            while (i < 3) {
                System.out.printf("Masukkan Username : ");
                username = input.nextLine();
                System.out.printf("Masukkan Password : ");
                password = input.nextLine();
                if (username.equals(username1) && password.equals(password1)) {
                    System.out.printf("Login Admin Berhasil! ");
                    break;
                }
                System.out.println("Login Gagal! Username atau passwod salah.");
                i++;
            }
            if (i == 3){
                System.out.println("Percobaan telah melebihi batas. Akun terblokir");

            }
        } else if (pilihan == 2) {
            while (i < 3) {
                System.out.printf("Masukkan Nama : ");
                nama = input.nextLine();
                System.out.printf("Masukkan NIM : ");
                nim = input.nextLine();
                if (nama.equals(Nama) && nim.equals(NIM)) {
                    System.out.println("Login Mahasiswa Berhasil! ");
                    System.out.println("Nama : "+ nama);
                    System.out.println("NIM  : "+ nim);
                    break;
                }
                System.out.println("Login Gagal! Username atau passwod salah.");
                i++;
            }
            if (i == 3){
                System.out.println("Percobaan telah melebihi batas. Akun terblokir");

            }

        }
    }
}
