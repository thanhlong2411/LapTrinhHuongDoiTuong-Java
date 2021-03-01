/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

import java.util.Date;

/**
 *
 * @author FPT
 */
public class Person {
    private String Hoten;
    private int GioiTinh;
    private Date NgaySinh;

    public Person() {
    }

    public Person(String Hoten, int GioiTinh, Date NgaySinh) {
        this.Hoten = Hoten;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    
}
