/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong02.employeelogic;

 import java.util.Date;

/**
 *
 * @author FPT
 */
public class Student extends Person implements TaxInterface {
    private String Truonghoc;
    private String HocLuc;
    private double HocBong;

    public Student() {
    }

    public Student(String Truonghoc, String Hoten, int GioiTinh, Date NgaySinh) {
        super(Hoten, GioiTinh, NgaySinh);
        this.Truonghoc = Truonghoc;
    }

    public Student(String Truonghoc, String HocLuc,String Hoten, int GioiTinh, Date NgaySinh) {
        super(Hoten, GioiTinh, NgaySinh);
        this.Truonghoc = Truonghoc;
        this.HocLuc = HocLuc;
    }

    public String getHocLuc() {
        return HocLuc;
    }

    public void setHocLuc(String HocLuc) {
        this.HocLuc = HocLuc;
    }

    public double getHocBong() {
        return HocBong;
    }

    public void setHocBong(double HocBong) {
        this.HocBong = HocBong;
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

    @Override
    public String toString() {
        
        String Ketqua = super.toString();
        Ketqua += "Student{" + "Truonghoc=" + Truonghoc + ", HocLuc=" + HocLuc + ", HocBong=" + HocBong + '}';
        return Ketqua;
    }
    
    
    
    
    
    
    



    
    
    
}
