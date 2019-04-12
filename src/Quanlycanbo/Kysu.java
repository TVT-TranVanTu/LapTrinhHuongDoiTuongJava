package Quanlycanbo;

import java.util.Scanner;

public class Kysu extends Canbo {
    private String Nganhdaotao;

    public String getNganhdaotao() {
        return Nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        Nganhdaotao = nganhdaotao;
    }
    public Kysu(){

    }
    public Kysu(String Nganhdaotao,String Hoten,String Gioitinh,String Diachi,String Namsinh){
        super(Hoten, Diachi, Namsinh, Gioitinh);
        this.Nganhdaotao=Nganhdaotao;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhập vào ngành đào tạo :");
        Scanner sc = new Scanner(System.in);
        Nganhdaotao=sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Ngành đào tạo :"+this.Nganhdaotao);
    }
}
