/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package berternak;
import cattleman.*;
import CRUD.dataBase;
import java.util.Scanner;
import java.sql.Date;

/**
 *
 * @author Hp
 */
public class Berternak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        dataBase dbConnect = new dataBase();
        
        /* TABEL DESA */
        Date date_created = Date.valueOf("2020-06-04");
//        dbConnect.simpanDesa(1, "Panyiuran", "Nazar", "300", date_created);
//        dbConnect.ubahDesa(1, "Alabio", "Nazarul", "3004", "2024-08-08");
//        dbConnect.hapusDesa(1, "", "", "", "");
        
        /* TABEL PETERNAK */
//        dbConnect.simpanPeternak(2, 1, "Nazar", "20", "laki-laki", "Mahasiswa", "Alabio", 630803321, "3004", "2024-09-14");
//        dbConnect.ubahPeternak(2, 1, "Arul", "20", "laki-laki", "Farmer", "Panyiuran", 630803321, "5003", "2024-12-12");
//        dbConnect.hapusPeternak(2, 0, "", "", "", "", "", 0, "", "");

        /* TABEL TERNAK */
        Date Ternak = Date.valueOf("2020-12-30");
        dbConnect.simpanTernak(1, 4, "mamalia", "jantan", "4 tahun", "2", "coklat", "lampe", "sedang", "bersih", "bersih", "tidak ada", "ada", "bagus", "lengkap", "bagus", "bagus", "bagus", "bukan", "bagus", "bagus", "tidak ada", "tidak", "bagus", "bagus", 3, "tidak ada", Ternak);
        
        /* TABEL UPT */
//        dbConnect.simpanUpt(221001269, "Muhammad-Nazarul-Iman", "123");
//        dbConnect.ubahUpt(221001269, "nazar", "345");
//        dbConnect.hapusUpt(221001269, "", "");

        /* TABEL PL */
//        dbConnect.simpanPl(30,221001269, "ahmad", "amat", "3284");
//        dbConnect.ubahPl(11, 221001299, "abdul", "akat", "3007");
//        dbConnect.hapusPl(30,0 , "", "", "");



//        pl me = new pl();
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Masukkan Id UPT Anda : ");
//        me.inputIdUpt(input.nextLine());
//        
//        System.out.print("Masukkan Username Anda : ");
//        me.inputUsernameUpt(input.nextLine());
//        
//        System.out.print("Masukkan Password Anda : ");
//        me.inputPasswordUpt(input.nextLine());
//        
//        System.out.print("Masukkan Id Pl Anda : ");
//        me.inputIdPl(input.nextLine());
//        
//        System.out.print("Masukkan username Anda : ");
//        me.inputUsernamePl(input.nextLine());
//        
//        System.out.print("Masukkan nama Anda : ");
//        me.inputNamaPl(input.nextLine());
//        
//        System.out.print("Masukkan Password Anda : ");
//        me.inputPasswordPl(input.nextLine());
//        
//        System.out.println("===================================");
//        System.out.print("Anda berhasil login!!!"+me.getUsernamePl());
    }
    
}
