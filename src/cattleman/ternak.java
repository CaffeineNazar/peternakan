/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cattleman;

/**
 *
 * @author Hp
 */
public class ternak extends peternak{
    Integer idTernak, idPeternak, status;
    String jenisTernak, jantanBetina,umur, jmlBeranak, warnaBulu, buluBenangLampe,tanduk, telingaKiri, telingaKanan,
            telingaIstimewa, tata, unyung, gigi, badanBagKiri, badanBagKanan, dada, rajaOno, bedisKiri, bedisKanan,
            butaAte, pakepit, telutuk, punggung, statusMutasi, dateCreated;
    
    public ternak(){}
    
    public void inputIdTernak (Integer idTernak){
        this.idTernak = idTernak;
    }
    
    public int getIdTernak(){
        return this.idTernak;
    }
    
    public void inputStatus(Integer status){
        this.status = status;
    }
    
    public int getStatus(){
        return this.status;
    }
    
    public void inputIdPeternak(Integer idPeternak){
        this.idPeternak = idPeternak;
    }
    
    public Integer getIdPeternak(){
        return this.idPeternak;
    }
    
    public void inputJenisTernak(String jenisTernak){
        this.jenisTernak = jenisTernak;
    }
    
    public String getJenisTernak(){
        return this.jenisTernak;
    }
    
    public void inputJantanBetina(String jantanBetina){
        this.jantanBetina = jantanBetina;
    }
    
    public String getJantanBetina(){
        return this.jantanBetina;
    }
    
    public void inputUmur(String umur){
        this.umur = umur;
    }
    
    public String getUmur(){
        return this.umur;
    }
    
    public void inputjmlBeranak(String jmlBeranak){
        this.jmlBeranak = jmlBeranak;
    }
    
    public String getJmlBeranak(){
        return this.jmlBeranak;
    }
    
    public void inputWarnaBulu(String warnaBulu){
        this.warnaBulu = warnaBulu;
    }
    
    public String getWarnaBulu(){
        return this.warnaBulu;
    }
    
    public void inputBuluBenangLampe(String buluBenangLampe){
        this.buluBenangLampe = buluBenangLampe;
    }
    
    public String getBuluBenangLampe(){
        return this.buluBenangLampe;
    }
    
    public void inputTanduk(String tanduk){
        this.tanduk = tanduk;
    }
    
    public String getTanduk(){
        return this.tanduk;
    }
    
    public void inputTelingaKiri(String telingaKiri){
        this.telingaKiri = telingaKiri;
    }
    
    public String getTelingaKiri(){
        return this.telingaKiri;
    }
    
    public void inputTelingaKanan(String telingaKanan){
        this.telingaKanan = telingaKanan;
    }
    
    public String getTelingaKanan(){
        return this.telingaKanan;
    }
    
    public void inputTelingaIstimewa(String telingaIstimewa){
        this.telingaIstimewa = telingaIstimewa;
    }
    
    public String getTelingaIstimewa(){
        return this.telingaIstimewa;
    }
    
    public void inputTata(String tata){
        this.tata = tata;
    }
    
    public String getTata(){
        return this.tata;
    }
    
    public void inputUnyung(String unyung){
        this.unyung = unyung;
    }
    
    public String getUnyung(){
        return this.unyung;
    }
    
    public void inputGigi(String gigi){
        this.gigi = gigi;
    }
    
    public String getgigi(){
        return this.gigi;
    }
    
    public void inputBadBagKiri(String badanBagKiri){
        this.badanBagKiri = badanBagKiri;
    }
    
    public String getBadBagKiri(){
        return this.badanBagKiri;
    }
    
    public void inputBadBagKanan(String badanBagkanan){
        this.badanBagKanan = badanBagkanan;
    }
    
    public String getBadBagKanan(){
        return this.badanBagKanan;
    }
    
    public void inputDada(String dada){
        this.dada = dada;
    }
    
    public String getDada(){
        return this.dada;
    }
    
    public void inputRajaOno(String rajaOno){
        this.rajaOno = rajaOno;
    }
    
    public String getRajaOno(){
        return this.rajaOno;
    }
    
    public void inputBedKiri(String bedisKiri){
        this.bedisKiri = bedisKiri;
    }
    
    public String getBedKiri(){
        return this.bedisKiri;
    }
    
    public void inputBedKanan(String bedisKanan){
        this.bedisKanan = bedisKanan;
    }
    
    public String getBedKanan(){
        return this.bedisKanan;
    }
    
    public void inputButaAte(String butaAte){
        this.butaAte = butaAte;
    }
    
    public String getButaAte(){
        return this.butaAte;
    }
    
    public void inputPakepit(String pakepit){
        this.pakepit = pakepit;
    }
    
    public String getPakepit(){
        return this.pakepit;
    }
    
    public void inputTelutuk(String telutuk){
        this.telutuk = telutuk;
    }
    
    public String getTelutuk(){
        return this.telutuk;
    }
    
    public void inputPunggung(String punggung){
        this.punggung = punggung;
    }
    
    public String getpunggung(){
        return this.punggung;
    }
    
    public void inputStatusMutasi(String statusMutasi){
        this.statusMutasi = statusMutasi;
    }
    
    public String getStatusMutasi(){
        return this.statusMutasi;
    }
    
    public void inputDateCreatedTr(String dateCreated){
        this.dateCreated = dateCreated;
    }
    
    public String getDateCreatedtr(){
        return this.dateCreated;
    }
}
