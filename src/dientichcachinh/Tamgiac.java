package dientichcachinh;

public class Tamgiac extends Tinhtoan{
    private double Chieucao;
    private double Canhday;
    public double getChieucao() {
        return Chieucao;
    }

    public void setChieucao(double chieucao) {
        Chieucao = chieucao;
    }

    public double getCanhday() {
        return Canhday;
    }

    public void setCanhday(double canhday) {
        Canhday = canhday;
    }
    public Tamgiac(){

    }

    public Tamgiac(double chieucao,double Canhday) {
        this.Chieucao = chieucao;
        this.Canhday=Canhday;
    }

    @Override
    public double Dientich() {
        return (Chieucao*Canhday)/2;
    }

    @Override
    public void Inthongtin() {
        super.Inthongtin();
    }
}
