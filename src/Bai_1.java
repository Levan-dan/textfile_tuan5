import java.io.*;
import java.util.Scanner;

public class Bai_1 {

        public static void main(String[] args) {
                File file = new File("dulieu.txt");
                System.out.println("Đường dẫn tuyệt đối của file: " + file.getAbsolutePath()); // Kiểm tra đường dẫn tuyệt đối của file

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                        bw.write("1");
                        bw.newLine();
                        bw.write("2");
                        bw.newLine();
                        bw.write("3");
                        System.out.println("Đã ghi thành công");
                } catch (IOException e) {
                        System.out.println("Lỗi khi ghi file: " + e.getMessage());
                }
        }

//        FileWriter fw = new FileWriter(file);
//        fw.write("hello");
//        fw.write("\n");
//        fw.write("ban co khoe khong");
//        System.out.println("da ghi thanh cong");
//        fw.close();
        }




