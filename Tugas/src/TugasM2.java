import java.util.Scanner;

class Adminn {
    String username, password;
    String username1 = "Admin405";
    String password1 = "2025";
    int i = 0;
    Scanner inputt = new Scanner(System.in);

    public void Admin1(){
        while (i < 3) {
            System.out.print("Masukkan username : ");
            username = inputt.nextLine();
            System.out.print("Masukkan password : ");
            password = inputt.nextLine();
            if (username.equals(username1) && password.equals(password1)) {
                System.out.println("Login berhasil");
                break;
            } else {
                System.out.println("Login Gagal! Username atau passwod salah.");
                i++;
            }
        }
        if (i == 3){
            System.out.println("Percobaan telah melebihi batas. Akun terblokir");

        }
    }
}

class Mahasiswaa{
    String nama,nim;
    String Nama ="shinta";
    String NIM = "405";
    int a = 0;
    Scanner input = new Scanner(System.in);

    public void dispayinfo(){
        System.out.println("Nama : " + Nama);
        System.out.println("NIM : " + NIM);
    }

    public void mahasiswa(){
        while (a < 3) {
            System.out.print("Masukkan Nama : ");
            nama = input.nextLine();
            System.out.print("Masukkan NIM : ");
            nim = input.nextLine();
            if (nama.equals(Nama) && nim.equals(NIM)) {
                System.out.println("Login berhasil");
                dispayinfo();
                break;
            } else {
                System.out.println("Login Gagal! Username atau passwod salah.");
                a++;
            }
        }
        if (a == 3){
            System.out.println("Percobaan telah melebihi batas. Akun terblokir");

        }
    }
}

public class TugasM2 {
    public static void main(String[] args) {
        int pilih;
        Scanner input1 = new Scanner(System.in);

        System.out.println("Pilih Login : ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.print("Masukkan Pilihan : ");
        pilih = input1.nextInt();

        if (pilih == 1){
            Adminn login = new Adminn();
            login.Admin1();
        } else if (pilih == 2) {
            Mahasiswaa Login = new Mahasiswaa();
            Login.mahasiswa();
        }else{
            System.out.println("Input tidak valid");
        }
    }
}
