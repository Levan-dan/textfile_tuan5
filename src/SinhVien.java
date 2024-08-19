public class SinhVien {
//    Tạo lớp Sinh viên gồm mã sinh viên, tên sinh viên, điểm toán, điểm lý, điểm hoá.
//    Lớp gồm các phương thức khởi tạo, cặp setter/getter,
//    phương thức toString() trả về thông tin đầy đủ của sinh viên.

    private int maSinhVien;
    private String tenSinhVien;
    private double diemToan;
    private double diemLy;
    private double diemHoa;


    public SinhVien(){

    }
    public SinhVien(int maSinhVien, String tenSinhVien, double diemToan, double diemLy, double diemHoa){
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }


    public int getMaSinhVien(){
        return maSinhVien;
    }
    public String getTenSinhVien(){
        return tenSinhVien;
    }
    public double getDiemToan(){
        return diemToan;
    }
    public double getDiemLy(){
        return diemLy;
    }
    public double getDiemHoa(){
        return diemHoa;
    }
    public void setMaSinhVien(int maSinhVien){
        this.maSinhVien = maSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", tenSinhVien='" + tenSinhVien + '\'' +
                ", diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                '}';
    }
}
