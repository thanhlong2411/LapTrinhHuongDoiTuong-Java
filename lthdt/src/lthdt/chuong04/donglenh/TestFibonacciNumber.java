/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong04.donglenh;

import lthdt.chuong04.logic.FibonacciNumber;

/**
 *
 * @author FPT
 */
public class TestFibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println("so Fibonacci tai vi n = 15 la " + fn.CalcFibo(15));
        for(int i = 1; i <= 20; i++){
            System.out.print(fn.CalcFibo(i)+ ", ");
        }
    }
    
}
