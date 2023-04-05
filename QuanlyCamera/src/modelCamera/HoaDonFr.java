/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelCamera;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonFr {
    List<HoaDon> lhd=new ArrayList<>();
    
    public int addhd(HoaDon hd){
        lhd.add(hd);
        return 1;
    }
    
    public List<HoaDon> getallHoaDon(){
        return lhd;
    }
    
    public int delHoaDon(String mahd){
        for (HoaDon hd : lhd) {
            if(hd.getMahoadon().equalsIgnoreCase(mahd)){
                lhd.remove(mahd);
            }
            return 1;
        }
        return -1;
    }
    //
    public HoaDon getHoaDonid(String id){
        for (HoaDon hd : lhd) {
            if(hd.getMahoadon().equalsIgnoreCase(id)){
                return hd;
            }
            
        }return null;
    }
    
    public int edit(HoaDon hd) {
        for (HoaDon hdd : lhd) {
            if (hdd.getMahoadon().equalsIgnoreCase(hd.getMahoadon())) {
                hdd.setMahoadon(hd.getMahoadon());
                hdd.setNgaynhap(hd.getNgaynhap());
                hdd.setTenkh(hd.getTenkh());
                hdd.setTensp(hd.getTensp());
                hdd.setGia(hd.getGia());
                hdd.setSoluong(hd.getSoluong());
                return 1;
            }
        }
        return -1;
    }
    
    public int delhd(String mahd) {
        HoaDon h = getHoaDonid(mahd);
        if (h != null) {
            lhd.remove(h);
            return 1;

        }
        return -1;

    }
    
    public HoaDon find(String mahd){
        for (HoaDon h : lhd) {
            if(h.getMahoadon().equalsIgnoreCase(mahd)){
                return h;
            }
            
        }return null;
    }

    public void sortaz() {
        Collections.sort(lhd, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o1.getTensp().compareTo(o2.getTensp());
            }           
        });

    }
    
    public void sortza() {
        Collections.sort(lhd, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return o2.getTensp().compareTo(o1.getTensp());
            }           
        });

    }
    
     public void readfile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("data1.dat");
            ois = new ObjectInputStream(fis);
            lhd = (List<HoaDon>) ois.readObject();
        } catch (FileNotFoundException e) {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null && fis != null) {
                    fis.close();
                    ois.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    //write file

    public void writefile() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("data1.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lhd);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
