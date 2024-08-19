import java.io.*;
import java.util.Scanner;

public class HamDocViet {
    public static void readFile(File myFile) throws FileNotFoundException {
        try(BufferedReader br = new BufferedReader(new FileReader(myFile))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("xay ra ngoai le");
        }
    }



     static boolean writeFile(File myFile ) throws IOException {
         Scanner scanner = new Scanner(System.in);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(myFile))){
            String input;
            while (true){
                input = scanner.nextLine();
                if(input.equalsIgnoreCase("x")){
                    break;
                }else {
                    bw.write(input);
                    bw.newLine();
                }
            }
           return true;


        }catch (IOException e){
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
            return false;
        }

     }

    public static void main(String[] args) throws IOException {
        File file = new File("lopfile.txt");
        writeFile(file);
        readFile(file);

    }
}
