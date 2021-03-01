/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong03.coffeelogic.CoffeeShop;
import lthdt.chuong03.coffeelogic.Manager;

/**
 *
 * @author FPT
 */
public class TestCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[]{ new CoffeeShop("Kha Coffee","2 Nguyen Hue" ),
                                           new CoffeeShop("White Garden", "4 Nguyen Hue" ),
                                           new CoffeeShop("Hoa Truc Vien", "3 Nguyen Hue")};
        Manager[] managers = new Manager[]{ 
                             new Manager(a, 0, "Le Thi A", 0, df.parse("12-12-1999")),
                             new Manager(new CoffeeShop[]{
                              new CoffeeShop("Hoang Hac", "12 Nguyen Hue")
                                      },
                                     2000, "Nguyen Van B", 1, df.parse("12-12-2000"))
                             };
        
        System.out.println(Arrays.toString(managers));
        
    } 
    
}
