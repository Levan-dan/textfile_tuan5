import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LuuSinhVien  {

    public static boolean saveStudent(File file, SinhVien sinhVien){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(sinhVien.toString());
            bw.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("xay ra ngoai le, ghi that bai:");
            return false;
        }
    }

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien(1, "Hoang", 9.0, 8.0, 9.75);
        SinhVien sinhVien1 = new SinhVien(2, "Hoa", 10.0, 9.0, 9.0);
        File file = new File("sinhvien.txt");
        if(saveStudent(file, sinhVien)){
            System.out.println("da luu thong tin sinh vien thanh cong");

        }else{
            System.out.println("that bai khi luu thong tin");
        }
    }
}
