package Quanlynhanvien;

import java.util.Scanner;

public class Nhanvien extends Date{
    String Manhanvien;
    String Tennhanvien;
    Date Ngaynhanvaolam;
    String Gioitinh;
    Double Luong;

    public String getManhanvien() {
        return Manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        Manhanvien = manhanvien;
    }

    public String getTennhanvien() {
        return Tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        Tennhanvien = tennhanvien;
    }

    public Date getNgaynhanvaolam() {
        return Ngaynhanvaolam;
    }

    public void setNgaynhanvaolam(Date ngaynhanvaolam) {
        Ngaynhanvaolam = ngaynhanvaolam;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public Double getLuong() {
        return Luong;
    }

    public void setLuong(Double luong) {
        Luong = luong;
    }
    public Nhanvien(){

    }
    public Nhanvien(String Manhanvien,String Tennhanvien,Date Ngaynhanvaolam,String Gioitinh,Double Luong,int Ngay,int Thang ,int Nam){
        super(Ngay,Thang,Nam);
        this.Manhanvien=Manhanvien;
        this.Tennhanvien=Tennhanvien;
        this.Ngaynhanvaolam=Ngaynhanvaolam;
        this.Gioitinh=Gioitinh;
        this.Luong=Luong;
    }
    public void nhapthongtinnhanvien(){
        System.out.println("NHAP VAO THONG TIN NHAN VIEN :");
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao ma nhan vien :");
        Manhanvien=sc.nextLine();
        System.out.println("nhap vao ho ten nhan vien :");
        Tennhanvien=sc.nextLine();
        System.out.println("ngay nhap vao lam :");
        Ngaynhanvaolam.nhap();
        System.out.println("gioi tinh ");
        Gioitinh=sc.nextLine();
        System.out.println("nhap vao luong nhan vien :");
        Luong=Double.parseDouble(sc.nextLine());
    }
    public void xuatthongtinsinhvien(){
        System.out.println("THONG TIN NHAN VIEN :");
        System.out.println("Ma sinh vien :"+this.Manhanvien);
        System.out.println("Ten sinh vien :"+this.Tennhanvien);
        System.out.println("Gioi tinh :"+this.Gioitinh);
        System.out.println("Ngay nhan vao lam :"+this.Ngaynhanvaolam);
        System.out.println("Luong :"+this.Luong);
    }

}
