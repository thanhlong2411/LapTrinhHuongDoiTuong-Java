/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong02.logiclayer;

/**
 *
 * @author FPT
 */
public class PhuongTrinhBac1 implements PhuongTrinhInterface {
    private double a;
    private double b;
    private double nghiem_x;
    private String Ketqua;

    public PhuongTrinhBac1() {
    }

    public PhuongTrinhBac1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void GiaiPhuongTrinh() {
        if(a != 0){
            nghiem_x = -b/a;
            Ketqua = "Phuong Trinh Bac 1 Co Nghiem La " + nghiem_x;
        }
        else{
            if(b != 0){
                Ketqua = "Phuong Trinh Bac 1 Vo Nghiem ";
                
            }
            else{
                Ketqua ="Phuong Trinh Bac 1 Co Vo So Nghiem ";
            }
            
        }

    }

    @Override
    public String toString() {
        if(Ketqua == null || Ketqua.isEmpty()){
            GiaiPhuongTrinh();
        }
        return Ketqua;
        
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getNghiem_x() {
        return nghiem_x;
    }

    public void setNghiem_x(double nghiem_x) {
        this.nghiem_x = nghiem_x;
    }

    public String getKetqua() {
        return Ketqua;
    }

    public void setKetqua(String Ketqua) {
        this.Ketqua = Ketqua;
    }
    
    
    
    
 }
    
    
