/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class xuatnhap {
    public static void main(String[] args){
        boolean flag =true;
        int a = 15;
        byte b = 2;
        double c = 12.6;
        float d = 4.5f;
        String s = "Hello word";
        char ch ='A';
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay Nhap Ho Ten: ");
        String hoten = sc.nextLine();
        System.out.println("Ban Da Nhap Ho ten la " + hoten);
        
        System.out.println("Hay Nhap Vao Mot So Nguyen" );
        String input = sc.nextLine();
        a = Integer.parseInt(input);
        System.out.println("So nguyen ma ban da nhap la " + a);
        
        System.out.println("Hay Nhap Vao Mot So Thuc" );
        input = sc.nextLine();
        c = Double.parseDouble(input);
        System.out.println("So thuc ma ban da nhap la " + c);
    }
    
}
