package Quanlynhanvien;

import java.util.Scanner;

/*
Viết ứng dụng quản lý có mvị tí menu thực hiện các phương thức trong lớp list .
Khai báo lớp list gồm :
-	Hiển thị danh sách các đối tượng
-	Thêm đối tượng (đầu mảng ,cuối mảng&vị trí bất kỳ)
-	Cập nhật thông tin đối tượng
-	Xóa đối tượng (đầu mảng , cuối mảng ,vị trí bất kỳ)
-	Tìm kiếm đối tượng theo một theo một thuộc tính bất kỳ
-	Sắp xếp mảng các đối tượng theo thuộc tính bất kỳ
Lớp Date (ngày tháng năm)
Lớp Nhanvien
-	Mã nhân viên
-	Tên nhân viên
-	Ngày nhận vào làm việc
-	Giới tính bool :true – nữ , false – nam
-	Lương double

 */
public class Date {
    int Ngay;
    int Thang;
    int Nam;

    public int getNgay() {
        return Ngay;
    }

    public void setNgay(int ngay) {
        Ngay = ngay;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int thang) {
        Thang = thang;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int nam) {
        this.Nam = nam;
    }
    public Date(){

    }
    public Date(int Ngay,int Thang,int Nam){
        this.Ngay=Ngay;
        this.Thang=Thang;
        this.Nam=Nam;
    }
    public void nhap(){
        System.out.println("nhap vao ngay sinh :");
        Scanner sc= new Scanner(System.in);
        Ngay=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao thang sinh :");
        Thang=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao nam sinh :");
        Nam=Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        System.out.println("ngay/"+this.Ngay+"thang/"+this.Thang+"Nam"+this.Nam);
    }
}
