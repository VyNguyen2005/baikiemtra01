/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De01;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class CauThu {
    public int soao;
    public String hoten;
    public int namsinh;
    public int luongcung;
    public int tienthuong;
    public int tienphat;

    public CauThu(int soao, String hoten, int namsinh, int luongcung, int tienthuong, int tienphat) {
        this.soao = soao;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.luongcung = luongcung;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
    }

    public int getSoao() {
        return soao;
    }

    public void setSoao(int soao) {
        this.soao = soao;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }

    public int getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(int tienthuong) {
        this.tienthuong = tienthuong;
    }

    public int getTienphat() {
        return tienphat;
    }

    public void setTienphat(int tienphat) {
        this.tienphat = tienphat;
    }
    public int LuongThucLanh(){
        return (getLuongcung() + getTienthuong()) - getTienphat();
    }

    @Override
    public String toString() {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        return "CauThu{" + "soao=" + soao + ", hoten=" + hoten + ", tuoi=" + (year - namsinh) + ", luongthuclanh=" + LuongThucLanh() + '}';
    }
    
}
