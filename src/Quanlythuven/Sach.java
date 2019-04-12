package Quanlythuven;

import java.util.Scanner;

public class Sach {
    String Maso;
    String Tensach;
    int Namsuatban;
    int Soquyen;
    boolean Tinhtrang;

    public String getMaso() {
        return Maso;
    }

    public void setMaso(String maso) {
        Maso = maso;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String tensach) {
        Tensach = tensach;
    }

    public int getNamsuatban() {
        return Namsuatban;
    }

    public void setNamsuatban(int namsuatban) {
        Namsuatban = namsuatban;
    }

    public int getSoquyen() {
        return Soquyen;
    }

    public void setSoquyen(int soquyen) {
        Soquyen = soquyen;
    }

    public boolean isTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(boolean tinhtrang) {
        Tinhtrang = tinhtrang;
    }

    public Sach(){

    }

    public Sach(String Maso, String Tensach, int Namxuatban, int Soquyen, boolean Tinhtrang){
        this.Maso=Maso;
        this.Namsuatban=Namxuatban;
        this.Tensach=Tensach;
        this.Tinhtrang=Tinhtrang;
        this.Soquyen=Soquyen;
    }
    public void nhap(){
        System.out.println("NHAP VAO THONG TIN :");
        System.out.println("Nhap vao ma so sach :");
        Scanner sc= new Scanner(System.in);
        Maso=sc.nextLine();
        System.out.println("Nhap vao nam xuat ban :");
        Namsuatban=Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao ten sach :");
        Tensach= sc.nextLine();
        System.out.println("Nhap vao so quyen :");
        Soquyen=Integer.parseInt(sc.nextLine());
        System.out.println("Tinh trang :");
        Tinhtrang=sc.hasNext();

    }
    public void xuat(){
        System.out.println("THONG TIN SACH :");
        System.out.println("Ma so :"+this.Maso);
        System.out.println("Ten sach :"+this.Tensach);
        System.out.println("Nam xuat ban :"+this.Namsuatban);
        System.out.println("So quyen :"+this.Soquyen);
        if(Tinhtrang==true){
            System.out.println("Con sach :");
        }
        else{
            System.out.println("Khong con sach :");
        }
    }
}
