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
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CameraFR {

    List<Camera> ls = new ArrayList<>();

    public int add(Camera cr) {
        ls.add(cr);
        return 1;

    }

    public List<Camera> getAllCamera() {
        return ls;
    }

    //table 
    public int delCameraId(String masp) {
        for (Camera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(masp)) {
                ls.remove(masp);
            }
            return 1;
        }
        return -1;
    }

    public Camera getCameraId(String id) {
        for (Camera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(id)) {
                return cr;
            }
        }
        return null;
    }

    //edit 
    public int edit(Camera c) {
        for (Camera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(c.getMasp())) {
                cr.setMasp(c.getMasp());
                cr.setTensp(c.getTensp());
                cr.setNgaynhap(c.getNgaynhap());
                cr.setGia(c.getGia());
                cr.setSoluong(c.getSoluong());
                return 1;
            }
        }
        return -1;
    }

    //delete
    public int delCamera(String masp) {
        Camera c = getCameraId(masp);
        if (c != null) {
            ls.remove(c);
            return 1;

        }
        return -1;

    }

    //timkiem
    public Camera find(String masp, String tensp) {
        for (Camera cr : ls) {
            if (cr.getMasp().equalsIgnoreCase(masp) || cr.getTensp().equalsIgnoreCase(tensp)) {
                return cr;
            }
        }
        return null;
    }

    //Sap xep a-z
    public void sortaz() {
        Collections.sort(ls, new Comparator<Camera>() {
            @Override
            public int compare(Camera o1, Camera o2) {
                return o1.getTensp().compareTo(o2.getTensp());
            }
        });

    }
    //sap xep z-a

    public void sortza() {
        Collections.sort(ls, new Comparator<Camera>() {
            @Override
            public int compare(Camera o1, Camera o2) {
                return o2.getTensp().compareTo(o1.getTensp());
            }
        });

    }

    //read file
    public void readfile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("data.dat");
            ois = new ObjectInputStream(fis);
            ls = (List<Camera>) ois.readObject();
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
            fos = new FileOutputStream("data.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
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
