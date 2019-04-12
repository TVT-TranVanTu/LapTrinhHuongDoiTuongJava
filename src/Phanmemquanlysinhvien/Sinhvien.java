package Phanmemquanlysinhvien;

import java.util.Scanner;

public class Sinhvien {

    private String Hoten;
    private int Namsinh;
    private String Diachi;
    private double Diem;
    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        this.Hoten = hoten;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.Namsinh = namsinh;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double diem) {
        this.Diem = diem;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        this.Diachi = diachi;
    }
    public Sinhvien(){

    }
    public Sinhvien(String Hoten,int Namsinh,String Diachi,double Diem){
        this.Hoten=Hoten;
        this.Namsinh=Namsinh;
        this.Diachi=Diachi;
        this.Diem=Diem;
    }
    public void nhap(){
        System.out.println("nhap vao ho va ten sinh vien :");
        Scanner sc= new Scanner(System.in);
        Hoten=sc.nextLine();
        System.out.println("nhap vao nam sinh :");
        Namsinh=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao dia chi :");
        Diachi=sc.nextLine();
        System.out.println("nhap vao diem trung binh :");
        Diem=Double.parseDouble(sc.nextLine());
    }
    public void Xuat(){
        System.out.println("Ho va ten :"+this.Hoten);
        System.out.println("Nam sinh :"+this.Namsinh);
        System.out.println("Dia chi :"+this.Diachi);
        System.out.println("Diem :"+this.Diem);
    }
}
