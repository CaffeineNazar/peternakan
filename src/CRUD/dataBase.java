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
    private String dataBaseName = "2210010269_muhammadnazaruliman";
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
    
    public void ubahDesa(Integer id_desa, String nama_desa, String username, String password, Date date_created){
        try{
            String sql = "update desa set nama_desa =?, username = ?, password = ?, date_created = ? where id_desa = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_desa);
            perintah.setString(2, username);
            perintah.setString(3, password);
            perintah.setDate(4, date_created);
            perintah.setInt(5, id_desa);
            perintah.executeUpdate();
            System.out.println("Data Berhasil Diubah");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusDesa(Integer id_desa){
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
    
    public void hapusPeternak(Integer id_peternak){
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
    
    public void hapusUpt(Integer id_Upt){
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
    
    public void hapusPl(Integer id_pl){
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
