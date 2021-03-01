/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.coffeelogic;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author FPT
 */
public class Manager extends Person {
    private  CoffeeShop[] shops;
    private double income;

    public Manager() {
        super();
    }

    public Manager(CoffeeShop[] shops, double income, String Hoten, int GioiTinh, Date NgaySinh) {
        super(Hoten, GioiTinh, NgaySinh);
        this.shops = shops;
        this.income = income;
    }

    public CoffeeShop[] getShops() {
        return shops;
    }

    public void setShops(CoffeeShop[] shops) {
        this.shops = shops;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        String ketqua = super.toString();
        ketqua +=  "Manager{" + "shops=" + Arrays.deepToString(shops) + ", income=" + income + '}';
        return ketqua;
    }
     
    
    
    
    
}
