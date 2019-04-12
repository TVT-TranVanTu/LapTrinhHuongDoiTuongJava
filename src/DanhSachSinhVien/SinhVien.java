package DanhSachSinhVien;

import java.util.Scanner;

public class SinhVien {
    private String HoTen;
    private String MaSinhVien;
    private int Tuoi;
    private String DiaChi;
    private double Diem;


    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double diem) {
        Diem = diem;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }
    public SinhVien(){

    }
    public SinhVien(String HoTen,String MaSinhVien,int Tuoi,String DiaChi,double Diem){
        this.DiaChi=DiaChi;
        this.Diem=Diem;
        this.HoTen=HoTen;
        this.MaSinhVien=MaSinhVien;
        this.Tuoi=Tuoi;
    }
    public void  Nhap(){
        System.out.println("Nhập vào họ và tên sinh viên :");
        Scanner sc = new Scanner(System.in);
        HoTen=sc.nextLine();
        System.out.println("Nhập vào tuổi :");
        Tuoi= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào mã sinh viên :");
        MaSinhVien= sc.nextLine();
        System.out.println("Nhập vào địa chỉ :");
        DiaChi= sc.nextLine();
        System.out.println("Nhập vào điểm trung bình :");
        Diem=Double.parseDouble(sc.nextLine());
    }
    public void Xuat(){
        System.out.println("Họ và tên :"+this.HoTen);
        System.out.println("Tuổi :"+this.Tuoi);
        System.out.println("Mã sinh viên :"+this.MaSinhVien);
        System.out.println("Địa chỉ :"+this.DiaChi);
        System.out.println("Điểm trung bình :"+this.Diem);
    }
}
