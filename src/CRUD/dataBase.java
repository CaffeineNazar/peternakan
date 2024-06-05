/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author Hp
 */
public class dataBase {
    private String dataBaseName = "muhammadnazaruliman1_2210010269";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    public dataBase(){
        try{
           String location = "jdbc:mysql://localhost/"+dataBaseName;
           Class.forName("com.mysql.jdbc.Driver");
           
           connectionDB = DriverManager.getConnection(location, username, password);    
           System.out.println("Sistem Terkoneksi"); 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    /* DESA */
    public void simpanDesa(Integer id_desa, String nama_desa,String username, String password, Date date_created){
        try{
            String sql = "insert into desa (id_desa, nama_desa, username, password, date_created) value(?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_desa);
            perintah.setString(2, nama_desa);
            perintah.setString(3, username);
            perintah.setString(4, password);
            perintah.setDate(5, date_created);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahDesa(Integer id_desa, String nama_desa, String username, String password, String date_created){
        try{
            String sql = "update desa set nama_desa =?, username = ?, password = ?, date_created = ? where id_desa = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_desa);
            perintah.setString(2, username);
            perintah.setString(3, password);
            perintah.setString(4, date_created);
            perintah.setInt(5, id_desa);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusDesa(Integer id_desa, String nama_desa, String username, String password, String date_created){
        try{
            String sql = "delete from desa where id_desa = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_desa);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    /* DESA */
    
    /* PETERNAK */
    public void simpanPeternak(Integer id_peternak, Integer id_desa, String nama, String umur_peternak,String kelamin, 
            String pekerjaan, String alamat, Integer nik, String password, String date_created){
        try{
        String sql = "insert into peternak (id_peternak, id_desa, nama, umur_peternak, kelamin, pekerjaan, alamat,"
                + "nik, password, date_created) value(?,?,?,?,?,?,?,"
                + "?,?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql); 
        perintah.setInt(1, id_peternak);
        perintah.setInt(2, id_desa);
        perintah.setString(3, nama);
        perintah.setString(4, umur_peternak);
        perintah.setString(5, kelamin);
        perintah.setString(6, pekerjaan);
        perintah.setString(7, alamat);
        perintah.setInt(8, nik);
        perintah.setString(9, password);
        perintah.setString(10, date_created);
        perintah.executeUpdate();
        System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPeternak(Integer id_peternak, Integer id_desa, String nama, String umur_peternak,String kelamin, 
            String pekerjaan, String alamat, Integer nik, String password, String date_created){
        try{
            String sql = ("update peternak set id_desa = ?, nama =?, umur_peternak = ?, kelamin = ?, pekerjaan = ?, alamat = ?, nik = ?, password = ?, date_created = ? where id_peternak = ?");
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_desa);
            perintah.setString(2, nama);
            perintah.setString(3, umur_peternak);
            perintah.setString(4, kelamin);
            perintah.setString(5, pekerjaan);
            perintah.setString(6, alamat);
            perintah.setInt(7, nik);
            perintah.setString(8, password);
            perintah.setString(9, date_created);
            perintah.setInt(10, id_peternak);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPeternak(Integer id_peternak, Integer id_desa, String nama, String umur_peternak,String kelamin, 
            String pekerjaan, String alamat, Integer nik, String password, String date_created){
        try{
            String sql = ("delete from peternak where id_peternak = ?");
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_peternak);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    /* PETERNAK */
    
    /* TERNAK */
    public void simpanTernak(int id_ternak, int id_peternak, String jenis_ternak, String jantan_betina, String umur, String jml_beranak, String warna_bulu, String bulu_benang_lampe, String tanduk, String telinga_kiri, String telinga_kanan, String telinga_istimewa, String tata, String unyung,
    String gigir, String badan_bagKiri, String badan_bagKanan, String dada, String raja_ono, String bedis_kiri, String bedis_kanan, String buta_ate, String pakepit, String telutuk, String punggung, int status, String status_mutasi, Date date_created){
        try{
        String sql = "insert into ternak (id_ternak, id_peternak, jenis_ternak, jenis_betina, umur, jml_beternak, warna_bulu, bulu_benang_lampe, tanduk, telinga_kiri, telinga_kanan, telinga_istimewa, tata, unyung, gigir, badan_bagKiri, badan_bagKanan, dada, raja_ono, bedis_kiri, bedis_kanan, "
                + "buta_ate, pakepit, telutuk, punggung, status, status_mutasi, date_created) value(,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                + "?,?,?,?,?,?,?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, id_ternak);
        perintah.setInt(2, id_peternak);
        perintah.setString(3, jenis_ternak);
        perintah.setString(4, jenis_ternak);
        perintah.setString(5, jenis_ternak);
        perintah.setString(6, jenis_ternak);
        perintah.setString(7, jenis_ternak);
        perintah.setString(8, jenis_ternak);
        perintah.setString(9, jenis_ternak);
        perintah.setString(10, jenis_ternak);
        perintah.setString(11, jenis_ternak);
        perintah.setString(12, jenis_ternak);
        perintah.setString(13, jenis_ternak);
        perintah.setString(14, jenis_ternak);
        perintah.setString(15, jenis_ternak);
        perintah.setString(16, jenis_ternak);
        perintah.setString(17, jenis_ternak);
        perintah.setString(18, jenis_ternak);
        perintah.setString(19, jenis_ternak);
        perintah.setString(20, jenis_ternak);
        perintah.setString(21, jenis_ternak);
        perintah.setString(22, jenis_ternak);
        perintah.setString(23, jenis_ternak);
        perintah.setString(24, jenis_ternak);
        perintah.setString(25, jenis_ternak);
        perintah.setString(26, jenis_ternak);
        perintah.setString(27, jenis_ternak);
        perintah.setString(28, jenis_ternak);
        perintah.executeUpdate();
        System.out.println("Sistem Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
     
    }
    
    /* TERNAK */
    
    /* UPT */        
    public void simpanUpt(Integer id_upt, String username, String password){
        try{
            String sql = "insert into upt (id_upt, username, password) value(?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_upt);
            perintah.setString(2, username);
            perintah.setString(3, password);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahUpt(Integer id_upt, String username, String password){
        try{
            String sql = "update upt set username = ?, password = ? where id_upt = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, username);
            perintah.setString(2, password);
            perintah.setInt(3, id_upt);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusUpt(Integer id_Upt, String username, String password){
        try{
            String sql = "delete from upt where id_upt = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            
            perintah.setInt(1, id_Upt);
            perintah.executeUpdate();
            System.out.print("Data Berhasil Dihapus");
        }
        catch(Exception e){
           System.out.println(e.getMessage());
        }
    }
    /* UPT */
    
    /* PL */
    public void simpanPl(Integer id_pl, Integer id_upt, String nama_pl, String username, String password){
        try{
            String sql = "insert into pl (id_pl, id_upt, nama_pl, username, password) value (?,?,?,?,?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_pl);
            perintah.setInt(2, id_upt);
            perintah.setString(3, nama_pl);
            perintah.setString(4, username);
            perintah.setString(5, password);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahPl(Integer id_pl, Integer id_upt, String nama_pl, String username, String password){
        try{
            String sql = "update set id_upt = ?, username = ?, nama_pl = ?, password = ? where id_pl = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_upt);
            perintah.setString(2, username);
            perintah.setString(3, nama_pl);
            perintah.setString(4, password);
            perintah.setInt(5, id_pl);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusPl(Integer id_pl, Integer id_upt, String nama, String username, String password){
        try{
            String sql = "delete from pl where id_pl = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_pl);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    /* PL */
}
