package Quanlycanbo;

import java.util.Scanner;

public class Nhanvien extends Canbo {
    private String Congviec;

    public String getCongviec() {
        return Congviec;
    }

    public void setCongviec(String congviec) {
        Congviec = congviec;
    }
    public Nhanvien(){

    }
    public Nhanvien(String Hoten,String Diachi,String Gioitinh,String Namsinh,String Congviec){
        super(Hoten, Diachi, Namsinh, Gioitinh);
        this.Congviec=Congviec;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhập vào công việc :");
        Scanner sc = new Scanner(System.in);
        Congviec=sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Công việc :"+this.Congviec);
    }
}
