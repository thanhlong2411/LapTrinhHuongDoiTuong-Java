/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.coffeelogic;

import java.util.Comparator;

/**
 *
 * @author FPT
 */
public class ProductCompByName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return  o1.getName().compareToIgnoreCase(o2.getName());
    }
    
}
