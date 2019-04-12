package QuanLyHocSinh;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    List<HocSinh> list = new LinkedList<>();
    public void nhap(int n){
        for(int i=0;i<n;i++){
            HocSinh HS = new HocSinh();
            HS.Nhap();
            list.add(HS);
        }
    }
    public void xuat(List<HocSinh> list ){
        for(int i=0;i<list.size();i++){
            System.out.println("Học sinh thứ "+i);
            list.get(i).Xuat();
        }
    }
    public void SapXep(List<HocSinh> list){
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i).getDiemTrungBinh()<list.get(j).getDiemTrungBinh()){
                    HocSinh HS = new HocSinh();
                    HS=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,HS);
                }
            }
        }
    }
    public void TimKiem(List<HocSinh> list,String MaHocSinh){
        int j=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMaHocSinh().lastIndexOf(MaHocSinh)>=0){
                list.get(i).Xuat();
                j=1;
            }
            }
         if(j==0){
            System.out.println("không tìm thấy học sinh này");
        }
    }
    public static void main(String[] args) {
        QuanLy QL = new QuanLy();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu học sinh :");
        int n= sc.nextInt();
        System.out.println("NHẬP DANH SÁCH HỌC SINH :");
        QL.nhap(n);
        System.out.println("DANH SÁCH HỌC SINH :");
        QL.xuat(QL.list);
        System.out.println("SẮP XẾP HỌC SINH VIÊN THEO ĐIỂM TRUNG BÌNH :");
        QL.SapXep(QL.list);
        QL.xuat(QL.list);
        System.out.println("TÌM KIẾM SINH VIÊN :");
        System.out.println("nhập vào học sinh muốn tìm :");
        String Ma;
        Ma= sc.nextLine();
        QL.TimKiem(QL.list,Ma);
    }
}
