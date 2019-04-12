package QuanLyHocSinh;

import java.util.Scanner;

public class HocSinh extends Person{
    private String MaHocSinh;
    private String Lop;
    private double DiemTrungBinh;


    public String getMaHocSinh() {
        return MaHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        MaHocSinh = maHocSinh;
    }

    public double getDiemTrungBinh() {
        return DiemTrungBinh;
    }
    public void setDiemTrungBinh(double diemTrungBinh) {
        DiemTrungBinh = diemTrungBinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public HocSinh(){

    }
    public HocSinh(String MaSinhVien,String Lop,double DiemTrungBinh,String HoTen,String DiaChi,int NamSinh){
        super(HoTen, DiaChi, NamSinh);
        this.MaHocSinh=MaSinhVien;
        this.DiemTrungBinh=DiemTrungBinh;
        this.Lop=Lop;
    }
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.println("Nhập vào mã học sinh :");
        Scanner sc = new Scanner(System.in);
        MaHocSinh=sc.nextLine();
        System.out.println("Nhập vào lớp học :");
        Lop=sc.nextLine();
        System.out.println("Nhập vào điểm trung bình :");
        DiemTrungBinh=Double.parseDouble(sc.nextLine());
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Mã học sinh :"+this.MaHocSinh);
        System.out.println("Điểm trung bình :"+this.DiemTrungBinh);
        System.out.println("Lớp :"+this.Lop);
    }

}
