/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

/**
 *
 * @author FPT
 */
public class TestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Long Lanh dau nuoc in troi \n Thanh xay khoi biec non phoi bong vang ";
        System.out.println(content);
        // thao tac 1: vi tri cua 1 ki tu
        System.out.println("Vi tri cua ki tu a trong chuoi la: " + content.indexOf('a'));
        System.out.println("Vi tri cua tu nuoc trong chuoi la: " + content.indexOf("nuoc"));
        // thao tac 2: kiem tra khoi dau va ket thuc
        System.out.println("Chuoi mo dang bang com tu Long: " + content.startsWith("Long"));
        System.out.println("Chuoi Ket thuc bang cum tu troi: " + content.endsWith("troi"));
        //thao tac 3: cat chuoi vao vi tri
        String temp = content.substring(21, 26);
        System.out.println("chuoi con la: "+ temp );
        //thao tac4: phan tach chuoi
        String[] result = content.split("\n");
        for(int i = 0; i<result.length;i++){
            System.out.println(result[i]);
        }
        //thao tac 5: loai bo khang trang dau - cuoi chuoi
        for(int i = 0; i<result.length;i++){
            System.out.println(result[i].trim());
        }
        
        //thao tac 6: thay the ky tu
        temp = content.replace("a", "z");
        System.out.println(temp);
        
        // thao tac7: chuyen kieu
        temp = content.toUpperCase();
        System.out.println(temp);
        temp= content.toLowerCase();
        System.out.println(temp);
        
        //thao tac 8: so sach chuoi
        temp = "Nguyen";
        if(temp.compareToIgnoreCase("Nguyen") == 0){
            System.out.println("2 Chuoi Bang Nhau");
            
        }else{
            System.out.println("2 Chuoi Bang Nhau");  
        }
        //thao tac 9: Noi CHuoi
        temp = temp.concat(" Van A");
        System.out.println(temp);
        
        //thao tac 10: truy xuat bang chi so
        for(int i = 0; i< temp.length();i++ ){
            System.out.print(temp.charAt(i));
            
        }
        System.out.println();
        
        //thao tac 11: Chuyen kieu
        temp = "155";
        int n = Integer.parseInt(temp);
        System.out.println("n = " + n);
        
        //thao tac 12: 
        StringBuilder sb = new StringBuilder();
        sb.append("Long lanh day nuoc in troi\n");
        sb.append("Thanh xay khoi biec non phoi bong vang");
        temp = sb.toString();
        System.out.println(sb);
        
    }
    
    
    }
