package Quanlyhoadontiendien;

import java.util.Scanner;

public class Khachhang {

    private String Makhachhang;
    private String Hoten;
    private String Ngayrahoadon;
    private double Soluong;
    private double Dongia;

    public String getMakhachhang() {
        return Makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        Makhachhang = makhachhang;
    }

    public double getSoluong() {
        return Soluong;
    }

    public void setSoluong(double soluong) {
        Soluong = soluong;
    }

    public String getNgayrahoadon() {
        return Ngayrahoadon;
    }

    public void setNgayrahoadon(String ngayrahoadon) {
        Ngayrahoadon = ngayrahoadon;
    }

    public double getDongia() {
        return Dongia;
    }

    public void setDongia(double dongia) {
        Dongia = dongia;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }


    public Khachhang(){

    }
    public Khachhang(String Makhachhang,String Hoten,String Ngayrahoadon,double Soluong,double Dongia){
        this.Makhachhang=Makhachhang;
        this.Hoten= Hoten;
        this.Dongia=Dongia;
        this.Ngayrahoadon=Ngayrahoadon;
        this.Soluong=Soluong;
    }
    public void Nhap(){
        System.out.println("Nhập vào mã khách hàng :");
        Scanner sc= new Scanner(System.in);
        Makhachhang=sc.nextLine();
        System.out.println("Mhập vào họ tên khách hàng :");
        Hoten=sc.nextLine();
        System.out.println("Nhập vào ngày ra hóa đơn :");
        Ngayrahoadon=sc.nextLine();
        System.out.println("Nhập vào số lượng KW :");
        Soluong=Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào đơn giá :");
        Dongia=Double.parseDouble(sc.nextLine());
    }
    public  void xuat(){
        System.out.println("Mã khách hàng :"+this.Makhachhang);
        System.out.println("Họ và tên :"+this.Hoten);
        System.out.println("Ngày ra hóa đơn :"+this.Ngayrahoadon);
        System.out.println("Số lượng :"+this.Soluong+"KW");
        System.out.println("Đơn giá :"+this.Dongia);
    }
    public double Thanhtien(){
        return 0;
    }
    public void thongtin(){
        System.out.println("Thành tiền :"+Thanhtien());
    }

}












