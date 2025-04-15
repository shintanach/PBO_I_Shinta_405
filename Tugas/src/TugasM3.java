import java.util.Scanner;

class User{
    private String nama;
    private String nim;
    static Scanner input1 = new Scanner(System.in);

    public User(String nama,String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void login(){
    System.out.println("Login" + getNama());
    }

    public void displayinfo(){
        System.out.println("info" );
    }
}

class Admin extends User{
    int i = 0;
    String user,pass;

    Admin(String username1,String password1) {
        super(username1,password1);
    }

    @Override
    public void login() {
        while (i < 3) {
            System.out.print("Masukkan username : ");
            user = input1.nextLine();
            System.out.print("Masukkan password : ");
            pass = input1.nextLine();

            if (user.equals(getNama()) && pass.equals(getNim())) {
                displayinfo();
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

    @Override
    public void displayinfo() {
        System.out.println("Login berhasil.");
    }
}

class Mahasiswa extends User {
    int a = 0;
    String Nama,NIM;

    Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login(){
        while (a < 3) {
            System.out.print("Masukkan Nama : ");
             Nama = input1.nextLine();
            System.out.print("Masukkan NIM : ");
              NIM = input1.nextLine();
            if (Nama.equals(getNama()) && NIM.equals(getNim())) {
                System.out.println("Login berhasil");
                displayinfo();
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

    @Override
    public void displayinfo(){
        System.out.println("Nama : " + getNama());
        System.out.println("NIM : " + getNim());
    }

}

public class TugasM3 {
    public static void main(String[] args) {
        int pilih;
        Admin admin1 = new Admin("Admin","2025");
        Mahasiswa mhs = new Mahasiswa("Shinta","405");

        System.out.println("Pilih Login : ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.print("Masukkan Pilihan : ");
        pilih = User.input1.nextInt();
        User.input1.nextLine();

        if (pilih == 1){
            admin1.login();
        } else if (pilih == 2) {
            mhs.login();
        }else{
            System.out.println("Input tidak valid");
        }
    }

}
