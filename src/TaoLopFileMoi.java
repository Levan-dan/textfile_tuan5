import java.io.File;
import java.io.IOException;

public class TaoLopFileMoi {
    public static void main(String[] args) {
        File file = new File("lopfile.txt");
        try {
            if (file.exists()) {
                System.out.println("file da ton tai");
                System.out.println("nguon :" + file.getAbsolutePath());
            } else {
                file.createNewFile();
                System.out.println("file da duoc tao: " + file.getAbsolutePath());
            }

            if (file.isDirectory()) {
                System.out.println("file la thu muc");
            } else {
                System.out.println("file khong phai thu muc");
            }


        } catch (IOException e) {
            System.out.println("co loi roi");
        }
    }
}

