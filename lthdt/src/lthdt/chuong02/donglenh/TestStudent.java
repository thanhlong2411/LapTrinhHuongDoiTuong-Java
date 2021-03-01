/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong02.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lthdt.chuong02.employeelogic.Student;

/**
 *
 * @author FPT
 */
public class TestStudent {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "12-12-1999";
        Date NgaySinh = df.parse(input);
        Student obj = new Student(" Dai Hoc Hue ", " Xuat Sac ", "Nguyen Van A", 1, NgaySinh);
        
        switch(obj.getHocLuc()){
             case "Xuat Sac":
                obj.setHocBong(1000);
                break;
            case"Gioi":
                obj.setHocBong(885.5);
                break;
            default:
                obj.setHocBong(1000);
                break;
    }
        System.out.println(obj);
    }
    
}
