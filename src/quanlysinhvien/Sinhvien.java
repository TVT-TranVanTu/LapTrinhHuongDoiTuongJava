package quanlysinhvien;
/*Tạo một phần mềm quản lý sinh viên với các chức năng sau
        -	Nhập thông tin cho một danh sách các sinh viên
        -	Hiển thị thông tin các sinh viên có trong danh sách
        -	Sắp xếp sinh viên theo thứ từ cao đến thấp
        -	Tìm kiếm sinh viên theo tên
        Đối tượng sinh viên bao gồm các thuộc tính
        -	Tên
        -	Năm sinh
        -	Địa chỉ
        -	Điểm
        Yêu cầu thiết kế menu lựa chọn các chức năng
        -	Nhập thông tin sinh viên
        -	Hiển thị thông tin sinh viên
        -	Sắp xếp sinh viên
        -	Tìm kiếm sinh viên
        -	Thoát

*/

import java.util.Scanner;

public class Sinhvien {
    String Ten;
    int Namsinh;
    String Diachi;
    double Diem;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double diem) {
        Diem = diem;
    }

    public Sinhvien() {

    }
    public Sinhvien(String Ten,int Namsinh,String Diachi, double Diem) {
        this.Ten=Ten;
        this.Namsinh=Namsinh;
        this.Diachi=Diachi;
        this.Diem=Diem;

    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao Ho va ten :");
        Ten=sc.nextLine();
        System.out.println("nhap vao nam sinh :");
        Namsinh=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao dia chi / que quan :");
        Diachi=sc.nextLine();
        System.out.println("nhap vao diem :");
        Diem=Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Ho va ten :"+this.Ten);
        System.out.println("Nam sinh :"+this.Namsinh);
        System.out.println("Dia chi :"+this.Diachi);
        System.out.println("Diem :"+this.Diem);
    }
}
