package ArrayList2;

import java.util.Scanner;

public class SinhVien2 {

        String name;
        int tuoi;
        String diachi;
        float DiemTrungBinh;

        public String getDiachi() {
            return diachi;
        }

        public void setDiachi(String diachi) {
            this.diachi = diachi;
        }

        public float getDiemTrungBinh() {
            return DiemTrungBinh;
        }

        public void setDiemTrungBinh(float diemTrungBinh) {
            DiemTrungBinh = diemTrungBinh;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public SinhVien2(){

        }
        public SinhVien2(String name,int tuoi,String diachi,Float DiemTrungBinh){
            this.name=name;
            this.tuoi=tuoi;
            this.diachi=diachi;
            this.DiemTrungBinh=DiemTrungBinh;

        }

        public void Nhap(){
            System.out.println("nhâp vào họ và tên sinh viên :");
            Scanner sc=new Scanner(System.in);
            name=sc.nextLine();
            System.out.println("nhập vào tuổi :");
            tuoi=Integer.parseInt(sc.nextLine());
            System.out.println("nhập vào dịa chỉ:");
            diachi=sc.nextLine();
            System.out.println("nhập vào điểm trung bình:");
            DiemTrungBinh=Float.parseFloat(sc.nextLine());

        }

        public void Xuat(){
            System.out.println("Họ và tên:"+this.name);
            System.out.println("Tuổi:"+this.tuoi);
            System.out.println("Địa chỉ:"+this.diachi);
            System.out.println("Điểm trung bình:"+this.DiemTrungBinh);
        }
    }
}

}
