import java.sql.SQLOutput;

public class QLNS {
    GiangVien giangVien;
    SinhVien sinhVien;
    PerSon perSon;

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public PerSon getPerSon() {
        return perSon;
    }

    public void setPerSon(PerSon perSon) {
        this.perSon = perSon;
    }

    public static void main(String[] args) {
        QLNS qlns = new QLNS();
        qlns.setGiangVien(new GiangVien("2001", "Nguyen Van A"));
        qlns.setSinhVien(new SinhVien("2005", "Nguyen Van B", "23000001"));
        qlns.setPerSon(new PerSon("2000", "Nguyen Van C"));
        System.out.println(qlns.getGiangVien().getHoten() + " " + qlns.getGiangVien().getNamsinh());
        System.out.println(qlns.getSinhVien().getHoten() + " " + qlns.getSinhVien().getNamsinh() + " " + qlns.getSinhVien().getMSSV());
        System.out.println(qlns.getPerSon().getHoten() + " " + qlns.getPerSon().getNamsinh());
    }
}
