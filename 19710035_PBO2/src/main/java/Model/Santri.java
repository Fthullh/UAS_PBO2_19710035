/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Fthullh_
 */
public class Santri {
    private int nis;
    private String nama_santri;
    private int tauhid;
    private int tasawuf;
    private int fiqh;
    private int hadits;
    private int nahwu;
    private int shorof;
    private int lugot;
    private int tafsir;
    private int jumlah_nilai;
    private int rata_rata;
    private String huruf;
    private String hasil;
 
    public Santri(){
}

    public Santri(int nis, String nama_santri) {
        this.nis = nis;
        this.nama_santri = nama_santri;
    }

    public Santri(int nis, String nama_santri, int tauhid, int tasawuf, int fiqh, int hadits, int nahwu, int shorof, int lugot, int tafsir, int jumlah_nilai, int rata_rata, String huruf, String hasil) {
        this.nis = nis;
        this.nama_santri = nama_santri;
        this.tauhid = tauhid;
        this.tasawuf = tasawuf;
        this.fiqh = fiqh;
        this.hadits = hadits;
        this.nahwu = nahwu;
        this.shorof = shorof;
        this.lugot = lugot;
        this.tafsir = tafsir;
        this.jumlah_nilai = jumlah_nilai;
        this.rata_rata = rata_rata;
        this.huruf = huruf;
        this.hasil = hasil;
    }

    
    

    public int getNis() {
        return nis;
    }

    public void setNis(int nis) {
        this.nis = nis;
    }

    public String getNama_santri() {
        return nama_santri;
    }

    public void setNama_santri(String nama_santri) {
        this.nama_santri = nama_santri;
    }

    public int getTauhid() {
        return tauhid;
    }

    public void setTauhid(int tauhid) {
        this.tauhid = tauhid;
    }

    public int getTasawuf() {
        return tasawuf;
    }

    public void setTasawuf(int tasawuf) {
        this.tasawuf = tasawuf;
    }

    public int getFiqh() {
        return fiqh;
    }

    public void setFiqh(int fiqh) {
        this.fiqh = fiqh;
    }

    public int getHadits() {
        return hadits;
    }

    public void setHadits(int hadits) {
        this.hadits = hadits;
    }

    public int getNahwu() {
        return nahwu;
    }

    public void setNahwu(int nahwu) {
        this.nahwu = nahwu;
    }

    public int getShorof() {
        return shorof;
    }

    public void setShorof(int shorof) {
        this.shorof = shorof;
    }

    public int getLugot() {
        return lugot;
    }

    public void setLugot(int lugot) {
        this.lugot = lugot;
    }

    public int getTafsir() {
        return tafsir;
    }

    public void setTafsir(int tafsir) {
        this.tafsir = tafsir;
    }

    public int getJumlah_nilai() {
        return jumlah_nilai;
    }

    public void setJumlah_nilai(int jumlah_nilai) {
        this.jumlah_nilai = jumlah_nilai;
    }

    public int getRata_rata() {
        return rata_rata;
    }

    public void setRata_rata(int rata_rata) {
        this.rata_rata = rata_rata;
    }

    public String getHuruf() {
        return huruf;
    }

    public void setHuruf(String huruf) {
        this.huruf = huruf;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    
    
    
}
