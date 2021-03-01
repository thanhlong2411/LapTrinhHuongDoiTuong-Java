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
public class PhuongTrinhBac2 implements PhuongTrinhInterface{
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private String Ketqua;

    public PhuongTrinhBac2() {
    }

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void GiaiPhuongTrinh() {
        if(a == 0){
            //giai phuong trinh bac 1
            PhuongTrinhBac1 ptb1 = new PhuongTrinhBac1(b , c);
            ptb1.GiaiPhuongTrinh();
            Ketqua = ptb1.getKetqua();
            
        }
        else{
            double delta = b*b - 4*a*c;
            if(delta < 0){
                Ketqua = "Phuong Trinh Bac 2 Vo Nghiem" ;
            }
            else{
                if(delta == 0){
                    x1 = -b/(2*a);
                    Ketqua = "Phuong Trinh Co Nghiem Kep La" + x1;
                }
                else{
                    x1 = (-b + Math.sqrt(delta))/(2*a);
                    x2 = (-b - Math.sqrt(delta))/(2*a);
                    
                    Ketqua = "Phuong Trinh Co 2 Nghiem Phan Biet: x1 = " + x1 +
                            "; va x2 = " + x2;
                }
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public String getKetqua() {
        return Ketqua;
    }

    public void setKetqua(String Ketqua) {
        this.Ketqua = Ketqua;
    }
    
}
