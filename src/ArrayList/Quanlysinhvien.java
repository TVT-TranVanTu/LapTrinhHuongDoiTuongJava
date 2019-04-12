package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlysinhvien {
    ArrayList<Sinhvien> arr = new ArrayList<Sinhvien>();
    public void SXList(ArrayList<Sinhvien> arrsv){
        for(int i=0;i<arrsv.size();i++){
            for(int j=0;j<arrsv.size();j++){
                if(arrsv.get(i).getNamsinh() < arrsv.get(j).getNamsinh()){
                    Sinhvien sv = new Sinhvien();
                    sv=arrsv.get(i);
                    arrsv .set(i,arrsv.get(j));
                    arrsv.set(j,sv);

                }
            }
        }
    }
    public void ShowList(ArrayList<Sinhvien> arr){
        for(int i=0;i<arr.size();i++){
            arr.get(i).xuat();
        }
    }
    public void InputList(int n){
        for(int i=0;i<n;i++){
            Sinhvien sv = new Sinhvien();
            sv.nhap();
            arr.add(sv);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao so sinh vien :");
        n= sc.nextInt();
        Quanlysinhvien sv=new Quanlysinhvien();
        System.out.println("nhap vao thong tin sinh vien :");
        sv.InputList(n);
        System.out.println("thong tin sinh vien :");
        sv.ShowList(sv.arr);
        System.out.println("sap xep sinh vien theo nam sinh :");
        sv.SXList(sv.arr);
        sv.ShowList(sv.arr);

    }
}
