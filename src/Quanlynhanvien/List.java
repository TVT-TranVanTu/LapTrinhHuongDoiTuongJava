package Quanlynhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    ArrayList<Nhanvien> arr = new ArrayList<>();
    public void OutputList(ArrayList<Nhanvien> arrNV){
        for(int i=0;i<arrNV.size();i++){
            arrNV.get(i).xuatthongtinsinhvien();
        }
    }
    public void Input(int n){
        for(int i=0;i<n;i++){
            Nhanvien NV= new Nhanvien();
            NV.nhapthongtinnhanvien();
            arr.add(NV);
        }
    }

    public static void main(String[] args) {
        List NV =new List();
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("ban muon nhap vao bao nhieu nhan vien :");
        n=  sc.nextInt();
        NV.Input(n);
        NV.OutputList(NV.arr);

    }
}
