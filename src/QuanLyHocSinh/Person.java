package QuanLyHocSinh;

import java.util.Scanner;

public class Person {
    private String HoTen;
    private String DiaChi;
    private int NamSinh;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
    public Person(){}
    public Person(String HoTen, String DiaChi,int NamSinh){
        this.HoTen=HoTen;
        this.NamSinh=NamSinh;
        this.DiaChi=DiaChi;
    }
    public void Nhap(){
        System.out.println("Nhập vào họ và tên học sinh :");
        Scanner sc = new Scanner(System.in);
        HoTen=sc.nextLine();
        System.out.println("Nhập vào năm sinh :");
        NamSinh = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào địa chỉ :");
        DiaChi=sc.nextLine();

    }
    public void Xuat(){
        System.out.println("Họ và tên :"+this.HoTen);
        System.out.println("Năm sinh :"+this.NamSinh);
        System.out.println("Địa chỉ :"+this.DiaChi);
    }
}
