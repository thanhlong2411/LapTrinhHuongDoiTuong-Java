/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FPT
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] a;
        //khoi tao
        //a= new int[4];
        //a[0] = 12;
        //a[1] = 9;
        //a[2] = 1;
        //a[3] = 15;
        
        //xuat du lieu
        //System.out.println(a.toString());
        //System.out.println(Arrays.toString(a));
        
        //int[] b = new int[] {1,3,-7,8,9,20};
        //System.out.println(Arrays.toString(b));
        //System.out.println("So Luong Phan Tu Cua Mang la " + b.length);
        
        //Scanner sc = new Scanner(System.in);
        //System.out.print("So luong phan tu cua mang n = ");
        //String input = sc.nextLine();
        //int n = Integer.parseInt(input);
        
        //int[] c = new int [n];
        //for(int i =0 ; i<n ; i++){
        //System.out.print("c["+ i +"] =" );
        //input = sc.nextLine();
        //c[i]= Integer.parseInt(input);
    //}
        //System.out.println("Gia Tri cua mang vua nhap la ");
        //System.out.println(Arrays.toString(c));
        
        //for(int i =0 ; i < c.length; i++){
             //System.out.print(c[i]+" ");
        //}
    
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong phan tu cua mang n = ");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        int [] c = new int[n];
        
        
        Random rnd = new Random();
        for (int i = 0;i < n ; i++){
           c[i] =  rnd.nextInt(1000);
        }
        
       System.out.println(Arrays.toString(c));
       
       //sap xep mang theo chieu tang dan
       Arrays.sort(c);
       System.out.println("Mang Sau Khi Xap xep Tang Dan La ");
       System.out.println(Arrays.toString(c));
       
       //tim kiem vet can
       System.out.print("Nhap Gia Tri Can Tim Kiem x =  ");
       input = sc.nextLine();
       int x = Integer.parseInt(input);
       
       
       

       //tim kiem nhi phan
       int index = Arrays.binarySearch(c, x);
       if(index<0){
           System.out.println("Khong Tim Thay ");
       }else{
           System.out.println("Tim thay tai vi tri thu " + index);
           
       }
       
       
       //int x = Integer.parseInt(input);
       
       //boolean flag = false;
       
       //for (int i = 0; i<c.length;i++){
           //if(c[i] == x){
               //System.out.println("Gia Tri Can Tim Kiem Co Trong Mang Tai Vi Tri " + i );
               //flag = true;
               //break;
           //}
       //}
       //if(!flag){
           //System.out.println("Gia Tri Can Tim Kiem Khong Co Trong Mang ");
       //}
       
       //int temp;
       //for(int i = 0; i<n-1;i++)
           //for(int j =i + 1; j<n; j++){
               //if(c[i] > c[j]){
                   //temp=c[j];
                   //c[i]=c[j];
                   //c[j]=temp;
               //}
           //}
       //System.out.println(Arrays.toString(c));
       Arrays.sort(c);
       //System.out.println(Arrays.toString(c));
       
    }

}
