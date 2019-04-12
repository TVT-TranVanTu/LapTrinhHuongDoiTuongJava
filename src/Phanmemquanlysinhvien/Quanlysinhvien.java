package Phanmemquanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlysinhvien  {
    ArrayList<Sinhvien> arr=new ArrayList<>();
    public void Sapxep(ArrayList<Sinhvien> arrSV){
        for(int i=0;i<arrSV.size();i++){
            for(int j=0;j<arrSV.size();j++){
                if(arrSV.get(i).getDiem()<arrSV.get(j).getDiem()){
                    Sinhvien SV= new Sinhvien();
                    SV=arrSV.get(i);
                    arrSV.set(i,arrSV.get(j));
                    arrSV.set(j,SV);
                }
            }
        }
    }
    public void InputList(int n){
        Sinhvien SV= new Sinhvien();
        for(int i=0;i<n;i++){
            SV.nhap();
            arr.add(SV);
        }
    }
    public void OutputList(ArrayList<Sinhvien> arr){
        for(int i=0;i<arr.size();i++){
            arr.get(i).Xuat();
        }
    }

    public static void main(String[] args) {
        Quanlysinhvien sv = new Quanlysinhvien();
        System.out.println("ban muon nhap vao bao nhieu sinh vien :");
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.println("NHAP THONG TIN SINH VIEN :");
        sv.InputList(n);
        System.out.println("THONG TIN SINH VIEN :");
        sv.OutputList(sv.arr);
        System.out.println("SẮP XẾP SINH VIÊN THEO ĐIỂM :");
        sv.Sapxep(sv.arr);
        sv.OutputList(sv.arr);

    }
}
