public class SinhVien extends Uet {
    private String MSSV;

    public SinhVien(String namsinh, String hoten, String MSSV) {
        super(namsinh, hoten);
        this.MSSV = MSSV;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
}
