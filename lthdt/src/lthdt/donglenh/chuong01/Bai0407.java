/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

/**
 *
 * @author FPT
 */
public class Bai0407 {
    public static void main(String[] args) {
        Shape htron =new Circle(5, 1, 2);
        //System.out.println("Chu Vi Cua Hinh Tron La " + htron.calcPerimeter());
        //System.out.println("Dien Tich Cua Hinh Tron La " + htron.calcArea());
        
        //dùng lop thua ke
        System.out.println(htron.toString());
        
        Shape hcn = new Rectangle(3, 15, 8, 5);
        //System.out.println("Chu Vi HCN " + hcn.calcPerimeter());
        //System.out.println("Dien Tich HCN " + hcn.calcArea());
        
        //dunglopthuake
        System.out.println(hcn);
        
    }
    
}
