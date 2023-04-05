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
public class HoaDon extends Camera implements Serializable{
    private String Mahoadon;
    private Date Ngayxuat;
    private String tenkh;

    public HoaDon() {
    }

    public HoaDon(String Mahoadon, Date Ngayxuat, String tenkh) {
        this.Mahoadon = Mahoadon;
        this.Ngayxuat = Ngayxuat;
        this.tenkh = tenkh;
    }

    public HoaDon(String Mahoadon, Date Ngayxuat, String tenkh, String masp, String tensp, Date ngaynhap, Double gia, Double soluong, Double Tongtien) {
        super(masp, tensp, ngaynhap, gia, soluong, Tongtien);
        this.Mahoadon = Mahoadon;
        this.Ngayxuat = Ngayxuat;
        this.tenkh = tenkh;
    }

    public String getMahoadon() {
        return Mahoadon;
    }

    public Date getNgayxuat() {
        return Ngayxuat;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setMahoadon(String Mahoadon) {
        this.Mahoadon = Mahoadon;
    }

    public void setNgayxuat(Date Ngayxuat) {
        this.Ngayxuat = Ngayxuat;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
    
    
    
}
