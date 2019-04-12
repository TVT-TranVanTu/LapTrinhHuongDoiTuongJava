package Quanlyhoadontiendien;

import Phanmemquanlysinhvien.Quanlysinhvien;

import java.util.Scanner;

public class Khachhangnuocngoai extends Khachhang {
    private String Quactich;

    public String getQuactich() {
        return Quactich;
    }

    public void setQuactich(String quactich) {
        Quactich = quactich;
    }
    public Khachhangnuocngoai(){

    }
    public Khachhangnuocngoai(String Quactich,String Makhachhang,String Hoten,String Ngayrahoadon,double Soluong,double Dongia){
        super(Makhachhang, Hoten, Ngayrahoadon, Soluong, Dongia);
        this.Quactich=Quactich;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhập vào quấc tịch khách hàng :");
        Scanner sc= new Scanner(System.in);
        Quactich=sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("quấc tịch :"+this.Quactich);
    }

    @Override
    public double Thanhtien() {
        return super.getSoluong()*getDongia();
    }
}
