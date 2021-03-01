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
public class Student extends Person implements TaxInterface {
    private String Truonghoc;

    public Student() {
    }

    public Student(String Truonghoc, String Hoten, int GioiTinh, Date NgaySinh) {
        super(Hoten, GioiTinh, NgaySinh);
        this.Truonghoc = Truonghoc;
    }

    public String getTruonghoc() {
        return Truonghoc;
    }

    public void setTruonghoc(String Truonghoc) {
        this.Truonghoc = Truonghoc;
    }
    
    //bao08 interface
    @Override
    public double calcTax(double income) {
        double tax;
        tax = 0.01*income;
        return tax;
    }
    
    

    public void getTruonghoc(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object setNgaySinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
