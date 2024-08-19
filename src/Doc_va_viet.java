import java.io.*;
import java.util.Scanner;

public class Doc_va_viet {
    public static void write(String path, String text){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            bw.write(text);
            bw.newLine();
            System.out.println("da ghi xong");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void read(String file){
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String file = "kholuu.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap du lieu");
        String text = scanner.nextLine();
        write(file, text);
        System.out.println("tao doc day nay:");
        read(file);
    }
}
