package dientichcachinh;

public class List {
    public static void main(String[] args) {
        Hinhchunhat HCN = new Hinhchunhat();
        HCN.setChieudai(6);
        HCN.setChieurong(5);
        System.out.println("Chiều dài :"+HCN.getChieudai());
        System.out.println("chiều rộng :"+HCN.getChieurong());
        HCN.Inthongtin();
        Tamgiac TG=new Tamgiac();
        TG.setCanhday(5.5);
        TG.setChieucao(2);
        System.out.println("Chiều cao :"+TG.getChieucao());
        System.out.println("Cạnh đáy :"+TG.getCanhday());
        TG.Inthongtin();
    }
}
