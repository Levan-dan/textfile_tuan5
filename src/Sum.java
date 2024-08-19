import java.io.*;

public class Sum {
    public static void main(String[] args) {
        File file = new File("dulieu.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("tong la: " + sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
