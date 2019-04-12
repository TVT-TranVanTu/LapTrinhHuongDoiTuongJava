package Quanlyhoadontiendien;

import java.util.Scanner;

public class Khachhangvietnam extends Khachhang{
    private  String Doituongkhachhang;
    private double Dinhmuc;

    public String getDoituongkhachhang() {
        return Doituongkhachhang;
    }

    public void setDoituongkhachhang(String doituongkhachhang) {
        Doituongkhachhang = doituongkhachhang;
    }

    public double getDinhmuc() {
        return Dinhmuc;
    }

    public void setDinhmuc(double dinhmuc) {
        Dinhmuc = dinhmuc;
    }

    public Khachhangvietnam(){

    }
    public Khachhangvietnam(String Makhachhang,String Hoten,String Ngayrahoadon,double Soluong,double Dongia,String Doituongkhachhang,double Dinhmuc){
        super(Makhachhang, Hoten, Ngayrahoadon, Soluong, Dongia);
        this.Dinhmuc=Dinhmuc;
        this.Doituongkhachhang=Doituongkhachhang;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhập vao định mức :");
        Scanner sc= new Scanner(System.in);
        Dinhmuc=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào đối tượng khách hàng :");
        Doituongkhachhang = sc.nextLine();
        if(Doituongkhachhang !="sinhhoat" || Doituongkhachhang !="kinhdoanh" || Doituongkhachhang !="sanxuat"){
            System.out.println("Đối tượng khách hàng không hợp lệ mời nhập lại :");
            Doituongkhachhang=sc.nextLine();
        }
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Định mức :"+this.Dinhmuc);
        System.out.println("Đối tượng khách hàng :"+this.Doituongkhachhang);
    }
    @Override
    public double Thanhtien(){
        if(super.getSoluong()<=Dinhmuc){
            return super.getSoluong()*super.getDongia();
        }
        return super.getSoluong()*super.getDongia()*Dinhmuc+super.getSoluong()*super.getDongia()*2.5;
    }
}
