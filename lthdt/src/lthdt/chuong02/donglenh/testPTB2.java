/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong02.donglenh;

import lthdt.chuong02.logiclayer.PhuongTrinhBac2;

/**
 *
 * @author FPT
 */
public class testPTB2 {
    public static void main(String[] args) {
        System.out.println("Giai Phuong Trinh Bac 2");
        PhuongTrinhBac2 obj = new PhuongTrinhBac2(-2, -4, 2);
        obj.GiaiPhuongTrinh();
        System.out.println(obj.toString());
    }
    
}
