/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelCamera;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Camera implements Serializable{
    private String masp;
    private String tensp;
    private Date ngaynhap;
    private Double gia;
    private Double soluong;
    private Double Tongtien;
    
    

    public Camera() {
    }

    public Camera(String masp, String tensp, Date ngaynhap, Double gia, Double soluong, Double Tongtien) {
        this.masp = masp;
        this.tensp = tensp;
        this.ngaynhap = ngaynhap;
        this.gia = gia;
        this.soluong = soluong;
        this.Tongtien = Tongtien;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Double getSoluong() {
        return soluong;
    }

    public void setSoluong(Double soluong) {
        this.soluong = soluong;
    }

    public Double getTongtien() {
        return getGia()*getSoluong();
    }

    public void setTongtien(Double Tongtien) {
        this.Tongtien = Tongtien;
    }
    @Override
    public String toString(){
        return ""+getTongtien()+"";
    }
    

    
    

    
  
    
    
    
    
}
