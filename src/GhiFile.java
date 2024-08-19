import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GhiFile {
    public static void write(String filePath) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fw = new FileWriter(new File(filePath))) {
            String input;
            System.out.println("Moi ban nhap du lieu");
            try {
                while (true) {
                    input = scanner.nextLine();

                    if (input.equalsIgnoreCase("end")) {
                        break;
                    } else {
                        fw.write(input);
                        fw.write("\n");
                    }
                }
            } catch (IOException e) {
                System.out.println("loi roi kia");
            }

        }
    }

    public static void main(String[] args) throws IOException {
        String file = "kholuu.txt";
        write(file);

    }
}