package Quanlyhoadontiendien;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    ArrayList<Khachhangvietnam> arr=new ArrayList<>();
    public void InputList(int n){
        for(int i=0;i<n;i++){
            Khachhangvietnam VN= new Khachhangvietnam();
            VN.Nhap();
            arr.add(VN);
        }
    }
    public void OutputList(ArrayList<Khachhangvietnam> arr){
        for(int i=0;i<arr.size();i++){
            arr.get(i).xuat();
            arr.get(i).thongtin();
        }
    }
    ArrayList<Khachhangnuocngoai> arrKH=new ArrayList<>();
    public void InputList1(int n){
        for(int i=0;i<n;i++){
            Khachhangvietnam VN= new Khachhangvietnam();
            VN.Nhap();
            arr.add(VN);
        }
    }
    public void OutputList1(ArrayList<Khachhangnuocngoai> arr){
        for(int i=0;i<arr.size();i++){
            arr.get(i).xuat();
            arr.get(i).thongtin();
        }
    }
    public static void main(String[] args) {
        List LT= new List();
        Scanner sc = new Scanner(System.in);
        System.out.println("Khách hàng trong nước hay nước ngoài :");
        int Luachon;
        Luachon=sc.nextInt();
        if(Luachon !=1 || Luachon !=2){
            System.out.println("Lựa chọn không hợp lệ xin kiểm tra lại :");
            Luachon=sc.nextInt();
        }
        else if(Luachon==1) {
            System.out.println("Nhập vào số khách hàng Việt Nam :");
            int n;
            n = sc.nextInt();
            LT.InputList(n);
            LT.OutputList(LT.arr);
        }
        else{
            System.out.println("nhập vào số khách hàng nước ngoài :");
            int k;
            k=sc.nextInt();
            LT.InputList1(k);
            LT.OutputList1(LT.arrKH);
        }

    }
}