/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong04.logic;

/**
 *
 * @author FPT
 */
public class FibonacciNumber {

    public FibonacciNumber() {
    }
    
    public int CalcFibo(int n){
        //dieu kien dung
        if(n == 1)
            return 0;
        if(n==2)
            return 1;
        //loi goi de quy
        return (CalcFibo(n-1)+CalcFibo(n-2));
    }
}
