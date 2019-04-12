package DanhSachSinhVien;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien extends SinhVien {
    List<SinhVien> list = new LinkedList<>();
    public void InputList(int n){
        for(int i=0;i<n;i++){
            SinhVien SV= new SinhVien();
            SV.Nhap();
            list.add(SV);
        }
    }
    public void OutputList(List<SinhVien> list){
        for(int i=0;i<list.size();i++){
            list.get(i).Xuat();
        }
    }
    public void SapXep(List<SinhVien> list){
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i).getDiem() <list.get(j).getDiem()){
                    SinhVien SV = new SinhVien();
                     SV=list.get(i);
                     list.set(i,list.get(j));
                     list.set(j,SV);
                }
            }
        }
    }
    public void TimKiem(List<SinhVien> list,String MaSinhVien){
        for(int i=0;i<list.size();i++){

        }
    }

    public static void main(String[] args) {
        QuanLySinhVien QL = new QuanLySinhVien();
        System.out.println("Bạn muốn nhập bao nhiêu sinh viên :");
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Nhập vào danh sách sinh viên :");
        QL.InputList(n);
        System.out.println("Danh sách sinh viên :");
        QL.OutputList(QL.list);
        System.out.println("Sắp xếp sinh viên theo điểm trung bình :");
        QL.SapXep(QL.list);
        QL.OutputList(QL.list);
    }

}
