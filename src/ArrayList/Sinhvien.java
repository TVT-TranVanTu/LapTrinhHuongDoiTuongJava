package ArrayList;

import java.util.Scanner;

public class Sinhvien {
    String Hoten;
    String Maso;
    int Namsinh;
    String Diachi;

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }

    public String getMaso() {
        return Maso;
    }

    public void setMaso(String maso) {
        Maso = maso;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
    public Sinhvien(){

    }
    public Sinhvien(String Hoten,String Maso,int Namsinh,String Diachi) {
        this.Hoten = Hoten;
        this.Maso=Maso;
        this.Namsinh=Namsinh;
        this.Diachi=Diachi;
    }
    public void nhap(){
        System.out.println("nhap vao ho va ten sinh vien :");
        Scanner sc= new Scanner(System.in);
        Hoten=sc.nextLine();
        System.out.println("nhap vao ma so sinh vien :");
        Maso=sc.nextLine();
        System.out.println("nhap vao nam sinh :");
        Namsinh=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao que quan :");
        Diachi=sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ho va ten :"+this.Hoten);
        System.out.println("Ma so :"+this.Maso);
        System.out.println("Nam sinh :"+this.Namsinh);
        System.out.println("Dia chi :"+this.Diachi);
    }
}
