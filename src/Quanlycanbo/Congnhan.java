package Quanlycanbo;

import java.util.Scanner;

public class Congnhan extends Canbo {
    private String Baccongnhan;

    public String getBaccongnhan() {
        return Baccongnhan;
    }

    public void setBaccongnhan(String baccongnhan) {
        Baccongnhan = baccongnhan;
    }
    public Congnhan(){

    }
    public Congnhan(String Baccongnhan,String Hoten,String Namsinh,String Gioitinh,String Diachi){
        super(Hoten, Diachi, Namsinh, Gioitinh);
        this.Baccongnhan=Baccongnhan;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhập vào bậc công nhân :");
        Scanner sc= new Scanner(System.in);
        Baccongnhan=sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Bậc công nhân :"+this.Baccongnhan);
    }
}
