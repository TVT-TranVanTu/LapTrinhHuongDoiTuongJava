package Quanlycanbo;

import java.util.Scanner;

public class Canbo {
    /*
    Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
+ Mỗi cán bộ cần quản lý lý các thuộc tính: Họ tên, năm sinh, giới tính, địa
chỉ
+ Các công nhân cần quản lý: Bậc (công nhân bậc 3/7, bậc 4/7 ...)
+ Các kỹ sư cần quản lý: Ngành đào tạo
+ Các nhân viên phục vụ cần quản lý thông tin: công việc
1. Xây dựng các lớp NhanVien, CongNhan, KySu kế thừa từ lớp CanBo
2. Xây dựng các hàm để truy nhập, hiển thị thông tin và kiểm tra về các
thuộc tính của các lớp.
3. Xây dựng lớp QLCB cài đặt các phương thức thực hiện các chức năng sau:
- Nhập thông tin mới cho cán bộ
- Tìm kiếm theo họ tên
- Hiển thị thông tin về danh sách các cán bộ
- Thoát khỏi chương trình.
     */
    private String Hoten;
    private String Namsinh;
    private String Gioitinh;
    private String Diachi;

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(String namsinh) {
        Namsinh = namsinh;
    }
    public Canbo(){

    }
    public Canbo(String Hoten,String Diachi,String Namsinh,String Gioitinh){
        this.Diachi=Diachi;
        this.Hoten=Hoten;
        this.Gioitinh=Gioitinh;
        this.Namsinh=Namsinh;
    }
    public void Nhap(){
        System.out.println("Nhập vào họ và tên cán bộ :");
        Scanner sc= new Scanner(System.in);
        Hoten=sc.nextLine();
        System.out.println("Nhâp vào năm sinh :");
        Namsinh=sc.nextLine();
        System.out.println("Nhập vào giới tính :");
        Gioitinh=sc.nextLine();
        System.out.println("Nhập vào địa chỉ :");
        Diachi=sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Họ và tên :"+this.Hoten);
        System.out.println("Ngày tháng năm sinh :"+this.Namsinh);
        System.out.println("Giới tính :"+this.Gioitinh);
        System.out.println("Địa chỉ :"+this.Diachi);
    }
}
