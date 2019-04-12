package quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    ArrayList<Sinhvien> arr =new ArrayList<>();
   public void DSSV(ArrayList<Sinhvien> arrsv){
       for(int i=0;i<arrsv.size();i++){
           for(int j=0;j<arrsv.size();j++){
               if(arrsv.get(i).getDiem() < arrsv.get(j).getDiem()){
                   Sinhvien sv= new Sinhvien();
                   sv=arrsv.get(i);
                   arrsv.set(i,arrsv.get(j));
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
    public void inputList(int n){
        for(int i=0;i<n;i++) {
            Sinhvien sv = new Sinhvien();
            sv.nhap();
            arr.add(sv);
        }
    }
    public void sertSV(ArrayList<Sinhvien> arr , String Ten){
       int j=0;
       for(int i=0;i<arr.size();i++){
           if(arr.get(i).getTen().lastIndexOf(Ten)>=0){
               arr.get(i).xuat();
               j=1;
           }
       }
       if(j==0){
           System.out.println("khong tim thay sinh vien nay :");
       }
    }
    public static void main(String[] args) {
      List sv=new List();
       int n;
        System.out.println("nhap vao so sinh vien :");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("nhap vao thong tin sinh vien :");
        System.out.println();
        sv.inputList(n);
        System.out.println("thong tin sinh vien :");
        System.out.println();
        sv.ShowList(sv.arr);
        System.out.println("sap xep danh sach sinh vien theo diem tang dan:");
        System.out.println();
        sv.DSSV(sv.arr);
        sv.ShowList(sv.arr);
        String s;
        System.out.println("nhap vao thong tin sinh vien can tim :");
        s= sc.nextLine();
        sv.sertSV(sv.arr,s);
    }
}
