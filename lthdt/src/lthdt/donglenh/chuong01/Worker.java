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
public class Worker extends Person implements TaxInterface {
    private String Congty;

    public Worker() {
    }

    public Worker(String Congty, String Hoten, int GioiTinh, Date NgaySinh) {
        super(Hoten, GioiTinh, NgaySinh);
        this.Congty = Congty;
    }

    public String getCongty() {
        return Congty;
    }

    public void setCongty(String Congty) {
        this.Congty = Congty;
    }

    
    //bao08 interface
    @Override
    public double calcTax(double income) {
        return (0.04*income);

    }
    
    
    
    
}
