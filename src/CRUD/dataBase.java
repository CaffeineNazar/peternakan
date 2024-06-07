/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;

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
    
    public void dataDesa(){
        try {
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from desa ORDER BY id_desa ASC");
            while(baris.next()){
                System.out.println(baris.getInt("id_desa")+" | "+
                        baris.getString("nama_desa")+" | "+
                        baris.getString("username")+" | "+
                        baris.getString("password")+" | "+
                        baris.getString("date_created"));
            }
        } 
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void cariDesa(Integer paramidDesa){
        try {
            String sql = "select * from desa where id_desa = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, paramidDesa);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("id : "+data.getInt("id_desa"));
                System.out.println("desa "+data.getString("nama_desa"));
                System.out.println("username : "+data.getString("username"));
                System.out.println("password : "+data.getString("password"));
                System.out.println("date created : "+data.getString("date_created"));
            }
        } 
        catch (Exception e) {
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
    
    public void dataPeternak(){
        try {
          Statement stmt = connectionDB.createStatement();
          ResultSet baris = stmt.executeQuery("select * from peternak ORDER BY id_peternak ASC");
          while(baris.next()){
              System.out.println(baris.getInt("id_peternak") +" | "+
                      baris.getInt("id_desa")+" | "+
                      baris.getString("nama")+" | "+
                      baris.getString("umur_peternak")+" | "+
                      baris.getString("kelamin")+" | "+
                      baris.getString("pekerjaan")+" | "+
                      baris.getString("alamat")+" | "+
                      baris.getInt("nik")+" | "+
                      baris.getString("password")+" | "+
                      baris.getString("date_created"));
          }
        } 
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void cariPeternak(Integer paramIdPeternak){
        try {
            String sql = "select * from peternak where id_peternak = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, paramIdPeternak);
            ResultSet data = perintah.executeQuery();
            while (data.next()){
                System.out.println("id peternak : "+data.getInt("id_peternak"));
                System.out.println("id_desa : "+data.getInt("id_desa"));
                System.out.println("nama : "+data.getString("nama"));
                System.out.println("umur : "+data.getString("umur_peternak"));
                System.out.println("kelamin : "+data.getString("kelamin"));
                System.out.println("pekerjaan : "+data.getString("pekerjaan"));
                System.out.println("alamat : "+data.getString("alamat"));
                System.out.println("nik : "+data.getInt("nik"));
                System.out.println("password : "+data.getString("password"));
                System.out.println("date created : "+data.getString("date_created"));
            }
        } 
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    /* PETERNAK */
    
    /* TERNAK */
    public void simpanTernak(int id_ternak, int id_peternak, String jenis_ternak, String jantan_betina, String umur, String jml_beranak, String warna_bulu, String bulu_benang_lampe, String tanduk, String telinga_kiri, String telinga_kanan, String telinga_istimewa, String tata, String unyung,
    String gigi, String badan_bagKiri, String badan_bagKanan, String dada, String raja_ono, String bedis_kiri, String bedis_kanan, String buta_ate, String pakepit, String telutuk, String punggung, int status, String status_mutasi, Date date_created){
        try{
        String sql = "insert into ternak (id_ternak, id_peternak, jenis_ternak, jantan_betina, umur, jml_beranak, warna_bulu, bulu_benang_lampe, tanduk, telinga_kiri, telinga_kanan, telinga_istimewa, tata, unyung, gigi, badan_bagKiri, badan_bagKanan, dada, raja_ono, bedis_kiri, bedis_kanan, buta_ate, pakepit, telutuk, punggung, status, status_mutasi, date_created) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, id_ternak);
        perintah.setInt(2, id_peternak);
        perintah.setString(3, jenis_ternak);
        perintah.setString(4, jantan_betina);
        perintah.setString(5, umur);
        perintah.setString(6, jml_beranak);
        perintah.setString(7, warna_bulu);
        perintah.setString(8, bulu_benang_lampe);
        perintah.setString(9, tanduk);
        perintah.setString(10, telinga_kiri);
        perintah.setString(11, telinga_kanan);
        perintah.setString(12, telinga_istimewa);
        perintah.setString(13, tata);
        perintah.setString(14, unyung);
        perintah.setString(15, gigi);
        perintah.setString(16, badan_bagKiri);
        perintah.setString(17, badan_bagKanan);
        perintah.setString(18, dada);
        perintah.setString(19, raja_ono);
        perintah.setString(20, bedis_kiri);
        perintah.setString(21, bedis_kanan);
        perintah.setString(22, buta_ate);
        perintah.setString(23, pakepit);
        perintah.setString(24, telutuk);
        perintah.setString(25, punggung);
        perintah.setInt(26, status);
        perintah.setString(27, status_mutasi);
        perintah.setDate(28, date_created);
        perintah.executeUpdate();
        System.out.println("Sistem Berhasil Disimpan");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void updateTernak(int id_ternak, int id_peternak, String jenis_ternak, String jantan_betina, String umur, String jml_beranak, String warna_bulu, String bulu_benang_lampe, String tanduk, String telinga_kiri, String telinga_kanan, String telinga_istimewa, String tata, String unyung,
    String gigi, String badan_bagKiri, String badan_bagKanan, String dada, String raja_ono, String bedis_kiri, String bedis_kanan, String buta_ate, String pakepit, String telutuk, String punggung, int status, String status_mutasi, Date date_created){
        try{
            String sql = "update ternak set id_peternak = ?, jenis_ternak = ?, jantan_betina = ?, umur = ?, jml_beternak = ?, warna_bulu = ?, bulu_benang_lampe = ?, tanduk = ?, telinga_kiri = ?, telinga_kanan = ?, telinga_istimewa = ?, tata = ?, unyung = ?, gigi = ?, badan_bagKiri = ?, badan_bagKanan = ?, dada = ?, raja_ono = ?, bedis_kiri = ?, bedis_kanan = ?, buta_ate = ?, pakepit = ?, telutuk = ?, punggung = ?, status = ?, status_mutasi = ?, date_created = ? where id_ternak = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_peternak);
            perintah.setString(2, jenis_ternak);
            perintah.setString(3, jantan_betina);
            perintah.setString(4, umur);
            perintah.setString(5, jml_beranak);
            perintah.setString(6, warna_bulu);
            perintah.setString(7, bulu_benang_lampe);
            perintah.setString(8, tanduk);
            perintah.setString(9, telinga_kiri);
            perintah.setString(10, telinga_kanan);
            perintah.setString(11, telinga_istimewa);
            perintah.setString(12, tata);
            perintah.setString(13, unyung);
            perintah.setString(14, gigi);
            perintah.setString(15, badan_bagKiri);
            perintah.setString(16, badan_bagKanan);
            perintah.setString(17, dada);
            perintah.setString(18, raja_ono);
            perintah.setString(19, bedis_kiri);
            perintah.setString(20, bedis_kanan);
            perintah.setString(21, buta_ate);
            perintah.setString(22, pakepit);
            perintah.setString(23, telutuk);
            perintah.setString(24, punggung);
            perintah.setInt(25, status);
            perintah.setString(26, status_mutasi);
            perintah.setDate(27, date_created);
            perintah.setInt(28, id_ternak);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diupdate");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTernak(int id_ternak, int id_peternak, String jenis_ternak, String jantan_betina, String umur, String jml_beranak, String warna_bulu, String bulu_benang_lampe, String tanduk, String telinga_kiri, String telinga_kanan, String telinga_istimewa, String tata, String unyung,
    String gigi, String badan_bagKiri, String badan_bagKanan, String dada, String raja_ono, String bedis_kiri, String bedis_kanan, String buta_ate, String pakepit, String telutuk, String punggung, int status, String status_mutasi, Date date_created){
        try {
            String sql = "delete form ternak where id_ternak = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, id_ternak);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Dihapus");
        } 
        catch (Exception e) {
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
    
    public void dataUpt(){
        try{
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from upt ORDER BY id_upt ASC");
            while(baris.next()){
                System.out.println(baris.getInt("id_upt")+" | "+
                        baris.getString("username")+" | "+
                        baris.getString("Password"));
            }
        }
        catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public void cariUpt(Integer paramid_upt){ 
        try{
            String sql = "Select * from upt where id_upt = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, paramid_upt);
            ResultSet data = perintah.executeQuery();
            while (data.next()){
                System.out.println("id upt : "+data.getInt("id_upt"));
                System.out.println("username : "+data.getString("username"));
                System.out.println("password : "+data.getString("password"));
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
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
    
    public void dataPl(){
        try {
            Statement stmt = connectionDB.createStatement();
            ResultSet baris = stmt.executeQuery("select * from pl ORDER BY id_pl ASC");
            while(baris.next()){
                System.out.println(baris.getInt("id_pl")+" | "+
                        baris.getInt("id_upt")+" | "+
                        baris.getString("nama_pl")+" | "+
                        baris.getString("username")+" | "+
                        baris.getString("password"));
            }
        } 
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void cariPl(Integer paramidPl){
        try {
            String sql = "select * from pl where id_pl = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setInt(1, paramidPl);
            ResultSet data = perintah.executeQuery();
            while(data.next()){
                System.out.println("id pl : "+data.getInt("id_pl"));
                System.out.println("id upt : "+data.getInt("id_upt"));
                System.out.println("nama : "+data.getString("nama_pl"));
                System.out.println("username : "+data.getString("username"));
                System.out.println("Password : "+data.getString("password"));
            }
        } 
        catch (Exception e) {
            System.err.println("Data Berhasil Dihapus");
        }
    }
    /* PL */
}
