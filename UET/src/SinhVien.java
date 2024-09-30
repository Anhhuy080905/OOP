public class SinhVien {
    private String namsinh, hoten, MSSV;

    public SinhVien(String namsinh, String hoten, String MSSV) {
        this.namsinh = namsinh;
        this.hoten = hoten;
        this.MSSV = MSSV;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
}
