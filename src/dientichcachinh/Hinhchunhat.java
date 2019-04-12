package dientichcachinh;

public class Hinhchunhat extends Tinhtoan {
    private double Chieudai;
    private double Chieurong;

    public double getChieudai() {
        return Chieudai;
    }

    public void setChieudai(double chieudai) {
        Chieudai = chieudai;
    }

    public double getChieurong() {
        return Chieurong;
    }

    public void setChieurong(double chieurong) {
        Chieurong = chieurong;
    }
    public Hinhchunhat(){

    }
    public Hinhchunhat(double Chieudai,double Chieurong) {
        this.Chieudai = Chieudai;
        this.Chieurong=Chieurong;
    }

    @Override
    public double Dientich() {
        return Chieudai*Chieurong;
    }

    @Override
    public void Inthongtin() {
        super.Inthongtin();
    }
}
