import java.io.*;
import java.util.Scanner;

public class SumVip {
    public static void write(String path) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String input;
            System.out.println("Moi nhap so can tinh tong");
            while (true) {
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    try {
                        Integer.parseInt(input);
                        bw.write(input);
                        bw.newLine();
                    } catch (NumberFormatException e) {
                        System.out.println("vui long nhap so");
                    }
                }
            }
        } catch (IOException e1) {
            System.out.println("co loi roi ban");
        }
    }


    static void read(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int sum = 0;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                } catch (NumberFormatException nf) {
                    System.out.println("Loi :" + nf.getMessage());
                }

            }
            System.out.println("tong cac so trong file la: " + sum);
        } catch (IOException e) {
            System.out.println("loi khac roi");
        }

    }


    public static void main(String[] args) throws IOException {
        String file = "dulieu.txt";
//        write(file);
        read(file);
    }

}